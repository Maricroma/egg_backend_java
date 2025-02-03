-- Ejercicios funciones de  fecha y hora

/*Crea una tabla llamada "envios" con cuatro columnas: "id" de tipo INT como clave primaria y autoincremental, "fecha_envio" de tipo DATETIME,  "fecha_entrega" de tipo DATETIME y "codigo_producto" de tipo VARCHAR(10). Luego, inserta siete filas en la tabla "envios" con los siguientes datos:
Fecha Envío: '2022-01-15 08:00:00', Fecha Entrega: '2022-01-20 12:30:00', Código Producto: 'ABC123'.
Fecha Envío: '2022-02-10 10:15:00', Fecha Entrega: '2022-02-15 14:45:00', Código Producto: 'XYZ789'.
Fecha Envío: '2022-03-05 09:30:00', Fecha Entrega: '2022-03-10 13:20:00', Código Producto: 'PQR456'.
Fecha Envío: '2022-04-20 11:45:00', Fecha Entrega: '2022-04-25 15:10:00', Código Producto: 'LMN001'.
Fecha Envío: '2022-05-12 07:55:00', Fecha Entrega: '2022-05-17 10:25:00', Código Producto: 'DEF777'.
Fecha Envío: '2022-06-08 08:20:00', Fecha Entrega: '2022-06-13 12:40:00', Código Producto: 'GHI888'.
Fecha Envío: '2022-07-03 10:05:00', Fecha Entrega: '2022-07-08 14:15:00', Código Producto: 'JKL999'.*/
CREATE TABLE envios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fecha_envio DATETIME,
    fecha_entrega DATETIME,
    codigo_producto VARCHAR(10)
);
INSERT INTO envios 
VALUES
(NULL, '2022-01-15 08:00:00', '2022-01-20 12:30:00', 'ABC123'),
(NULL, '2022-02-10 10:15:00', '2022-02-15 14:45:00', 'XYZ789'),
(NULL, '2022-03-05 09:30:00', '2022-03-10 13:20:00', 'PQR456'),
(NULL, '2022-04-20 11:45:00', '2022-04-25 15:10:00', 'LMN001'),
(NULL, '2022-05-12 07:55:00', '2022-05-17 10:25:00', 'DEF777'),
(NULL, '2022-06-08 08:20:00', '2022-06-13 12:40:00', 'GHI888'),
(NULL, '2022-07-03 10:05:00', '2022-07-08 14:15:00', 'JKL999');

-- Utilizando la función DATE_ADD, calcula la fecha de entrega programada para un envío con código de producto 'ABC123' cuando se le añaden 5 días a la fecha de envío.
SELECT DATE_ADD(fecha_envio, INTERVAL 5 DAY) AS fecha_entrega_programada
FROM envios
WHERE codigo_producto = 'ABC123';

-- Utilizando la función ADDTIME, encuentra la hora estimada de entrega para un envío con código de producto 'XYZ789' si se suma 4 horas y 30 minutos a la hora de entrega. 
SELECT ADDTIME(fecha_entrega, '4:30') AS hora_estimada_entrega
FROM envios
WHERE codigo_producto = 'XYZ789';

-- Utilizando la función CONVERT_TZ, convierte la fecha de envío de un envío con código de producto 'PQR456' de la zona horaria 'UTC' (+00:00) a la zona horaria de Argentina GMT-3 (-03:00).
SELECT CONVERT_TZ(fecha_envio, '+00:00', '-03:00') AS fecha_envio_argentina
FROM envios
WHERE codigo_producto = 'PQR456';

-- Calcula la diferencia en días entre la fecha de entrega y la fecha de envío para el envío con código de producto 'LMN001' utilizando la función DATEDIFF.
SELECT DATEDIFF(fecha_entrega, fecha_envio) AS dias_entrega
FROM envios
WHERE codigo_producto = 'LMN001';

-- Utiliza la función CURDATE para obtener la fecha actual y, a continuación, obtener la diferencia en días entre la fecha de entrega con código de producto 'DEF777' y la fecha actual.    
SELECT DATEDIFF(CURDATE(), fecha_entrega) AS dias_entrega_actual
FROM envios
WHERE codigo_producto = 'DEF777';

