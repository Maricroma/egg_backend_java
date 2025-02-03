-- Actividad : Aplicando DML
USE mi_bd;

-- Inserta un departamento llamado "Ventas" en la tabla "departamentos".
INSERT INTO departamentos (nombre) VALUES ('Ventas');

-- Inserta un departamento llamado "Recursos Humanos" en la tabla "departamentos".
INSERT INTO departamentos (nombre) VALUES ('Recursos Humanos');

/*Inserta un empleado en la tabla "empleados" con los siguientes valores:
Nombre: Ana
Apellido: Rodríguez.
Edad: 28.
Salario: 3000.00.
Correo electrónico: ana_rodriguez@gmail.com
departamento_id: (debe coincidir con el ID del departamento "Ventas" que insertaste anteriormente, puedes saber el id haciendo una consulta a la tabla “SELECT * FROM departamentos”).
*/
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id) VALUES ('Ana', 'Rodríguez', 28, 3000.00, 'ana_rodriguez@gmail.com', 1); 

/*Inserta otro empleado en la tabla "empleados" con los siguientes valores:
Nombre: Carlos.
Apellido: López.
Edad: 32.
Salario: 3200.50.
Correo electrónico: carlos_lopez@gmail.com
departamento_id: (debe coincidir con el ID del departamento "Recursos Humanos" que insertaste anteriormente).
*/
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id) VALUES ('Carlos', 'López', 32, 3200.50, 'carlos_lopez@gmail.com', 2);

/* Inserta un empleado en la tabla "empleados" con los siguientes valores:
Nombre: Laura
Apellido: Pérez
Edad: 26
Salario: 2800.75
Correo electrónico: laura_perez@gmail.com
departamento_id:  (debe coincidir con el ID del departamento "Ventas" que insertaste anteriormente).
*/
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id) VALUES ('Laura', 'Pérez', 26, 2800.75, 'laura_perez@gmail.com', 1);

/*Inserta otro empleado en la tabla "empleados" con los siguientes valores:
Nombre: Martín
Apellido: González
Edad: 30
Salario: 3100.25
Correo electrónico: martin_gonzalez@gmail.com
departamento_id: (debe coincidir con el ID del departamento "Recursos Humanos" que insertaste anteriormente).
*/
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id) VALUES ('Martín', 'González', 30, 3100.25, 'martin_gonzalez@gmail.com', 2);

-- Actualiza el salario del empleado con nombre "Ana" para aumentarlo en un 10%.
UPDATE empleados
SET salario = salario * 1.10
WHERE nombre = 'Ana';

-- Crea un departamento llamado “Contabilidad”. 
INSERT INTO departamentos (nombre) VALUES ('Contabilidad');

--  Cambia el departamento del empleado con nombre "Carlos" de "Recursos Humanos" a "Contabilidad"
UPDATE empleados
SET departamento_id = 3
WHERE nombre = 'Carlos';

-- Elimina al empleado con nombre "Laura"
DELETE FROM empleados
WHERE nombre = 'Laura';