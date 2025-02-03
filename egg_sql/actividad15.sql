-- Ejercicios vistas y funciones matemáticas

/*Crea una tabla triangulos_rectangulos con dos columnas: longitud_lado_adyacente y longitud lado_opuesto, ambos de tipo INT.
Rellena la tabla triangulos_rectangulos con 10 filas con enteros aleatorios entre 1 y 100
Crea una vista donde agregues la columna “hipotenusa” calculándola a partir de los otros dos lados. Utiliza el teorema de Pitágoras para realizar el cálculo: Siendo el lado adyacente “A” (cateto) y el opuesto “B” (cateto) y la hipotenusa “C”*/
CREATE TABLE triangulos_rectangulos (
    longitud_lado_adyacente INT,
    longitud_lado_opuesto INT
);
INSERT INTO triangulos_rectangulos 
VALUES 
(1, 2),
(3, 4),
(5, 6),
(7, 8),
(9, 10),
(11, 12),
(13, 14),
(15, 16),
(17, 18),
(19, 20);
CREATE VIEW vista_triangulos_rectangulos AS
SELECT 
    longitud_lado_adyacente, 
    longitud_lado_opuesto, 
    SQRT(POW(longitud_lado_adyacente, 2) + POW(longitud_lado_opuesto, 2)) AS hipotenusa
FROM triangulos_rectangulos;

/*Crea una tabla triangulos_rectangulos_2 : 
- Crea una tabla con las siguientes columnas:
    * angulo_alfa: Tipo INT, representa un ángulo en grados.
    * hipotenusa: Tipo INT, representa la longitud de la hipotenusa.
- Rellenar la tabla con datos aleatorios:
    * La columna angulo_alfa debe contener valores enteros aleatorios entre 1 y 89.
    * La columna hipotenusa debe contener valores enteros aleatorios entre 1 y 100.
- Crear una vista para cálculos adicionales:Crea una vista llamada vista_triangulos que incluya las siguientes columnas:
    * lado_adyacente: Calcula su valor con la fórmula y redondea su valor: Hipotenusa * cos(ángulo alfa en radianes).
    * lado_opuesto: Calcula su valor con la fórmula y redondea su valor: Hipotenusa *  sin⁡(ángulo alfa en radianes)
    * angulo_beta: Calcula su valor como 90
    * angulo_gamma: Este ángulo será siempre 90*/
CREATE TABLE triangulos_rectangulos_2 (
    angulo_alfa INT,
    hipotenusa INT
);
INSERT INTO triangulos_rectangulos_2
VALUES 
(1, 2),
(3, 4),
(5, 6),
(7, 8),
(9, 10),
(11, 12),
(13, 14),
(15, 16),
(17, 18),
(19, 20);
CREATE VIEW vista_triangulos AS
SELECT 
    angulo_alfa, 
    hipotenusa, 
    ROUND(hipotenusa * COS(RADIANS(angulo_alfa)), 2) AS lado_adyacente, 
    ROUND(hipotenusa * SIN(RADIANS(angulo_alfa)), 2) AS lado_opuesto, 
    90 - angulo_alfa AS angulo_beta, 
    90 AS angulo_gamma
FROM triangulos_rectangulos_2;

-- Revisión de los datos en la vista: Consulta la vista para verificar los resultados.
SELECT * FROM vista_triangulos;
SELECT * FROM vista_triangulos_rectangulos;

/*Crea una tabla mensajes que tenga una columna “datos” de tipo varchar y una columna valor_crc de tipo bigint, con las siguientes filas: VALUES
    ('Hola, ¿cómo estás? Espero que tengas un buen día.',3221685809),
    ('Ayer fui al cine a ver una película genial.', 951196167),
    ('Estoy emocionado por el próximo fin de semana.', 3275166159),
    ('Mi reunión se pospuso para el martes que viene.', 169741145),
    ('He estado trabajando en un proyecto importante.', 6480112535),
    ('Esta receta de pastel de manzana es deliciosa.', 2524836786),
    ('Planeo hacer un viaje a la playa este verano.', 5107635050),
    ('Mi gato se divierte jugando con su pelota.', 3578632817),
    ('Hoy es un día soleado y agradable.', 3675102258),
    ('El libro que estoy leyendo es muy interesante.', 854938277);*/
