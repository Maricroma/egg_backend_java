-- Actividad: Ejercicios Complementarios
USE mi_bd;

-- EJERCICIOS CON CLÁUSULA IN

-- Busca los empleados que trabajan en los departamentos 2 o 3.
SELECT * FROM empleados WHERE departamento_id IN (2, 3);

-- Trae a los clientes que no tengan los IDs 2, 4 o 6.
SELECT * FROM clientes WHERE cliente_id NOT IN (2, 4, 6);

-- Busca los productos cuyos precios son 350.00, 480.00 o 800.00.
SELECT * FROM productos WHERE precio IN (350.00, 480.00, 800.00);

-- EJERCICIOS CON CLÁUSULA LIKE

-- Busca los empleados cuyos correos electrónicos terminan en "mail.com".
SELECT * FROM empleados WHERE correo LIKE '%mail.com';

-- Encuentra los productos cuyos nombres tengan exactamente 6 caracteres.
SELECT * FROM productos WHERE nombre LIKE '______';

-- Busca los clientes cuyos nombres tengan una "a" en la tercera posición 
SELECT * FROM clientes WHERE nombre LIKE '__a%';

-- EJERCICIOS CON CLÁUSULA ORDER BY

-- Ordena los clientes por nombre de manera ascendente y luego por dirección de manera descendente.
SELECT * FROM clientes ORDER BY nombre, direccion DESC;

-- Ordena los empleados por fecha_contratación de manera descendente.
SELECT * FROM empleados ORDER BY fecha_contratacion DESC;

-- Ordena los productos por precio de manera ascendente.
SELECT * FROM productos ORDER BY precio;

-- EJERCICIOS CON FUNCIÓN MAX()

-- Encuentra el precio máximo de un producto.
SELECT MAX(precio) FROM productos;

-- Encuentra el monto total máximo de una venta.
SELECT MAX(monto_total) FROM ventas;

-- Encuentra el ID de cliente con el valor máximo.
SELECT MAX(cliente_id) FROM clientes;

-- EJERCICIOS CON FUNCIÓN MIN()

-- Encuentra el precio mínimo de un producto.
SELECT MIN(precio) FROM productos;

-- Encuentra el monto total mínimo de una venta.
SELECT MIN(monto_total) FROM ventas;

-- Encuentra el ID de cliente con el valor mínimo.
SELECT MIN(cliente_id) FROM clientes;

-- EJERCICIOS CON FUNCIÓN COUNT()

-- Cuenta cuántos clientes tienen la palabra "López" en su nombre.
SELECT COUNT(*) FROM clientes WHERE nombre LIKE '%López%';

-- Cuenta cuántas ventas fueron realizadas por el empleado con el id 9 .
SELECT COUNT(*) FROM ventas WHERE empleado_id = 9;

-- Cuenta cuántos productos tienen un nombre que contiene la palabra "Digital".
SELECT COUNT(*) FROM productos WHERE nombre LIKE '%Digital%';

-- EJERCICIOS CON FUNCIÓN  SUM()

-- Calcula la suma de cantidades de productos vendidos por empleado.
SELECT empleado_id, SUM(cantidad) FROM ventas GROUP BY empleado_id;

-- Calcula la suma de salarios de empleados en el Departamento 1.
SELECT SUM(salario) AS 'Total de salarios Dpto. 1' FROM empleados WHERE departamento_id = 1;

-- Calcula la suma de precios de productos vendidos al cliente con id 2.
SELECT SUM(precio_unitario) AS 'Total de precios vendidos a cliente 2' FROM ventas WHERE cliente_id = 2;

-- EJERCICIOS CON FUNCIÓN  AVG()

-- Calcula el precio promedio de productos con un precio superior a $200.
SELECT AVG(precio) AS 'Precio promedio de productos > $200' FROM productos WHERE precio > 200;

-- Calcula el salario promedio de los empleados en el Departamento 1.
SELECT AVG(salario) AS 'Salario promedio Dpto. 1' FROM empleados WHERE departamento_id = 1;

