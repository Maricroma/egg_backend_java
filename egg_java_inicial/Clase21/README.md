## Métodos III

### Ejercicio 1

Fibonacci y Recursividad
En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.

Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:

- Posición 0: 0

- Posición 1: 1

- Posición 2: 1

- Posición 3: 2

- Posición 4: 3

Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de Fibonacci para cualquier posición ingresada por el usuario

### Ejercicio 2

Factorial y recursividad
Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.

### Ejercicio 3

Crea un método llamado "esPrimo()" que reciba por parámetro un "int" y devuelva un valor booleano que verifique si el número es primo o no. Luego, intenta modificar la lógica para resolverlo utilizando recursividad.

### Ejercicio 4

Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:

1. Muestra un menú de opciones al usuario donde podrá:

a. Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

b. Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).

c. Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.

d. Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.

e. Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".

f. Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.

g. Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).

h. Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.

i. Salir: Terminar el programa.

Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".

Realiza las validaciones que consideres necesarias.

### Complementario 

Juego de Adivinar Palabra:

Escribe un programa que implemente un juego en el que el usuario debe adivinar una palabra aleatoria. El programa elegirá una palabra al azar de una lista predefinida y mostrará una pista de la longitud de la palabra. El usuario tendrá un número limitado de intentos para adivinar la palabra. Después de cada intento, el programa mostrará cuántas letras ha adivinado correctamente y en qué posición se encuentran.

El programa debe tener las siguientes características:

Utiliza un array de Strings para almacenar una lista de palabras predefinidas.

Utiliza el método Math.random() para seleccionar una palabra aleatoria del array.

Implementa un método para obtener una pista de la palabra seleccionada. Por ejemplo, si la palabra es "casa", la pista podría ser "_ _ _ _" (cuatro guiones bajos).

Implementa un método para comprobar si una letra ingresada por el usuario está presente en la palabra seleccionada y en qué posición se encuentra.

Utiliza un bucle para permitir al usuario ingresar sus intentos hasta que adivine la palabra o se agoten los intentos.

Muestra un mensaje al usuario al final del juego indicando si adivinó la palabra correctamente o no, y muestra la palabra completa.