-- Utilizando la función CURTIME, obtén la hora actual del sistema.
SELECT CURTIME() AS hora_actual;

-- Utiliza la función DATE para extraer la fecha de envío del envío con ID 3.
SELECT DATE(fecha_envio) AS fecha_envio
FROM envios
WHERE id = 3;

-- Utiliza la función DATE_ADD para calcular la fecha de entrega programada para el envío con código de producto 'XYZ789' si se le agregan 3 días a la fecha de envío.
SELECT DATE_ADD(fecha_envio, INTERVAL 3 DAY) AS fecha_entrega_programada
FROM envios
WHERE codigo_producto = 'XYZ789';

-- Utiliza la función DATE_FORMAT para mostrar la fecha de envío del envío con ID 6 en el formato 'DD-MM-YYYY'.
SELECT DATE_FORMAT(fecha_envio, '%d-%m-%Y') AS fecha_envio_formato
FROM envios
WHERE id = 6;

-- Utiliza la función DATE_SUB para calcular la fecha de envío del envío con ID 4 si se le restan 2 días.
SELECT DATE_SUB(fecha_envio, INTERVAL 2 DAY) AS fecha_envio_restante
FROM envios
WHERE id = 4;

-- Utiliza la función DATEDIFF para calcular la diferencia en días entre la fecha de envío y la fecha de entrega programada para el envío con código de producto 'PQR456'.
SELECT DATEDIFF(fecha_entrega, fecha_envio) AS dias_entrega_programada
FROM envios
WHERE codigo_producto = 'PQR456';

-- Utiliza la función DAY para obtener el día del mes en que se realizó el envío con ID 2.
SELECT DAY(fecha_envio) AS dia_envio
FROM envios
WHERE id = 2;

-- Utiliza la función DAYNAME para obtener el nombre del día de la semana en que se entregará el envío con código de producto 'DEF777'.
SELECT DAYNAME(fecha_entrega) AS dia_semana_entrega
FROM envios
WHERE codigo_producto = 'DEF777';

-- Utiliza la función DAYOFMONTH para obtener el día del mes en que se entregará el envío con código de producto 'GHI888'.
SELECT DAYOFMONTH(fecha_entrega) AS dia_mes_entrega
FROM envios
WHERE codigo_producto = 'GHI888';

-- Utiliza la función PERIOD_ADD para agregar un período de 3 meses al año-mes '2022-07'.
SELECT PERIOD_ADD('202207', 3) AS periodo_agregado;

-- Utiliza la función PERIOD_DIFF para calcular el número de meses entre los períodos '2022-03' y '2022-12'.
SELECT PERIOD_DIFF('202212', '202203') AS meses_diferencia;

-- Utiliza la función QUARTER para obtener el trimestre de la fecha de entrega del envío con código de producto 'PQR456'.
SELECT QUARTER(fecha_entrega) AS trimestre_entrega
FROM envios
WHERE codigo_producto = 'PQR456';

-- Utiliza la función SEC_TO_TIME para convertir 3665 segundos en formato 'hh:mm:ss'.
SELECT SEC_TO_TIME(3665) AS tiempo_convertido;

-- Utiliza la función SECOND para obtener los segundos de la hora de envío del envío con ID 2.
SELECT SECOND(fecha_envio) AS segundos_envio
FROM envios
WHERE id = 2;

-- Utiliza la función STR_TO_DATE para convertir la cadena '2022()08()15' en una fecha.
SELECT STR_TO_DATE('2022()08()15', '%Y()%m()%d') AS fecha_convertida;

-- Utiliza la función SUBDATE (o DATE_SUB) para restar 5 días a la fecha de entrega del envío con código de producto 'GHI888'.
SELECT SUBDATE(fecha_entrega, 5) AS fecha_entrega_restante
FROM envios
WHERE codigo_producto = 'GHI888';

-- Utiliza la función SUBTIME para restar 2 horas y 15 minutos a la hora de envío del envío con ID 7.
SELECT SUBTIME(fecha_envio, '2:15') AS hora_envio_restante
FROM envios
WHERE id = 7;

-- Utiliza la función TIME para extraer la porción de tiempo de la fecha de envío del envío con ID 1.
SELECT TIME(fecha_envio) AS tiempo_envio
FROM envios
WHERE id = 1;

