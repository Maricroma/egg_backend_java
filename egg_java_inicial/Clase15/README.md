## Actividad Integradora

### Ejercicio 1

Generando contraseñas
Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.

Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.

Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.

Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola.

### Ejercicio 2

Estadísticas de calificaciones
Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.

Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo.

Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

Por último, imprimiré los resultados en consola.

### Ejercicio 3

Fibonacci
Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.

La serie de Fibonacci comienza de la siguiente manera:

Posición 0: 0

Posición 1: 1

Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)

Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)

Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)

Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3.

### Ejercicio 4

Números primos
Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).

Un número es primo si solo tiene dos divisores: 1 y él mismo. 