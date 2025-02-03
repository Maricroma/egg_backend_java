USE mi_bd;

INSERT INTO empleados (nombre, apellido, edad, salario, departamento_id)
VALUES
  ('Laura', 'Sánchez', 27, 3300.00, 1),
  ('Javier', 'Pérez', 29, 3100.00, 1),
  ('Camila', 'Gómez', 26, 3000.00, 1),
  ('Lucas', 'Fernández', 28, 3200.00, 1),
  ('Valentina', 'Rodríguez', 30, 3500.00, 1);
INSERT INTO productos (nombre, precio)
VALUES
  ('Cámara Digital', 420.00),
  ('Smart TV 55 Pulgadas', 1200.00),
  ('Auriculares Bluetooth', 80.00),
  ('Reproductor de Blu-ray', 120.00),
  ('Lavadora de Ropa', 550.00),
  ('Refrigeradora Doble Puerta', 800.00),
  ('Horno de Microondas', 120.00),
  ('Licuadora de Alta Potencia', 70.00),
  ('Silla de Oficina Ergonómica', 150.00),
  ('Escritorio de Madera', 200.00),
  ('Mesa de Comedor', 250.00),
  ('Sofá de Tres Plazas', 350.00),
  ('Mochila para Portátil', 30.00),
  ('Reloj de Pulsera Inteligente', 100.00),
  ('Juego de Utensilios de Cocina', 40.00),
  ('Set de Toallas de Baño', 20.00),
  ('Cama King Size', 500.00),
  ('Lámpara de Pie Moderna', 70.00),
  ('Cafetera de Goteo', 40.00),
  ('Robot Aspirador', 180.00);
INSERT INTO clientes (nombre, direccion)
VALUES
  ('Alejandro López', 'Calle Rivadavia 123, Buenos Aires'),
  ('Sofía Rodríguez', 'Avenida San Martín 456, Rosario'),
  ('Joaquín Pérez', 'Calle Belgrano 789, Córdoba'),
  ('Valeria Gómez', 'Calle Mitre 101, Mendoza'),
  ('Diego Martínez', 'Avenida 9 de Julio 654, Buenos Aires');
INSERT INTO ventas (producto_id, cliente_id, cantidad, precio_unitario, empleado_id)
VALUES
  (1, 6, 3, 1350.00, 1),
  (5, 8, 5, 420.00, 9),
  (10, 2, 2, 800.00, 6),
  (14, 7, 1, 200.00, 5),
  (20, 4, 4, 20.00, 6),
  (4, 5, 5, 280.00, 1),
  (9, 5, 3, 550.00, 1),
  (13, 3, 4, 150.00, 5),
  (19, 6, 2, 40.00, 1),
  (2, 9, 5, 480.00, 1);
INSERT INTO ventas (producto_id, cliente_id, cantidad, precio_unitario, empleado_id)
VALUES
  (3, 9, 1, 350.00, 1),
  (6, 7, 4, 1200.00, 1),
  (7, 6, 3, 80.00, 1),
  (12, 9, 5, 70.00, 1),
  (16, 8, 2, 350.00, 6),
  (23, 9, 4, 180.00, 1),
  (18, 4, 3, 100.00, 7),
  (11, 3, 2, 120.00, 5),
  (15, 5, 4, 250.00, 6),
  (8, 8, 1, 120.00, 7);
INSERT INTO ventas (producto_id, cliente_id, cantidad, precio_unitario, empleado_id)
VALUES
  (17, 3, 2, 30.00, 5),
  (21, 9, 5, 500.00, 6),
  (22, 2, 3, 70.00, 6),
  (24, 9, 2, 180.00, 1),
  (5, 1, 2, 1350.00, 1),
  (9, 6, 4, 550.00, 9),
  (13, 8, 3, 150.00, 7),
  (3, 1, 5, 350.00, 1),
  (18, 9, 1, 100.00, 6),
  (10, 5, 2, 800.00, 1);
INSERT INTO ventas (producto_id, cliente_id, cantidad, precio_unitario, empleado_id)
VALUES
  (7, 4, 3, 80.00, 6),
  (2, 5, 1, 480.00, 6),
  (8, 7, 4, 120.00, 7),
  (1, 3, 5, 1350.00, 5),
  (4, 6, 2, 280.00, 5),
  (12, 1, 1, 70.00, 1),
  (19, 4, 3, 40.00, 6),
  (15, 3, 4, 250.00, 5),
  (6, 8, 2, 1200.00, 7),
  (11, 2, 3, 120.00, 5);

