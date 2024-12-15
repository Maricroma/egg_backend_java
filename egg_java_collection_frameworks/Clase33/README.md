## Java Collection Framework

### Ejercicio 1: Lista de ciudades

Desarrolla un programa en Java que haga uso de una lista de tipo ArrayList para almacenar un conjunto de nombres de ciudades. El objetivo es permitir al usuario ingresar nombres de ciudades y luego mostrar la lista completa de ciudades ingresadas.

Pasos a seguir:

Inicializa un ArrayList de tipo String para almacenar los nombres de las ciudades.

Implementa un bucle que solicite al usuario ingresar nombres de ciudades uno por uno. Puedes usar un bucle while o un bucle for que pregunte al usuario si desea agregar una ciudad en cada iteración.

En cada iteración del bucle, solicita al usuario que ingrese el nombre de una ciudad y agrega ese nombre al ArrayList utilizando el método add.

Continúa solicitando al usuario que ingrese nombres de ciudades hasta que decida no agregar más.

Finalmente, muestra por consola la lista completa de ciudades almacenadas en el ArrayList.


### Ejercicio 2: Orden de mérito

Desarrolla un programa en Java que emplee un ArrayList para almacenar una serie de notas enteras en el rango del 1 al 10.

El programa debe permitir al usuario ingresar varios números a la lista, asegurándose de que cada número esté dentro del rango especificado. Luego, ordenará estos números de manera descendente y los imprimirá por pantalla en ambas direcciones.

Pasos a seguir:

Inicializa un ArrayList de tipo Integer para almacenar los números enteros.

Implementa un bucle que solicite al usuario ingresar números enteros uno por uno. Puedes usar un bucle while o for que pregunte al usuario si desea agregar un número en cada iteración.

En cada iteración del bucle, verifica que el número ingresado esté dentro del rango del 1 al 10 y agrégalo al ArrayList utilizando el método add. Continúa solicitando al usuario que ingrese números hasta que decida no agregar más.

Después de que el usuario haya ingresado todos los números, utiliza el método sort para ordenar la lista de números de forma descendente.

Imprime por pantalla la lista ordenada tanto en orden ascendente como descendente.

### Actividad 3: Sopa de números

Desarrolla un programa que solicite al usuario ingresar una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer. La lectura de números finalizará cuando se introduzca el valor -99. Este valor no será almacenado en el ArrayList.


Una vez completada la entrada de datos, el programa mostrará por pantalla el número total de valores ingresados, su suma y su media (promedio). Además, se mostrará cuántos de los valores ingresados son mayores que la media.


Para abordar esta tarea, asegúrate de desarrollar al menos los siguientes métodos:


Método leerValores(): Este método solicita por teclado los números y los almacena en el ArrayList. La lectura finaliza cuando se introduce el valor -99. El método devuelve el ArrayList con los valores introducidos.

Método calcularSuma(): Recibe como parámetro el ArrayList con los valores numéricos y calcula su suma. Utiliza un Iterator para recorrer el ArrayList.

Método calcularPromedio(): Recibe como parámetro el ArrayList con los valores numéricos y calcula su media. Utiliza un Iterator para recorrer el ArrayList.

Método mostrarResultados(): Recibe como parámetro el ArrayList, la suma y la media aritmética. Este método muestra por pantalla todos los valores, su suma y su media, y calcula y muestra cuántos números son superiores a la media.

### Actividad 4: Turnero
Te han encomendado desarrollar un sistema de asignación de turnos para un servicio al cliente en Java.

El procedimiento es el siguiente: los clientes obtienen un número de turno al llegar y se colocan en una lista en el orden en que llegaron. Además del servicio habitual, donde se atiende al cliente que ha estado esperando por más tiempo, periódicamente se realiza un sorteo. En este sorteo, se selecciona un número aleatorio y el cliente con ese número es atendido de inmediato.

Para lograr esto, necesitas:

Guardar una lista de números de turno en el orden en que fueron emitidos.

Buscar eficientemente un número de turno específico en la lista cuando se selecciona en el sorteo. Para buscar eficientemente un número de turno específico en la lista cuando se selecciona en el sorteo, debes tener en cuenta cómo manejar la situación cuando un número ha sido sorteado. En este caso, es importante considerar qué sucede con su posición inicial en la lista. ¿Los datos se mueven o permanecen en su lugar?


Implementa esta funcionalidad utilizando un ArrayList. Este tipo de lista permite mantener los elementos en el orden de inserción y realizar búsquedas eficientes por índice cuando se realiza el sorteo.

### Complementario 1: Registro de estudiantes

Desarrolla un programa en Java que permita gestionar un registro de estudiantes. Cada estudiante estará representado por su nombre y su edad. El programa deberá permitir al usuario agregar nuevos estudiantes al registro, eliminar estudiantes existentes y mostrar la lista completa de estudiantes registrados. Además, se deberá implementar una función para buscar un estudiante por su nombre.


Pasos a seguir:

Inicializa un ArrayList para almacenar objetos de tipo Estudiante, donde Estudiante es una clase que contiene los atributos: documento de identidad (del tipo String), nombre (del tipo String) y la edad (del tipo Integer).

Implementa un menú que permita al usuario seleccionar entre las siguientes opciones: agregar estudiante, eliminar estudiante, mostrar lista de estudiantes y buscar estudiante por nombre.

Cada vez que el usuario elija agregar un estudiante, solicita por teclado el documento, el nombre y la edad del estudiante y añádelo al ArrayList.

Para eliminar un estudiante, solicita por teclado el documento del estudiante a eliminar y elimina el objeto correspondiente del ArrayList.

Implementa una función para mostrar la lista completa de estudiantes registrados, mostrando todos los datos de cada estudiante.

Finalmente, implementa una función para buscar un estudiante por su documento. Si se encuentra, muestra su nombre y edad; de lo contrario, muestra un mensaje indicando que el estudiante no está registrado.

### Complementario 2: Gestión de tareas pendientes

Desarrolla un programa en Java que permita gestionar una lista de tareas pendientes. Cada tarea estará representada por su descripción y su estado (pendiente o completada). El programa deberá permitir al usuario agregar nuevas tareas, marcar tareas como completadas, eliminar tareas y mostrar la lista completa de tareas pendientes o completadas.

Pasos a seguir:

Inicializa un ArrayList para almacenar objetos de tipo Tarea, donde Tarea es una clase que contiene atributos para la descripción y el estado de la tarea. Además, cada tarea debe tener un atributo idTarea que se autogenera de forma incremental, es decir, incrementando en 1 cada vez que se crea una nueva tarea, garantizando así la unicidad de identificadores para cada tarea

Implementa un menú que permita al usuario seleccionar entre las siguientes opciones: agregar tarea, marcar tarea como completada, eliminar tarea y mostrar lista de tareas pendientes.

Cada vez que el usuario elija agregar una tarea, solicita por teclado la descripción de la tarea y añádela al ArrayList con el estado "pendiente" (por defecto).

Para marcar una tarea como completada, solicita por teclado el número de la tarea a completar y cambia su estado a "completada".

Para eliminar una tarea, solicita por teclado el número de la tarea a eliminar y elimina el objeto correspondiente del ArrayList.

Implementa una función para mostrar la lista completa de tareas pendientes, mostrando tanto la descripción como el idTarea.

Implementa una función para mostrar la lista completa de tareas completadas, mostrando tanto la descripción como el idTarea.