-- Utiliza la función TIME_FORMAT para formatear la hora de envío del envío con ID 2 en 'hh:mm:ss'.
SELECT TIME_FORMAT(fecha_envio, '%H:%i:%s') AS hora_envio_formato
FROM envios
WHERE id = 2;

-- Utiliza la función TIME_TO_SEC para convertir la hora de envío del envío con ID 3 en segundos.
SELECT TIME_TO_SEC(fecha_envio) AS tiempo_segundos
FROM envios
WHERE id = 3;

-- Utiliza la función TIMEDIFF para calcular la diferencia de horas entre las fechas de envío y entrega del envío con ID 4.
SELECT TIMEDIFF(fecha_entrega, fecha_envio) AS diferencia_horas
FROM envios
WHERE id = 4;

-- Utiliza la función SYSDATE para obtener la hora exacta en la que se ejecuta la función en la consulta. Para comprobar esto invoca SYSDATE, luego la función SLEEP durante 5 segundos y luego vuelve a invocar la función SYSDATE, y verifica la diferencia entre ambas invocaciones con TIMEDIFF.
SELECT TIMEDIFF(hora_final, hora_inicial) AS diferencia_de_hora
FROM (
        SELECT SYSDATE() AS hora_inicial,
            SLEEP(5),
            SYSDATE() AS hora_final
    ) t;

-- Crea una consulta que utilice la función TIMESTAMP para obtener todos los valores de fecha_envio sumandole 12 horas.
SELECT TIMESTAMP(fecha_envio, '12:00:00') AS fecha_envio_mas_12_horas
FROM envios;

-- Utiliza la función TIMESTAMPADD para agregar 3 horas a la fecha de entrega del envío con código de producto 'XYZ789'.
SELECT TIMESTAMPADD(HOUR, 3, fecha_entrega) AS fecha_entrega_mas_3_horas
FROM envios
WHERE codigo_producto = 'XYZ789';

-- Ejercicios  Complementarios 

-- Utiliza la función DAYOFWEEK para obtener el número del día de la semana en que se realizó el envío con ID 7.
SELECT DAYOFWEEK(fecha_envio) AS dia_semana_envio
FROM envios
WHERE id = 7;

-- Utiliza la función DAYOFYEAR para obtener el día del año en que se entregará el envío con código de producto 'JKL999'.
SELECT DAYOFYEAR(fecha_entrega) AS dia_anio_entrega
FROM envios
WHERE codigo_producto = 'JKL999';

-- Utiliza la función EXTRACT para obtener el año de la fecha de envío del envío con código de producto 'LMN001'.
SELECT EXTRACT(YEAR FROM fecha_envio) AS anio_envio
FROM envios
WHERE codigo_producto = 'LMN001';

-- Utiliza la función FROM_DAYS para obtener la fecha correspondiente a 737402 días a partir del año 0.
SELECT FROM_DAYS(737402) AS fecha_convertida;

-- Utiliza la función FROM_UNIXTIME para saber que fecha sería si pasaron 1.617.799.784 segundos desde 1970.
SELECT FROM_UNIXTIME(1617799784) AS fecha_convertida;

-- Utiliza la función GET_FORMAT para obtener el formato de fecha “EUR” para formatear la fecha de entrega del envío con código de producto 'XYZ789'.
SELECT DATE_FORMAT(fecha_entrega, GET_FORMAT(DATE, 'EUR')) AS formato_fecha_entrega
FROM envios
WHERE codigo_producto = 'XYZ789';

-- Utiliza la función HOUR para extraer la hora de la fecha de envío del envío con ID 1.
SELECT HOUR(fecha_envio) AS hora_envio
FROM envios
WHERE id = 1;

-- Utiliza la función LAST_DAY para obtener el último día del mes de la fecha de entrega programada para el envío con código de producto 'XYZ789'.
SELECT LAST_DAY(fecha_entrega) AS ultimo_dia_mes
FROM envios
WHERE codigo_producto = 'XYZ789';

-- Utiliza la función LOCALTIME para obtener la hora y la fecha local actual del servidor.
SELECT LOCALTIME() AS hora_fecha_local;

