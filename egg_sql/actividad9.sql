-- Ejercicios consultas multitabla  - Parte 1

-- Une las tablas de empleados con departamentos y solo muestra las columnas nombre, apellido, edad, salario de empleados y la columna nombre de departamentos.
SELECT e.nombre, e.apellido, e.edad, e.salario, d.nombre 
FROM empleados e, departamentos d
WHERE e.departamento_id = d.id;

-- Une las tablas ventas con la tabla empleados donde se muestren todas las columnas de ventas exceptuando la columna empleado_id y en su lugar muestres el nombre y apellido de la tabla empleados.
SELECT v.id, v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, e.nombre, e.apellido
FROM ventas v, empleados e
WHERE v.empleado_id = e.id;

-- Une las tablas ventas con la tabla productos donde se muestren todas las columnas de ventas exceptuando la columna producto_id y en su lugar muestres la columna nombre de la tabla productos.
SELECT v.id, v.empleado_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, p.nombre
FROM ventas v, productos p
WHERE v.producto_id = p.id;

-- Une las tablas ventas con la tabla clientes donde se muestren todas las columnas de ventas exceptuando la columna cliente_id y en su lugar muestres la columna nombre de la tabla clientes.
SELECT v.id, v.empleado_id, v.producto_id, v.cantidad, v.precio_unitario, v.monto_total, c.nombre
FROM ventas v, clientes c
WHERE v.cliente_id = c.id;  

-- Une las tablas ventas con la tablas empleados y departamentos donde se muestren todas las columnas de ventas exceptuando la columna empleado_id y en su lugar muestres el nombre y apellido de la tabla empleados y además muestres la columna nombre de la tabla departamentos.
SELECT v.id, v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, e.nombre, e.apellido, d.nombre
FROM ventas v, empleados e, departamentos d
WHERE v.empleado_id = e.id AND e.departamento_id = d.id;

-- Une las tablas ventas, empleados, productos y clientes donde se muestren las columnas de la tabla ventas reemplazando sus columnas de FOREIGN KEYs con las respectivas columnas de “nombre” de las otras tablas.
SELECT v.id, e.nombre as empleado, p.nombre as producto, c.nombre as cliente, v.cantidad, v.precio_unitario, v.monto_total
FROM ventas v, empleados e, productos p, clientes c
WHERE v.empleado_id = e.id AND v.producto_id = p.id AND v.cliente_id = c.id;

-- Calcular el salario máximo de los empleados en cada departamento y mostrar el nombre del departamento junto con el salario máximo.
SELECT d.nombre, MAX(e.salario) as salario_maximo
FROM empleados e, departamentos d
WHERE e.departamento_id = d.id
GROUP BY d.nombre;

-- Ejercicios consultas multitabla - Parte 2

-- Calcular el monto total de ventas por departamento y mostrar el nombre del departamento junto con el monto total de ventas.
SELECT d.nombre, SUM(v.monto_total) as monto_total_ventas
FROM ventas v, empleados e, departamentos d
WHERE v.empleado_id = e.id AND e.departamento_id = d.id
GROUP BY d.nombre;

-- Encontrar el empleado más joven de cada departamento y mostrar el nombre del departamento junto con la edad del empleado más joven.
SELECT d.nombre, MIN(e.edad) as edad_minima
FROM empleados e, departamentos d
WHERE e.departamento_id = d.id
GROUP BY d.nombre;

-- Calcular el volumen de productos vendidos por cada producto (por ejemplo, menos de 5 “bajo”, menos 8 “medio” y mayor o igual a 8 “alto”) y mostrar la categoría de volumen junto con la cantidad y el nombre del producto.
SELECT p.nombre, SUM(v.cantidad),
CASE
    WHEN SUM(v.cantidad) < 5 THEN 'bajo'
    WHEN SUM(v.cantidad) < 8 THEN 'medio'
    ELSE 'alto'
END as volumen
FROM ventas v, productos p
WHERE v.producto_id = p.id
GROUP BY p.nombre;

-- Encontrar el cliente que ha realizado el mayor monto total de compras y mostrar su nombre y el monto total.
SELECT c.nombre, SUM(v.monto_total) as monto_total
FROM ventas v, clientes c
WHERE v.cliente_id = c.id
GROUP BY c.nombre   
ORDER BY monto_total DESC
LIMIT 1;

-- Calcular el precio promedio de los productos vendidos por cada empleado y mostrar el nombre del empleado junto con el precio promedio de los productos que ha vendido.
SELECT e.nombre, AVG(v.precio_unitario) as precio_promedio
FROM ventas v, empleados e
WHERE v.empleado_id = e.id
GROUP BY e.nombre;

