## Clase Arrays

### Ejercicio 1

Ordenar en forma descendente
Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.

Búsqueda binaria
La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.

Comparando arreglos
Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.

### Ejercicio 2

Copiando parte de un arreglo. 
Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.

### Ejercicio 3

Rellenando un arreglo
El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo modificado. Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.

### Complementario

Escribe un programa en Java que realice lo siguiente:

Solicita al usuario un tamaño para un arreglo.

Luego, pídele que ingrese un número con el que desea rellenar el array.

Solicita el índice hasta el cual quiere rellenar el array con el número anterior.

El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.

Asegúrate de validar lo siguiente:

La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.

Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo.

El índice siempre debe ser menor que el tamaño total del arreglo.

Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que el último índice ingresado; a su vez, se debe rellenar el array con el nuevo número desde el índice anterior hasta el nuevo índice.

Por último, el programa debe imprimir por consola el arreglo completo.
