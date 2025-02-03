-- Ejercicios  Subconsultas All y Any

-- Encuentra los nombres de los clientes que han realizado compras de productos con un precio superior a la media de precios de todos los productos.
SELECT c.nombre "Nombre del Cliente" FROM clientes c
WHERE c.id = ANY (
    SELECT DISTINCT v.cliente_id
    FROM ventas v
    WHERE v.precio_unitario > (
        SELECT AVG(precio)
        FROM productos
    )
);

-- Encuentra los empleados cuyo salario sea mayor que al menos uno de los salarios de los empleados del departamento de "Ventas".
SELECT CONCAT(e.nombre, " ", e.apellido) "Nombre del Empleado"
FROM empleados e
WHERE e.salario > ANY (
SELECT salario
FROM empleados e2
INNER JOIN departamentos d ON e2.departamento_id = d.id
WHERE d.nombre = "Ventas"
);

-- Encuentra los productos cuyos precios sean mayores que todos los precios de los productos con la palabra "Móvil" en su nombre.
SELECT * FROM productos
WHERE precio > ALL (
    SELECT precio 
    FROM productos
    WHERE nombre LIKE '%Móvil%'
);

-- Muestra la información de los clientes que realizaron la compra con el monto total más alto, incluyendo su nombre, dirección y el monto total de compra.
SELECT c.nombre, c.direccion, v.monto_total
FROM clientes c
INNER JOIN ventas v ON c.id = v.cliente_id
WHERE v.monto_total = ANY (
    SELECT monto_total
    FROM ventas
    WHERE monto_total = (
        SELECT MAX(monto_total)
        FROM ventas
    )
);

-- Para cada departamento, encuentra el empleado con el salario más alto. Muestra el nombre del departamento junto con el nombre del empleado y su salario
SELECT d.nombre AS departamento, e.nombre AS empleado, e.salario
FROM departamentos d
INNER JOIN empleados e ON d.id = e.departamento_id
WHERE e.salario = (
    SELECT MAX(salario)
    FROM empleados
    WHERE departamento_id = d.id
);

-- Encuentra los empleados que ganan más que el salario promedio de los empleados del departamento de "Contabilidad".
SELECT e.*
FROM empleados e
INNER JOIN departamentos d ON e.departamento_id = d.id
WHERE e.salario > (
    SELECT AVG(e2.salario)
    FROM empleados e2
    INNER JOIN departamentos d2 ON e2.departamento_id = d2.id
    WHERE d2.nombre = "Contabilidad"
);

-- Encuentra los productos que tienen un precio superior al precio de al menos uno de los productos vendidos al cliente con nombre "Juan Pérez".
SELECT p.*
FROM productos p
WHERE p.precio > ANY (
    SELECT precio_unitario
    FROM ventas v
    INNER JOIN clientes c ON v.cliente_id = c.id
    WHERE c.nombre = "Juan Pérez"
);

-- Encuentra los departamentos en los que al menos hay un empleado menor de 30 años.
SELECT d.nombre
FROM departamentos d
WHERE d.id = ANY (
    SELECT e.departamento_id
    FROM empleados e
    WHERE e.edad < 30
);

-- Muestra la información del empleado más joven, que esté entre los 3 empleados con más cantidad de productos vendidos, incluyendo su nombre, apellido y edad.
CREATE TEMPORARY TABLE top_3_empleados_con_mas_productos_vendidos (
    SELECT empleado_id FROM ventas
    GROUP BY empleado_id 
    ORDER BY SUM(cantidad) DESC 
    LIMIT 3
);
SELECT nombre, apellido, edad
FROM empleados
WHERE id = ANY (
    SELECT empleado_id FROM top_3_empleados_con_mas_productos_vendidos)
ORDER BY edad
LIMIT 1;

-- Para cada cliente, encuentra el empleado que realizó la venta con el monto total más alto. Muestra el nombre del cliente junto con el nombre del empleado y el monto total.
SELECT c.nombre AS cliente, CONCAT(e.nombre, ' ', e.apellido) AS empleado, v.monto_total
FROM clientes c
INNER JOIN ventas v ON c.id = v.cliente_id
INNER JOIN empleados e ON v.empleado_id = e.id
WHERE v.monto_total = (
    SELECT MAX(monto_total)
    FROM ventas
    WHERE cliente_id = c.id
);

-- Ejercicios  Complementarios

-- Encuentra los clientes que no han realizado ninguna compra. Muestra el nombre y la dirección de estos clientes.
SELECT nombre, direccion
FROM clientes
WHERE id <> ALL (
    SELECT cliente_id
    FROM ventas
);

-- Muestra el nombre de los productos que se han vendido más veces que cualquier producto con un precio superior a 500.
SELECT nombre
FROM productos
WHERE id = ANY (
    SELECT producto_id
    FROM ventas
    GROUP BY producto_id
    HAVING COUNT(*) > ALL (
        SELECT COUNT(producto_id)
        FROM ventas
        WHERE precio_unitario > 500
        GROUP BY producto_id
    )
);

-- Encuentra los empleados cuya edad sea menor que la edad de al menos un empleado del departamento de "Recursos Humanos".
SELECT e.*
FROM empleados e
WHERE e.edad < ANY (
    SELECT edad
    FROM empleados e2
    INNER JOIN departamentos d ON e2.departamento_id = d.id
    WHERE d.nombre = "Recursos Humanos"
);

-- Encuentra los productos cuyos precios sean menores o iguales a todos los precios de los productos con la palabra "Cámara" en su nombre.
SELECT * FROM productos
WHERE precio <= ALL (
    SELECT precio 
    FROM productos
    WHERE nombre LIKE '%Cámara%'
);

-- Muestra el nombre y el salario de los empleados con salarios superiores al promedio de salarios de todos los empleados.
SELECT nombre, salario
FROM empleados
WHERE salario > (
    SELECT AVG(salario)
    FROM empleados
);

-- Encuentra el nombre y el salario de los empleados con salarios inferiores al promedio de salarios de todos los empleados del departamento de "Ventas".
SELECT nombre, salario
FROM empleados
WHERE salario < (
    SELECT AVG(salario)
    FROM empleados e
    INNER JOIN departamentos d ON e.departamento_id = d.id
    WHERE d.nombre = "Ventas"
);

-- Encuentra los clientes que han realizado compras de productos con un precio_unitario inferior al precio promedio de todos los productos.
SELECT c.nombre
FROM clientes c
WHERE c.id = ANY (
    SELECT DISTINCT v.cliente_id
    FROM ventas v
    WHERE v.precio_unitario < (
        SELECT AVG(precio)
        FROM productos
    )
);  

-- Encuentra los empleados que tienen un salario igual al salario de al menos un empleado del departamento de "Recursos Humanos".
SELECT e.*
FROM empleados e
WHERE e.salario = ANY (
    SELECT salario
    FROM empleados e2
    INNER JOIN departamentos d ON e2.departamento_id = d.id
    WHERE d.nombre = "Recursos Humanos"
);

-- Encuentra los productos cuyo precio es mayor o igual a todos los precios de los productos con la palabra "Refrigeradora" en su nombre.
SELECT * FROM productos
WHERE precio >= ALL (
    SELECT precio 
    FROM productos
    WHERE nombre LIKE '%Refrigeradora%'
);

-- Muestra el nombre, apellido y salario del empleado con el salario más alto que esté por debajo del promedio salarial de los empleados.
SELECT nombre, apellido, salario
FROM empleados
WHERE salario = (
    SELECT MAX(salario)
    FROM empleados
    WHERE salario < (
        SELECT AVG(salario)
        FROM empleados
    )
);