-- Encontrar el departamento con el salario mínimo más bajo entre los empleados y mostrar el nombre del departamento junto con el salario mínimo más bajo.
SELECT d.nombre, MIN(e.salario) as salario_minimo
FROM empleados e, departamentos d
WHERE e.departamento_id = d.id
GROUP BY d.nombre
ORDER BY salario_minimo
LIMIT 1;

-- Encuentra el departamento con el salario promedio más alto entre los empleados mayores de 30 años y muestra el nombre del departamento junto con el salario promedio. Limita los resultados a mostrar solo los departamentos con el salario promedio mayor a 3320.
SELECT d.nombre, AVG(e.salario) as salario_promedio
FROM empleados e, departamentos d
WHERE e.departamento_id = d.id AND e.edad > 30
GROUP BY d.nombre
HAVING salario_promedio > 3320
ORDER BY salario_promedio DESC;

-- Actividad: Ejercicios Complementarios

-- Encontrar la cantidad de productos vendidos por cada empleado y mostrar el nombre del empleado junto con la cantidad de productos vendidos.
SELECT e.nombre, COUNT(v.producto_id) as cantidad_productos_vendidos
FROM ventas v, empleados e
WHERE v.empleado_id = e.id
GROUP BY e.nombre;

-- Calcular el monto total de ventas por cada cliente y mostrar el nombre del cliente junto con el monto total de sus compras.
SELECT c.nombre, SUM(v.monto_total) as monto_total_ventas
FROM ventas v, clientes c
WHERE v.cliente_id = c.id
GROUP BY c.nombre;

-- Encontrar el producto más caro vendido y mostrar su nombre y precio.
SELECT p.nombre, MAX(v.precio_unitario) as precio_unitario
FROM ventas v, productos p
WHERE v.producto_id = p.id;

-- Calcular el salario promedio de los empleados en cada departamento y mostrar el nombre del departamento junto con el salario promedio.
SELECT d.nombre, AVG(e.salario) as salario_promedio
FROM empleados e, departamentos d
WHERE e.departamento_id = d.id
GROUP BY d.nombre;

-- Encontrar la cantidad total de ventas realizadas por cada empleado y mostrar el nombre y apellido del empleado junto con la cantidad total de ventas.
SELECT e.nombre, e.apellido, COUNT(v.id) as cantidad_total_ventas
FROM ventas v, empleados e
WHERE v.empleado_id = e.id
GROUP BY e.nombre;

-- Encuentra la cantidad de ventas realizadas por cada empleado y muestra el nombre y apellido del empleado junto con la cantidad total de ventas. Limita los resultados a mostrar solo a los empleados que hayan realizado más de 5 ventas y ordenarlos de forma descendente con respecto a la cantidad de ventas.
SELECT e.nombre, e.apellido, COUNT(v.id) as cantidad_total_ventas
FROM ventas v, empleados e
WHERE v.empleado_id = e.id
GROUP BY e.nombre
HAVING cantidad_total_ventas > 5
ORDER BY cantidad_total_ventas DESC;

-- Calcula el monto total vendido por cada empleado y muestra el nombre del empleado junto con el monto total. Usa la cláusula HAVING para filtrar a aquellos empleados que hayan vendido más de 10 productos en total. Muestra el resultado en orden descendente según el monto total vendido.
SELECT e.nombre, SUM(v.monto_total) as monto_total_vendido
FROM ventas v, empleados e
WHERE v.empleado_id = e.id
GROUP BY e.nombre
HAVING COUNT(v.id) > 10
ORDER BY monto_total_vendido DESC;

-- Encuentra el monto total vendido a cada cliente y muestra el nombre del cliente junto con el monto total. Usa la cláusula HAVING para filtrar a aquellos clientes cuyo monto total promedio en sus compras sea superior a $1500. Muestra el resultado en orden descendente según el monto total vendido.
SELECT c.nombre, SUM(v.monto_total) as monto_total_vendido
FROM ventas v, clientes c
WHERE v.cliente_id = c.id
GROUP BY c.nombre
HAVING AVG(v.monto_total) > 1500
ORDER BY monto_total_vendido DESC;

-- Calcula la cantidad total de ventas realizadas a cada cliente y muestra el nombre del cliente junto con la cantidad total de ventas. Limita los resultados a mostrar solo a los clientes que hayan realizado más de 3 ventas ordénalos de forma descendente según la cantidad de ventas.
SELECT c.nombre, COUNT(v.id) as cantidad_total_ventas
FROM ventas v, clientes c
WHERE v.cliente_id = c.id
GROUP BY c.nombre
HAVING cantidad_total_ventas > 3
ORDER BY cantidad_total_ventas DESC;

-- Encuentra los productos más caros vendidos (precio mayor a 1000), muestra su nombre y precio y ordenarlos de forma descendente por precio.
SELECT DISTINCT p.nombre, v.precio_unitario
FROM ventas v, productos p
WHERE v.producto_id = p.id AND v.precio_unitario > 1000
ORDER BY v.precio_unitario DESC;