-- Calcula la cantidad promedio de productos vendidos por empleado.
SELECT empleado_id, AVG(cantidad) FROM ventas GROUP BY empleado_id;

-- EJERCICIOS CON FUNCIÓN  GROUP BY()

-- Agrupa las ventas por cliente y muestra el monto total gastado por cada cliente.
SELECT cliente_id, SUM(monto_total) FROM ventas GROUP BY cliente_id;

-- Encuentra el salario máximo por departamento.
SELECT departamento_id, MAX(salario) FROM empleados GROUP BY departamento_id;

-- Encuentra el salario mínimo por departamento.
SELECT departamento_id, MIN(salario) FROM empleados GROUP BY departamento_id;

-- Obtén la suma total de salarios por departamento.
SELECT departamento_id, SUM(salario) FROM empleados GROUP BY departamento_id;

-- Encuentra la cantidad total de productos vendidos por empleado.
SELECT empleado_id, SUM(cantidad) FROM ventas GROUP BY empleado_id;

-- EJERCICIOS CON FUNCIÓN HAVING()

-- Encuentra los departamentos con al menos 2 empleados con una edad menor de 30 años.
SELECT departamento_id, COUNT(*) FROM empleados WHERE edad < 30 GROUP BY departamento_id HAVING COUNT(*) >= 2;

-- Muestra los clientes que han gastado más de $2,000 en total en compras.
SELECT cliente_id, SUM(monto_total) FROM ventas GROUP BY cliente_id HAVING SUM(monto_total) > 2000;

-- EJERCICIOS CON FUNCIÓN  AS()

-- Crea una consulta que muestre la edad de los empleados junto con la edad aumentada en 5 años y que esta nueva columna se llame “Edad en 5 años”.
SELECT edad, edad + 5 AS 'Edad en 5 años' FROM empleados;

-- Muestra el monto total de ventas junto con el monto total aumentado en un 21%  y que esta nueva columna se llame “Precio + IVA”.
SELECT monto_total, monto_total * 1.21 AS 'Precio + IVA' FROM ventas;

-- Crea una consulta que muestre el nombre del producto y su precio unitario precedido con el signo “$ ” y que esta nueva columna se llame “precio con formato”.
SELECT nombre, CONCAT('$ ', precio) AS 'precio con formato' FROM productos;

-- EJERCICIOS CON FUNCIÓN  LIMIT()

-- Muestra los 5 clientes con los IDs más bajos
SELECT * FROM clientes ORDER BY cliente_id LIMIT 5;

-- Muestra los 3 productos más vendidos.    
SELECT producto_id, SUM(cantidad) FROM ventas GROUP BY producto_id ORDER BY SUM(cantidad) DESC LIMIT 3;

-- Muestra los 5 empleados más jóvenes.
SELECT * FROM empleados ORDER BY edad LIMIT 5;

-- EJERCICIOS CON FUNCIÓN  CASE()

-- Crea una consulta que muestre el nombre de los productos y los categorice como "Laptop" si el nombre contiene la palabra "Laptop", "Teléfono" si contiene la palabra "Teléfono", y "Otros" en otros casos.
SELECT nombre, 
    CASE
        WHEN nombre LIKE '%Laptop%' THEN 'Laptop'
        WHEN nombre LIKE '%Teléfono%' THEN 'Teléfono'
        ELSE 'Otros'
    END AS 'Categoría'
FROM productos;

/* Crea una consulta que muestre el ID del producto y los clasifique en categorías según la cantidad total de ventas de cada producto en la tabla 'ventas'. Utilizando una instrucción 'CASE', establece las siguientes categorías: 
- Si la suma de la cantidad de ventas (SUM(cantidad)) es mayor o igual a 9, la categoría es 'Alto Volumen'. 
- Si la suma de la cantidad de ventas está entre 4 y 8 (inclusive), la categoría es 'Medio Volumen'.
- En otros casos, la categoría es 'Bajo Volumen'.
Recuerda agrupar por producto_id y mostrar el resultado en orden descendente por la suma de la cantidad de ventas.*/
SELECT producto_id, SUM(cantidad),
    CASE
        WHEN SUM(cantidad) >= 9 THEN 'Alto Volumen'
        WHEN SUM(cantidad) BETWEEN 4 AND 8 THEN 'Medio Volumen'
        ELSE 'Bajo Volumen'
    END AS 'Categoría'