-- Utiliza la función MAKEDATE para crear una fecha correspondiente al año 2023 y al día 180 del año.
SELECT MAKEDATE(2023, 180) AS fecha_creada;

-- Utiliza la función MAKETIME para crear una hora con 3 horas, 30 minutos y 15 segundos.
SELECT MAKETIME(3, 30, 15) AS hora_creada;

-- Utiliza la función MICROSECOND para obtener los microsegundos de la fecha de entrega del envío con ID 3.
SELECT MICROSECOND(fecha_entrega) AS microsegundos_entrega
FROM envios
WHERE id = 3;

-- Utiliza la función MINUTE para obtener el minuto de la hora de envío del envío con ID 4.
SELECT MINUTE(fecha_envio) AS minuto_envio
FROM envios
WHERE id = 4;

-- Utiliza la función MONTH para obtener el mes de la fecha de envío del envío con ID 5.
SELECT MONTH(fecha_envio) AS mes_envio
FROM envios
WHERE id = 5;

-- Utiliza la función MONTHNAME para obtener el nombre del mes de la fecha de envío del envío con ID 6.
SELECT MONTHNAME(fecha_envio) AS mes_nombre_envio
FROM envios
WHERE id = 6;

-- Utiliza la función NOW para obtener la fecha y hora actual.
SELECT NOW() AS fecha_hora_actual;

-- Utiliza la función TIMESTAMPDIFF para calcular la diferencia en días entre la fecha de envío del envío con ID 5 y la fecha de entrega del envío con ID 6.
SELECT TIMESTAMPDIFF(DAY, fecha_envio, fecha_entrega) AS dias_diferencia
FROM (
    SELECT fecha_envio
    FROM envios
    WHERE id = 5
) t1,
(
    SELECT fecha_entrega
    FROM envios
    WHERE id = 6
) t2;

-- Utiliza la función TO_DAYS para convertir la fecha de envío del envío con ID 7 en días.
SELECT TO_DAYS(fecha_envio) AS dias_envio
FROM envios
WHERE id = 7;

-- Utiliza la función TO_SECONDS para convertir la fecha de entrega del envío con código de producto 'JKL999' en segundos desde el Año 0.
SELECT TO_SECONDS(fecha_entrega) AS segundos_entrega
FROM envios
WHERE codigo_producto = 'JKL999';

-- Utiliza la función UNIX_TIMESTAMP para obtener una marca de tiempo Unix de la fecha de envío del envío con ID 1.
SELECT UNIX_TIMESTAMP(fecha_envio) AS marca_tiempo_unix
FROM envios
WHERE id = 1;

-- Utiliza la función UTC_DATE para obtener la fecha UTC actual.
SELECT UTC_DATE() AS fecha_utc_actual;

-- Utiliza la función UTC_TIME para obtener la hora UTC actual.
SELECT UTC_TIME() AS hora_utc_actual;

-- Utiliza la función UTC_TIMESTAMP para obtener la fecha y hora UTC actual.
SELECT UTC_TIMESTAMP() AS fecha_hora_utc_actual;

-- Utiliza la función WEEK para obtener el número de semana de la fecha de envío del envío con ID 2.
SELECT WEEK(fecha_envio) AS semana_envio
FROM envios
WHERE id = 2;

-- Utiliza la función WEEKDAY para obtener el índice del día de la semana de la fecha de envío del envío con ID 3.
SELECT WEEKDAY(fecha_envio) AS dia_semana_indice
FROM envios
WHERE id = 3;

-- Utiliza la función WEEKOFYEAR para obtener la semana del calendario de la fecha de entrega del envío con ID 4.
SELECT WEEKOFYEAR(fecha_entrega) AS semana_calendario_entrega
FROM envios
WHERE id = 4;

-- Utiliza la función YEAR para obtener el año de la fecha de envío del envío con ID 5.
SELECT YEAR(fecha_envio) AS anio_envio
FROM envios
WHERE id = 5;

-- Utiliza la función YEARWEEK para obtener el año y la semana de la fecha de envío del envío con ID 6.
SELECT YEARWEEK(fecha_envio) AS anio_semana_envio
FROM envios
WHERE id = 6;