CREATE TABLE mensajes (
    datos VARCHAR(255),
    valor_crc BIGINT
);
INSERT INTO mensajes
VALUES
('Hola, ¿cómo estás? Espero que tengas un buen día.',3221685809),
('Ayer fui al cine a ver una película genial.', 951196167),
('Estoy emocionado por el próximo fin de semana.', 3275166159),
('Mi reunión se pospuso para el martes que viene.', 169741145),
('He estado trabajando en un proyecto importante.', 6480112535),
('Esta receta de pastel de manzana es deliciosa.', 2524836786),
('Planeo hacer un viaje a la playa este verano.', 5107635050),
('Mi gato se divierte jugando con su pelota.', 3578632817),
('Hoy es un día soleado y agradable.', 3675102258),
('El libro que estoy leyendo es muy interesante.', 854938277);

-- Crea una vista con una tercera columna “análisis” donde verifiques si el valor crc del mensaje es igual al valor de la segunda columna, si no es igual muestra un mensaje “adulterado” en la tercera columna o “correcto” en el caso contrario.
CREATE VIEW vista_mensajes AS
SELECT 
    datos, 
    valor_crc, 
    CASE 
        WHEN valor_crc = CRC32(datos) THEN 'correcto'
        ELSE 'adulterado'
    END AS analisis
FROM mensajes;
SELECT * FROM vista_mensajes;

-- Crea una tabla llamada ahorros con tres columnas: ahorro_inicial (la cantidad inicial de ahorros en dólares) de tipo decimal(10, 2), periodos (el número de períodos en años) de tipo int, y tasa_interes (la tasa de interés nominal anual en porcentaje) de tipo decimal(5, 2). 
CREATE TABLE ahorros (
    ahorro_inicial DECIMAL(10, 2),
    periodos INT,
    tasa_interes DECIMAL(5, 2)
);
-- Llena la tabla con 10 filas de números aleatorios para ahorro_inicial (un valor mayor a 1000), periodos (un valor entre 1 y 10), y tasa_interes (un valor entre 1 y 1,20).
INSERT INTO ahorros
VALUES
(1000.00, 1, 1.00),
(2000.00, 2, 1.05),
(3000.00, 3, 1.06),
(4000.00, 4, 1.07),
(5000.00, 5, 1.08),
(6000.00, 6, 1.10),
(7000.00, 7, 1.15),
(8000.00, 8, 1.16),
(9000.00, 9, 1.17),
(10000.00, 10, 1.19);

/*Crea una vista llamada vista_ahorros_futuros que incluya una columna con el cálculo de los ahorros futuros ajustados por la tasa de interés. Para esto utilizaremos la fórmula para calcular el interés compuesto:
VF = VA x (1+r)^n
VF: Valor futuro (ahorros futuros).
VA: Valor actual (ahorro_inicial).
r: La tasa de interés (tasa_interes).
n: El número de periodos (periodos).*/
CREATE VIEW vista_ahorros_futuros AS
SELECT 
    ahorro_inicial, 
    periodos, 
    tasa_interes, 
    ahorro_inicial * POW((1 + tasa_interes / 100), periodos) AS ahorros_futuros
FROM ahorros;
SELECT * FROM vista_ahorros_futuros;

-- Ejercicios  Complementarios

-- Crea una tabla llamada concentracion_de_hidrogenos con una columna de id incremental, y otra columna nanomoles_por_litro, y rellénala con 10 números, estos numeros deben ser el resultado de elevar 10 a un exponente aleatorio entero entre 9 y (-5).
CREATE TABLE concentracion_de_hidrogenos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nanomoles_por_litro DOUBLE
);
INSERT INTO concentracion_de_hidrogenos (nanomoles_por_litro)
VALUES
(POW(10, 9)),
(POW(10, 8)),
(POW(10, 7)),
(POW(10, 6)),
(POW(10, 5)),
(POW(10, 4)),
(POW(10, 3)),
(POW(10, 2)),
(POW(10, 1)),
(POW(10, 0));

/*Crea una vista donde agregues la columna ph donde calcules el ph de la sustancia. Utiliza la siguiente formula: 
pH = -log[H+]
Log: es el logaritmo en base 10.
[H+]: es la concentración de hidrogeno en moles.
Como la tabla tiene guarda el valor de la concentración en nanomoles debes hacer la conversión a moles primero:
1 mol = 1.000.000.000 nanomoles.*/
CREATE VIEW vista_concentracion_de_hidrogenos AS
SELECT 
    id, 
    nanomoles_por_litro, 
    -LOG10(nanomoles_por_litro / 1000000000) AS ph
FROM concentracion_de_hidrogenos;
SELECT * FROM vista_concentracion_de_hidrogenos;

