-- Ejercicios  Complementarios 

/*A continuación, se deben realizar las siguientes consultas sobre la base de datos:
Subconsultas (En la cláusula WHERE)
Con operadores básicos de comparación*/

-- Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto 
WHERE codigo_fabricante = (
    SELECT codigo FROM fabricante 
    WHERE nombre = 'Lenovo'
);

-- Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto 
WHERE precio = (
    SELECT MAX(precio) FROM producto 
    WHERE codigo_fabricante = (
        SELECT codigo FROM fabricante 
        WHERE nombre = 'Lenovo'
    )
);

-- Lista el nombre del producto más caro del fabricante Lenovo.
SELECT nombre FROM producto 
    WHERE codigo_fabricante = (
        SELECT codigo FROM fabricante 
        WHERE nombre = 'Lenovo'
    )
ORDER BY precio DESC
LIMIT 1;

-- Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
SELECT nombre FROM producto 
    WHERE codigo_fabricante = (
        SELECT codigo FROM fabricante 
        WHERE nombre = 'Asus'
    )
    AND precio > (
        SELECT AVG(precio) FROM producto 
        WHERE codigo_fabricante = (
            SELECT codigo FROM fabricante 
            WHERE nombre = 'Asus'
        )
    );

-- Subconsultas con IN y NOT IN

-- Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
SELECT nombre FROM fabricante 
WHERE codigo IN (
    SELECT DISTINCT codigo_fabricante FROM producto
);

-- Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
SELECT nombre FROM fabricante 
WHERE codigo NOT IN (
    SELECT DISTINCT codigo_fabricante FROM producto
);

-- Subconsultas (En la cláusula HAVING)

-- Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.
SELECT f.nombre, COUNT(p.codigo) AS cantidad_productos 
FROM fabricante f
JOIN producto p ON f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING cantidad_productos = (
    SELECT COUNT(codigo) FROM producto 
    WHERE codigo_fabricante = (
        SELECT codigo FROM fabricante 
        WHERE nombre = 'Lenovo'
    )
);