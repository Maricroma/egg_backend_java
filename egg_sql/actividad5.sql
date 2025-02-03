-- Actividad: Ejercicios Complementarios
USE mi_bd;

--  Inserta una venta en la tabla "ventas" donde el cliente "Juan Pérez" compra una "Laptop" con una cantidad de 2 y el vendedor tiene el nombre "Ana" y apellido "Rodríguez".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id) 
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Laptop'), 
    (SELECT id FROM clientes WHERE nombre = 'Juan Pérez'), 
    2, 
    (SELECT precio FROM productos WHERE nombre = 'Laptop'), 
    (SELECT id FROM empleados WHERE nombre = 'Ana' AND apellido = 'Rodríguez')
);

-- Inserta una venta en la tabla "ventas" donde el cliente "María García" compra un "Teléfono móvil" con una cantidad de 3 y el vendedor tiene el nombre "Carlos" y apellido "López".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id) 
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Teléfono móvil'), 
    (SELECT id FROM clientes WHERE nombre = 'María García'), 
    3, 
    (SELECT precio FROM productos WHERE nombre = 'Teléfono móvil'), 
    (SELECT id FROM empleados WHERE nombre = 'Carlos' AND apellido = 'López')
);

-- Crea una venta en la tabla "ventas" donde el cliente "Carlos Sánchez" compra una "Impresora" con una cantidad de 1 y el vendedor tiene el nombre "Marta" y apellido "Ramírez".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id)
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Impresora'), 
    (SELECT id FROM clientes WHERE nombre = 'Carlos Sánchez'), 
    1, 
    (SELECT precio FROM productos WHERE nombre = 'Impresora'), 
    (SELECT id FROM empleados WHERE nombre = 'Marta' AND apellido = 'Ramírez')
);

-- Inserta una venta en la tabla "ventas" donde el cliente "Ana López" compra una "Laptop" con una cantidad de 1 y el vendedor tiene el nombre "Carlos" y apellido "López".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id)
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Laptop'), 
    (SELECT id FROM clientes WHERE nombre = 'Ana López'), 
    1, 
    (SELECT precio FROM productos WHERE nombre = 'Laptop'), 
    (SELECT id FROM empleados WHERE nombre = 'Carlos' AND apellido = 'López')
);

-- Crea una venta en la tabla "ventas" donde el cliente "Juan Pérez" compra una "Tablet" con una cantidad de 2 y el vendedor tiene el nombre "Luis" y apellido "Fernández".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id)
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Tablet'), 
    (SELECT id FROM clientes WHERE nombre = 'Juan Pérez'), 
    2, 
    (SELECT precio FROM productos WHERE nombre = 'Tablet'), 
    (SELECT id FROM empleados WHERE nombre = 'Luis' AND apellido = 'Fernández')
);

--  Inserta una venta en la tabla "ventas" donde el cliente "María García" compra un "Teléfono móvil" con una cantidad de 1 y el vendedor tiene el nombre "Marta" y apellido "Ramírez".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id)
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Teléfono móvil'), 
    (SELECT id FROM clientes WHERE nombre = 'María García'), 
    1, 
    (SELECT precio FROM productos WHERE nombre = 'Teléfono móvil'), 
    (SELECT id FROM empleados WHERE nombre = 'Marta' AND apellido = 'Ramírez')
);

-- Crea una venta en la tabla "ventas" donde el cliente "Carlos Sánchez" compra una "Impresora" con una cantidad de 2 y el vendedor tiene el nombre "Lorena" y apellido "Guzmán".
INSERT INTO ventas (
    producto_id, 
    cliente_id, 
    cantidad, 
    precio_unitario, 
    empleado_id)
VALUES (
    (SELECT id FROM productos WHERE nombre = 'Impresora'), 
    (SELECT id FROM clientes WHERE nombre = 'Carlos Sánchez'), 
    2, 
    (SELECT precio FROM productos WHERE nombre = 'Impresora'), 
    (SELECT id FROM empleados WHERE nombre = 'Lorena' AND apellido = 'Guzmán')
);