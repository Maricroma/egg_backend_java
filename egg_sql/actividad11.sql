-- Ejercicios Prácticos con Tablas Temporales 

-- Utiliza TABLE para consultar la tabla productos de manera simple, ordenando los productos de forma descendente por precio y solo 10 filas.
TABLE productos ORDER BY precio DESC LIMIT 10;

-- Crea una tabla temporal de los empleados donde unifiques su nombre y apellido en una sola columna.
CREATE TEMPORARY TABLE nombre_completo AS 
SELECT CONCAT(nombre, ' ', apellido) FROM empleados;

-- Crea una tabla temporal de la tabla clientes donde solo tengas la columna nombre.
DROP TEMPORARY TABLE IF EXISTS nombre_clientes;
CREATE TEMPORARY TABLE nombre_clientes AS
SELECT nombre FROM clientes;

-- Realiza la unión entre las tablas temporales de empleados y clientes usando TABLE.
SELECT * FROM nombre_completo UNION SELECT * FROM nombre_clientes;

/*Crea una tabla temporal escuela primaria que tenga las siguientes columnas: id(int), nombre(varchar), apellido(varchar), edad(int) y grado(int). Y que tenga los siguientes valores:
ID: 1, Nombre: Alejandro, Apellido: González, Edad: 11, Grado: 5
ID: 2, Nombre: Isabella, Apellido: López, Edad: 10, Grado: 4
ID: 3, Nombre: Lucas, Apellido: Martínez, Edad: 11, Grado: 5 
ID: 4, Nombre: Sofía, Apellido: Rodríguez, Edad: 10, Grado: 4 
ID: 5, Nombre: Mateo, Apellido: Pérez, Edad: 12, Grado: 6 
ID: 6, Nombre: Valentina, Apellido: Fernández, Edad: 12, Grado: 6
ID: 7, Nombre: Diego, Apellido: Torres, Edad: 10, Grado: 4
ID: 8, Nombre: Martina, Apellido: Gómez, Edad: 11, Grado: 5
ID: 9, Nombre: Joaquín, Apellido: Hernández, Edad: 10, Grado: 4
ID: 10, Nombre: Valeria, Apellido: Díaz, Edad: 11, Grado: 5*/
CREATE TEMPORARY TABLE escuela_primaria(
    id INT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    grado INT
);
INSERT INTO escuela_primaria VALUES
(1, 'Alejandro', 'González', 11, 5),
(2, 'Isabella', 'López', 10, 4),
(3, 'Lucas', 'Martínez', 11, 5),
(4, 'Sofía', 'Rodríguez', 10, 4),
(5, 'Mateo', 'Pérez', 12, 6),
(6, 'Valentina', 'Fernández', 12, 6),
(7, 'Diego', 'Torres', 10, 4),
(8, 'Martina', 'Gómez', 11, 5),
(9, 'Joaquín', 'Hernández', 10, 4),
(10, 'Valeria', 'Díaz', 11, 5);

-- Ejercicios Complementarios con Tablas Temporales

-- Agrega un cliente nuevo con el nombre “Ana Rodríguez” y con dirección en “San Martín 2515, Mar del Plata”. Luego realiza la intersección entre la tabla temporal de empleados y clientes.
--  Debes volver a crear la tabla temporal de nombre_clientes para actualizar esa tabla.
INSERT INTO clientes VALUES (11, 'Ana Rodríguez', 'San Martín 2515, Mar del Plata');
SELECT * FROM nombre_completo INTERSECT SELECT * FROM nombre_clientes;

-- Realiza la excepción entre la tabla temporal de clientes y la de empleados.
SELECT * FROM nombre_completo EXCEPT SELECT * FROM nombre_clientes;

/*Crea una tabla temporal escuela secundaria que tenga las siguientes columnas: id(int), nombre(varchar), apellido(varchar), edad(int) y grado(int). Y que tenga los siguientes valores:
ID: 1, Nombre: Eduardo, Apellido: Sánchez, Edad: 16, Grado: 10
ID: 2, Nombre: Camila, Apellido: Martín, Edad: 17, Grado: 11
ID: 3, Nombre: Manuel, Apellido: Gutiérrez, Edad: 15, Grado: 9
ID: 4, Nombre: Laura, Apellido: García, Edad: 16, Grado: 10
ID: 11, Nombre: Pablo, Apellido: Ortega, Edad: 17, Grado: 11
ID: 12, Nombre: Carmen, Apellido: Ramírez, Edad: 15, Grado: 9
ID: 13, Nombre: Carlos, Apellido: Molina, Edad: 16, Grado: 10
ID: 14, Nombre: Ana, Apellido: Ruiz, Edad: 17, Grado: 11
ID: 15, Nombre: Luis, Apellido: Fernández, Edad: 15, Grado: 9
ID: 16, Nombre: María, Apellido: López, Edad: 16, Grado: 10*/
CREATE TEMPORARY TABLE escuela_secundaria(
    id INT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    grado INT
);
INSERT INTO escuela_secundaria VALUES
(1, 'Eduardo', 'Sánchez', 16, 10),
(2, 'Camila', 'Martín', 17, 11),
(3, 'Manuel', 'Gutiérrez', 15, 9),
(4, 'Laura', 'García', 16, 10),
(11, 'Pablo', 'Ortega', 17, 11),
(12, 'Carmen', 'Ramírez', 15, 9),
(13, 'Carlos', 'Molina', 16, 10),
(14, 'Ana', 'Ruiz', 17, 11),
(15, 'Luis', 'Fernández', 15, 9),
(16, 'María', 'López', 16, 10);

-- Realiza la intersección de la escuela primaria y escuela secundaria con el nombre y apellido de los alumnos para saber quienes fueron a ambas escuelas.
SELECT CONCAT(nombre, ' ', apellido) FROM escuela_primaria INTERSECT SELECT CONCAT(nombre, ' ', apellido) FROM escuela_secundaria;

-- Realiza la excepción de la escuela primaria con la secundaria para saber quienes no siguieron cursando en dicha escuela secundaria.
SELECT CONCAT(nombre, ' ', apellido) FROM escuela_primaria EXCEPT SELECT CONCAT(nombre, ' ', apellido) FROM escuela_secundaria;

-- Realiza la excepción de la escuela secundaria con la primaria para saber quienes no siguieron cursando en dicha escuela secundaria.
SELECT CONCAT(nombre, ' ', apellido) FROM escuela_secundaria EXCEPT SELECT CONCAT(nombre, ' ', apellido) FROM escuela_primaria;

-- Realiza la unión de la escuela primaria y secundaria con la columna grado para saber cuáles son los grados que abarcan ambas escuelas, y ordénalos de forma descendente.
SELECT grado FROM escuela_primaria UNION SELECT grado FROM escuela_secundaria ORDER BY grado DESC;