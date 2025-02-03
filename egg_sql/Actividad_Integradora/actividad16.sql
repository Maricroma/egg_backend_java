-- Ejercicios integradores

-- Mostrar el nombre y peso de los diez jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por peso.
SELECT nombre,
    peso
FROM jugadores
WHERE posicion = 'C'
    AND peso > 200
ORDER BY peso DESC
LIMIT 10;

-- Mostrar el nombre de los equipos del este (East).
SELECT nombre
FROM equipos
WHERE conferencia = 'East';

-- Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT *
FROM equipos
WHERE ciudad LIKE 'c%'
ORDER BY nombre;

-- Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT puntos_por_partido
FROM estadisticas
WHERE jugador = (
        SELECT codigo
        FROM jugadores
        WHERE nombre = 'Pau Gasol'
    )
    AND temporada = '04/05';

-- Mostrar los diez jugadores con más puntos en toda su carrera con un redondeo de dos decimales.
SELECT nombre,
    ROUND(SUM(puntos_por_partido), 2) AS puntos
FROM estadisticas
    JOIN jugadores ON estadisticas.jugador = jugadores.codigo
GROUP BY nombre
ORDER BY puntos DESC
LIMIT 10;

-- Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT j.nombre_equipo,
    e.conferencia,
    e.division
FROM jugadores j
    JOIN equipos e ON j.nombre_equipo = e.nombre
WHERE j.altura = (
        SELECT MAX(altura)
        FROM jugadores
    );

-- Mostrar los 10 partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT equipo_local,
    equipo_visitante,
    ABS(puntos_local - puntos_visitante) AS diferencia
FROM partidos
ORDER BY diferencia DESC
LIMIT 10;

-- Muestra el nombre del equipo con la mayor diferencia de puntos totales de la temporada temporada "00/01".
SELECT e.nombre,
    ABS(
        SUM(
            CASE
                WHEN e.nombre = p.equipo_local THEN p.puntos_local
                ELSE 0
            END
        ) - SUM(
            CASE
                WHEN e.nombre = p.equipo_visitante THEN p.puntos_visitante
                ELSE 0
            END
        )
    ) AS diferencia_puntos
FROM equipos e
    JOIN partidos p ON e.nombre IN (p.equipo_local, p.equipo_visitante)
WHERE p.temporada = '00/01'
GROUP BY e.nombre
ORDER BY diferencia_puntos DESC
LIMIT 1;

-- Encuentra el nombre de los diez equipos que mejor porcentaje de victorias tengan en la temporada "98/99". El número de porcentaje debe estar escrito del 1 al 100 con hasta dos decimales y acompañado por el símbolo “%”.
SELECT e.nombre,
    CONCAT(
        ROUND(
            100.0 * SUM(
                CASE
                    WHEN e.nombre = p.equipo_local
                    AND p.puntos_local > p.puntos_visitante THEN 1
                    WHEN e.nombre = p.equipo_visitante
                    AND p.puntos_visitante > p.puntos_local THEN 1
                    ELSE 0
                END
            ) / COUNT(*),
            2
        ),
        '%'
    ) AS porcentaje_victorias
FROM equipos e
    JOIN partidos p ON e.nombre IN (p.equipo_local, p.equipo_visitante)
WHERE p.temporada = '98/99'
GROUP BY e.nombre
ORDER BY ROUND(
        100.0 * SUM(
            CASE
                WHEN e.nombre = p.equipo_local
                AND p.puntos_local > p.puntos_visitante THEN 1
                WHEN e.nombre = p.equipo_visitante
                AND p.puntos_visitante > p.puntos_local THEN 1
                ELSE 0
            END
        ) / COUNT(*),
        2
    ) DESC
LIMIT 10;

-- Calcula el promedio de puntos por partido de los jugadores que son pivotes ('C') y tienen más de 7 pies de altura, y redondea el resultado a dos decimales.
SELECT j.nombre, ROUND(AVG(e.puntos_por_partido), 2) AS promedio_puntos_por_partido
FROM jugadores j
    JOIN estadisticas e ON j.codigo = e.jugador
WHERE j.Posicion = 'C' 
AND CAST(SUBSTRING_INDEX(j.Altura, '-', 1) AS UNSIGNED) > 7
GROUP BY j.nombre;

-- Muestra el nombre del jugador que ha registrado el mayor número de asistencias en un solo partido.
SELECT j.nombre
FROM jugadores j
    JOIN estadisticas e ON j.codigo = e.jugador
WHERE e.asistencias_por_partido = (
        SELECT MAX(asistencias_por_partido)
        FROM estadisticas
    );

-- Encuentra el total de partidos en los que el equipo local anotó más de 100 puntos y el equipo visitante anotó menos de 90 puntos.
SELECT COUNT(*) AS total_partidos
FROM partidos
WHERE puntos_local > 100
    AND puntos_visitante < 90;

-- Calcula la diferencia de puntos promedio en todos los partidos de la temporada “00/01” y redondea el resultado a dos decimales.
SELECT ROUND(AVG(puntos_local - puntos_visitante), 2) AS diferencia_puntos_promedio
FROM partidos
WHERE temporada = '00/01';

-- Encuentra el nombre del equipo que ha tenido al menos un jugador que ha promediado más de 10 rebotes por partido en la temporada “97/98”.
SELECT e.nombre
FROM equipos e
    JOIN jugadores j ON e.nombre = j.nombre_equipo
WHERE j.codigo = ANY (
    SELECT jugador
    FROM estadisticas
    WHERE temporada = '97/98'
    GROUP BY jugador
    HAVING AVG(rebotes_por_partido) > 10
);