FROM ventas
GROUP BY producto_id ORDER BY SUM(cantidad) DESC;

-- Crea una consulta que muestre el ID de la venta y los categorice como "Venta pequeña" si el monto total es menor que $500, "Venta mediana" si es mayor o igual a $500 y menor que $1500, y "Venta grande" en otros casos.
SELECT id, 
    CASE
        WHEN monto_total < 500 THEN 'Venta pequeña'
        WHEN monto_total >= 500 AND monto_total < 1500 THEN 'Venta mediana'
        ELSE 'Venta grande'
    END AS 'Categoría'
FROM ventas;

-- Crea una consulta que muestre el nombre de los clientes y los categorice como "Dirección larga" si la longitud de su dirección es mayor o igual a 30 caracteres, "Dirección mediana" si es mayor o igual a 20 y menor que 30 caracteres, y "Dirección corta" en otros casos.
SELECT nombre, 
    CASE
        WHEN LENGTH(direccion) >= 30 THEN 'Dirección larga'
        WHEN LENGTH(direccion) >= 20 THEN 'Dirección mediana'
        ELSE 'Dirección corta'
    END AS 'Categoría'
FROM clientes;

-- Crea una consulta que muestre el nombre de los empleados y los categorice como "Ventas" si pertenecen al departamento 1, "Recursos Humanos" si pertenecen al departamento 2, y "Contabilidad"  si pertenecen al departamento 3.
SELECT nombre,
    CASE
        WHEN departamento_id = 1 THEN 'Ventas'
        WHEN departamento_id = 2 THEN 'Recursos Humanos'
        ELSE 'Contabilidad'
    END AS 'Departamento'
FROM empleados;

/*Crea una consulta que muestre el nombre de los productos y los categorice de la siguiente manera:
Si el nombre del producto está en la lista ('Laptop', 'Reloj de Pulsera Inteligente', 'Reproductor de Blu-ray', 'Auriculares Bluetooth', 'Smart TV 55 Pulgadas', 'Cámara Digital', 'Impresora', 'Tablet', 'Teléfono móvil') y el precio es mayor o igual a 1000, la categoría es 'Tecnología cara'.
Si el nombre del producto está en la lista anterior y el precio está entre 500 y 999 (inclusive), la categoría es 'Tecnología gama media'.
Si el nombre del producto está en la lista anterior y el precio es menor a 500, la categoría es 'Tecnología barata'.
Si el precio es mayor o igual a 1000 y el nombre del producto no está en la lista, la categoría es 'Caro'.
Si el precio está entre 500 y 999 (inclusive) y el nombre del producto no está en la lista, la categoría es 'Medio'.
Si el precio es menor a 500 y el nombre del producto no está en la lista, la categoría es 'Barato'.*/
SELECT nombre, precio,
    CASE
        WHEN nombre IN ('Laptop', 'Reloj de Pulsera Inteligente', 'Reproductor de Blu-ray', 'Auriculares Bluetooth', 'Smart TV 55 Pulgadas', 'Cámara Digital', 'Impresora', 'Tablet', 'Teléfono móvil') THEN
            CASE
                WHEN precio >= 1000 THEN 'Tecnología cara'
                WHEN precio BETWEEN 500 AND 999 THEN 'Tecnología gama media'
                ELSE 'Tecnología barata'
            END
        ELSE
            CASE
                WHEN precio >= 1000 THEN 'Caro'
                WHEN precio BETWEEN 500 AND 999 THEN 'Medio'
                ELSE 'Barato'
            END
    END AS 'Categoría'
FROM productos;