-- Ejercicios cláusula IN

-- Encuentra los empleados cuyos IDs son 1, 3 o 5.
SELECT * FROM empleados
WHERE id IN (1, 3, 5);

-- Busca los productos con IDs 2, 4 o 6 en la tabla de productos.
SELECT * FROM productos
WHERE id IN (2, 4, 6);

-- Encuentra las ventas que tienen los clientes con IDs 1, 3 o 5.
SELECT * FROM ventas
WHERE cliente_id IN (1, 3, 5);

-- Ejercicios cláusula LIKE

-- Encuentra los empleados cuyos nombres comienzan con "L".
SELECT * FROM empleados
WHERE nombre LIKE 'L%';

-- Busca los productos cuyos nombres contengan la palabra "Teléfono".
SELECT * FROM productos
WHERE nombre LIKE '%Teléfono%';

-- Encuentra los clientes cuyas direcciones contienen la palabra "Calle".
SELECT * FROM clientes
WHERE direccion LIKE '%Calle%';

-- Ejercicios cláusula ORDER BY

-- Ordena los empleados por salario de manera ascendente.
SELECT * FROM empleados
ORDER BY salario;

-- Ordena los productos por nombre de manera descendente.
SELECT * FROM productos
ORDER BY nombre DESC;

-- Ordena las ventas por cantidad de manera ascendente y luego por precio_unitario de manera descendente.
SELECT * FROM ventas
ORDER BY cantidad, precio_unitario DESC;

-- Ejercicios LIMIT

-- Muestra los 5 productos más caros de la tabla "productos".
SELECT * FROM productos
ORDER BY precio DESC LIMIT 5;

-- Muestra los 10 primeros empleados en orden alfabético por apellido.
SELECT * FROM empleados
ORDER BY apellido LIMIT 10;

-- Muestra las 3 ventas con el monto total más alto.
SELECT * FROM ventas
ORDER BY monto_total DESC LIMIT 3;

-- Ejercicios AS

-- Crea una consulta que muestre el salario de los empleados junto con el salario aumentado en un 10% nombrando a la columna como “Aumento del 10%”.
SELECT salario, salario *  1.10 AS 'Aumento del 10%' FROM empleados;

-- Crea una consulta que calcule el monto total de las compras realizadas por cliente y que la columna se llame “Monto total gastado”.
SELECT cliente_id, SUM(monto_total) AS `Monto total gastado`
FROM ventas
GROUP BY cliente_id;

-- Muestra los nombres completos de los empleados concatenando los campos "nombre" y "apellido" y que la columna se llame “Nombre y apellido”.
SELECT CONCAT(nombre, ' ', apellido) AS 'Nombre y apellido' FROM empleados; 

-- Ejercicios CASE

-- Crea una consulta que muestre el nombre de los productos y los categorice como "Caro" si el precio es mayor o igual a $500, "Medio" si es mayor o igual a $200 y menor que $500, y "Barato" en otros casos.
SELECT nombre,
  CASE
    WHEN precio >= 500 THEN 'Caro'
    WHEN precio >= 200 THEN 'Medio'
    ELSE 'Barato'
  END AS 'Categoría'
FROM productos;

-- Crea una consulta que muestre el nombre de los empleados y los categorice como "Joven" si tienen menos de 30 años, "Adulto" si tienen entre 30 y 40 años, y "Mayor" si tienen más de 40 años.
SELECT nombre,
  CASE
    WHEN edad < 30 THEN 'Joven'
    WHEN edad <= 40 THEN 'Adulto'
    ELSE 'Mayor'
  END AS 'Categoría' 
FROM empleados;

-- Crea una consulta que muestre el ID de la venta y los categorice como "Poca cantidad" si la cantidad es menor que 3, "Cantidad moderada" si es igual o mayor que 3 y menor que 6, y "Mucha cantidad" en otros casos.
SELECT id,
  CASE
    WHEN cantidad < 3 THEN 'Poca cantidad'
    WHEN cantidad < 6 THEN 'Cantidad moderada'
    ELSE 'Mucha cantidad'
  END AS 'Categoría'
FROM ventas;

-- Crea una consulta que muestre el nombre de los clientes y los categorice como "Comienza con A" si su nombre comienza con la letra 'A', "Comienza con M" si comienza con 'M' y "Otros" en otros casos.
SELECT nombre,
  CASE
    WHEN nombre LIKE 'A%' THEN 'Comienza con A'
    WHEN nombre LIKE 'M%' THEN 'Comienza con M'
    ELSE 'Otros'
  END AS 'Categoría'
