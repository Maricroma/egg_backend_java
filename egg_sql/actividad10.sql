-- Ejercicios JOIN Parte 1

-- Encuentra el nombre y apellido de los empleados junto con la cantidad total de ventas que han realizado.
SELECT e.nombre, e.apellido, COUNT(v.id) AS cantidad_total_ventas
FROM empleados e
INNER JOIN ventas v
ON e.id = v.empleado_id
GROUP BY e.nombre, e.apellido;

-- Calcula el monto total vendido a cada cliente y muestra el nombre del cliente, su dirección y el monto total.
SELECT c.nombre, c.direccion, SUM(v.monto_total) AS total_monto_ventas
FROM clientes c
INNER JOIN ventas v
ON c.id = v.cliente_id
GROUP BY c.nombre, c.direccion;

-- Encuentra los productos vendidos por cada empleado en el departamento de "Ventas" y muestra el nombre del empleado junto con el nombre de los productos que han vendido.
SELECT e.nombre, p.nombre AS nombre_producto
FROM empleados e
INNER JOIN ventas v
ON e.id = v.empleado_id
INNER JOIN productos p
ON v.producto_id = p.id
WHERE e.departamento_id = (SELECT id FROM departamentos WHERE nombre = 'Ventas');

-- Encuentra el nombre del cliente, el nombre del producto y la cantidad comprada de productos con un precio superior a $500.
SELECT c.nombre AS cliente, p.nombre AS nombre_producto, v.cantidad
FROM clientes c
INNER JOIN ventas v
ON c.id = v.cliente_id
INNER JOIN productos p
ON v.producto_id = p.id
WHERE p.precio > 500;

-- Ejercicios JOIN Parte 2

-- Calcula la cantidad de ventas por departamento, incluso si el departamento no tiene ventas.
SELECT d.nombre, COUNT(v.id) AS total_ventas
FROM departamentos d
LEFT JOIN empleados e
ON d.id = e.departamento_id
LEFT JOIN ventas v
ON e.id = v.empleado_id
GROUP BY d.nombre;

-- Encuentra el nombre y la dirección de los clientes que han comprado más de 3 productos distintos y muestra la cantidad de productos comprados.
SELECT c.nombre, c.direccion, COUNT(v.producto_id) AS cantidad_productos_comprados
FROM clientes c
INNER JOIN ventas v
ON c.id = v.cliente_id
GROUP BY c.nombre, c.direccion
HAVING COUNT(DISTINCT v.producto_id) > 3;

-- Calcula el monto total de ventas realizadas por cada departamento y muestra el nombre del departamento junto con el monto total de ventas.
SELECT d.nombre, SUM(COALESCE(v.monto_total, 0)) AS monto_total_ventas
FROM departamentos d
LEFT JOIN empleados e
ON d.id = e.departamento_id
LEFT JOIN ventas v
ON e.id = v.empleado_id
GROUP BY d.nombre;

-- Actividad: Ejercicios Complementarios

-- Muestra el nombre y apellido de los empleados que pertenecen al departamento de "Recursos Humanos" y han realizado más de 5 ventas.
SELECT e.nombre, e.apellido
FROM empleados e
INNER JOIN departamentos d
ON e.departamento_id = d.id
INNER JOIN ventas v
ON e.id = v.empleado_id
WHERE d.nombre = 'Recursos Humanos'
GROUP BY e.nombre, e.apellido
HAVING COUNT(v.id) > 5;

-- Muestra el nombre y apellido de todos los empleados junto con la cantidad total de ventas que han realizado, incluso si no han realizado ventas.
SELECT e.nombre, e.apellido, COUNT(v.id) AS cantidad_total_ventas
FROM empleados e
LEFT JOIN ventas v
ON e.id = v.empleado_id
GROUP BY e.nombre, e.apellido;

-- Encuentra el empleado más joven de cada departamento y muestra el nombre del departamento junto con el nombre y la edad del empleado más joven.
SELECT d.nombre AS departamento, e.nombre AS empleado, e.edad
FROM departamentos d
INNER JOIN empleados e
ON d.id = e.departamento_id
WHERE e.edad = (SELECT MIN(edad) FROM empleados WHERE departamento_id = d.id);

-- Calcula el volumen de productos vendidos por cada producto (por ejemplo, menos de 5 como "bajo", entre 5 y 10 como "medio", y más de 10 como "alto") y muestra la categoría de volumen junto con la cantidad y el nombre del producto.
SELECT p.nombre, SUM(v.cantidad) AS cantidad,
CASE
    WHEN SUM(v.cantidad) < 5 THEN 'bajo'
    WHEN SUM(v.cantidad) < 10 THEN 'medio'
    ELSE 'alto'
END AS volumen
FROM productos p
LEFT JOIN ventas v
ON p.id = v.producto_id
GROUP BY p.nombre;