/*Crea una vista donde agregues la columna escala_de_ph donde etiquetes la sustancia con las siguientes categorías según su ph:
Acida : 7 < ph > 0
Neutra: ph = 7
Alcalina: 14 < ph > 7*/
CREATE VIEW vista_concentracion_de_hidrogenos AS
SELECT 
    id, 
    nanomoles_por_litro, 
    -LOG10(nanomoles_por_litro / 1000000000) AS ph,
    CASE 
        WHEN -LOG10(nanomoles_por_litro / 1000000000) > 7 THEN 'Alcalina'
        WHEN -LOG10(nanomoles_por_litro / 1000000000) = 7 THEN 'Neutra'
        ELSE 'Acida'
    END AS escala_de_ph
FROM concentracion_de_hidrogenos;
SELECT * FROM vista_concentracion_de_hidrogenos;

/*Crea la tabla numeros_ocultos con la columna_1 de tipo varchar y la columna_2 de int y rellénala con estos valores:
VALUES
('EB4ECB', 16),
('25SK1E', 31),
('8C2B88', 22),
('58D660A', 15),
('100010020211000', 3),
('20251A2', 13),
('4MFL6M', 23),
('IO36L', 29),
('748D676', 14),
('J1G50', 32)
Todos los números de la primera columna de la tabla anterior están expresados en una base numérica correspondiente a la segunda columna, crea una vista con una tercera columna para mostrar los números de la columna_1 expresados en base 10 y ordénalos de mayor a menor.*/
CREATE TABLE numeros_ocultos (
    columna_1 VARCHAR(255),
    columna_2 INT
);
INSERT INTO numeros_ocultos
VALUES
('EB4ECB', 16),
('25SK1E', 31),
('8C2B88', 22),
('58D660A', 15),
('100010020211000', 3),
('20251A2', 13),
('4MFL6M', 23),
('IO36L', 29),
('748D676', 14),
('J1G50', 32);
CREATE VIEW vista_numeros_ocultos AS
SELECT 
    columna_1, 
    columna_2, 
    CONV(columna_1, columna_2, 10) AS base_10
FROM numeros_ocultos
ORDER BY base_10 DESC;
SELECT * FROM vista_numeros_ocultos;

/*Actualiza la vista_ahorros_futuros para que no incluya la columna ahorro_inicial, y luego crea una nueva vista vista_ahorro_inicial donde utilices la vista_ahorros_futuros y la siguiente fórmula para calcular una nueva columna ahorro_inicial, incluye las demás columnas excepto tasa_interes en la vista final: 
VA = VF / (1+r)^n
VA: Valor actual (ahorro_inicial).
VF: Valor futuro (ahorros futuros).
r:  La tasa de interés (tasa_interes).
n: El número de periodos (periodos).*/
CREATE OR REPLACE VIEW vista_ahorros_futuros AS
SELECT 
    periodos, 
    tasa_interes, 
    ahorro_inicial * POW((1 + tasa_interes / 100), periodos) AS ahorros_futuros
FROM ahorros;
CREATE OR REPLACE VIEW vista_ahorro_inicial AS
SELECT 
    periodos, 
    ahorros_futuros,
    ahorros_futuros / POW((1 + tasa_interes / 100), periodos) AS ahorro_inicial
FROM vista_ahorros_futuros;
SELECT * FROM vista_ahorro_inicial;

/*Crea una nueva vista vista_tasa_interes donde utilices la vista_ahorro_inicial y la siguiente fórmula para calcular la columna tasa_interes, incluye las demás columnas, excepto “periodos”, en la vista final:
r = ( (VF / VA)^(1/n) ) - 1
r: La tasa de interés (tasa_interes).
VF: Valor futuro (ahorros futuros).
VA: Valor actual (ahorro_inicial).
n: El número de periodos (periodos).*/
CREATE OR REPLACE VIEW vista_tasa_interes AS
SELECT 
    ahorro_inicial, 
    ahorros_futuros, 
    POW(ahorros_futuros / ahorro_inicial, 1 / periodos) - 1 AS tasa_interes 
FROM vista_ahorro_inicial;
SELECT * FROM vista_tasa_interes;

/*Crea una nueva vista vista_periodos donde utilices la vista_tasa_interes y la siguiente fórmula para calcular la columna periodos, incluye todas las columnas en la vista final:
n = ln(VF / VA) / ln(1 + r)
n: El número de periodos (periodos).
VF: Valor futuro (ahorros futuros).
VA: Valor actual (ahorro_inicial).
r: La tasa de interés (tasa_interes).*/
CREATE OR REPLACE VIEW vista_periodos AS
SELECT 
    ahorro_inicial, 
    ahorros_futuros, 
    tasa_interes,
    LOG(ahorros_futuros / ahorro_inicial) / LOG(1 + tasa_interes) AS periodos
FROM vista_tasa_interes;
SELECT * FROM vista_periodos;