FROM clientes;

-- Crea una consulta que muestre el nombre de los empleados y los categorice como "Salario alto" si el salario es mayor o igual a $3500, "Salario medio" si es mayor o igual a $3000 y menor que $3500, y "Salario bajo" en otros casos.
SELECT nombre,
  CASE
    WHEN salario >= 3500 THEN 'Salario alto'
    WHEN salario >= 3000 THEN 'Salario medio'
    ELSE 'Salario bajo'
  END AS 'Categoría'
FROM empleados;

-- Ejercicios Función MAX()

-- Encuentra el salario máximo de todos los empleados.
SELECT MAX(salario) AS 'Salario máximo' FROM empleados;

-- Encuentra la cantidad máxima de productos vendidos en una sola venta.
SELECT MAX(cantidad) AS 'Cantidad máxima' FROM ventas;

-- Encuentra la edad máxima de los empleados.
SELECT MAX(edad) AS 'Edad máxima' FROM empleados;

-- Ejercicios Función MIN()

-- Encuentra el salario mínimo de todos los empleados.
SELECT MIN(salario) AS 'Salario mínimo' FROM empleados;

-- Encuentra la cantidad mínima de productos vendidos en una sola venta.
SELECT MIN(cantidad) AS 'Cantidad mínima' FROM ventas;

-- Encuentra la edad mínima de los empleados.
SELECT MIN(edad) AS 'Edad mínima' FROM empleados;

-- Ejercicios de la Función COUNT()

-- Cuenta cuántos empleados hay en total.
SELECT COUNT(*) AS 'Total de empleados' FROM empleados;

-- Cuenta cuántas ventas se han realizado.
SELECT COUNT(*) AS 'Total de ventas' FROM ventas;

-- Cuenta cuántos productos tienen un precio superior a $500.
SELECT COUNT(*) AS 'Productos caros' FROM productos WHERE precio > 500;

-- Ejercicios de la Función SUM()

-- Calcula la suma total de salarios de todos los empleados.
SELECT SUM(salario) AS 'Total de salarios' FROM empleados;

-- Calcula la suma total de montos vendidos en todas las ventas.
SELECT SUM(monto_total) AS 'Total de ventas' FROM ventas;

-- Calcula la suma de precios de productos con ID par.
SELECT SUM(precio) AS 'Total de precios' FROM productos WHERE id % 2 = 0;

-- Ejercicios Función AVG()

-- Calcula el salario promedio de todos los empleados.
SELECT AVG(salario) AS 'Salario promedio' FROM empleados;

-- Calcula el precio unitario promedio de todos los productos.
SELECT AVG(precio) AS 'Precio promedio' FROM productos;

-- Calcula la edad promedio de los empleados.
SELECT AVG(edad) AS 'Edad promedio' FROM empleados;

-- Ejercicios GROUP BY()

-- Agrupa las ventas por empleado y muestra la cantidad total de ventas realizadas por cada empleado.
SELECT empleado_id, COUNT(*) AS 'Total de ventas' FROM ventas GROUP BY empleado_id;

-- Agrupa los productos por precio y muestra la cantidad de productos con el mismo precio.
SELECT precio, COUNT(*) AS 'Cantidad' FROM productos GROUP BY precio;

-- Agrupa los empleados por departamento y muestra la cantidad de empleados en cada departamento.
SELECT departamento_id, COUNT(*) AS 'Cantidad de empleados' FROM empleados GROUP BY departamento_id;

-- Ejercicios HAVING

-- Encuentra los departamentos con un salario promedio de sus empleados superior a $3,000.
SELECT departamento_id, AVG(salario) AS 'Salario promedio' FROM empleados GROUP BY departamento_id HAVING AVG(salario) > 3000;

-- Encuentra los productos que se han vendido al menos 5 veces.
SELECT producto_id, COUNT(*) AS 'Cantidad de ventas' FROM ventas GROUP BY producto_id HAVING COUNT(*) >= 5;

-- Selecciona los empleados que tengan una “o” en su nombre o apellido y agrúpalos por departamento y muestra los que tengan el salario máximo.
SELECT departamento_id, MAX(salario) AS 'Salario máximo' FROM empleados WHERE nombre LIKE '%o%' OR apellido LIKE '%o%' GROUP BY departamento_id;

