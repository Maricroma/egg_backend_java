## Introducción a POO

### Actividad: Creando un objeto “Persona”

Crea una clase llamada Persona.

Define 2 atributos para la clase: nombre y edad.

Crea una método llamado imprimirDatos para imprimir la presentación de una persona en consola mostrando sus atributos.

Asegúrate de incluir dentro de tu proyecto una clase que contenga un método main, el cual será el punto para ejecutar tu proyecto.En ella, crea un objeto a partir de una instancia de la clase “Persona”.

Ejecuta el método que imprime la presentación de dicha persona en consola.

Crea un nuevo objeto del tipo Persona.

Imprime por consola, invocando al método correspondiente, los datos de dicho objeto. 

### Actividad: Usando los constructores

El propósito de esta actividad es implementar el uso de constructores.

Crea una clase llamada Auto

Define 3 atributos para la clase: marca, modelo y año. 

Crea los siguientes constructores:

Constructor que inicialice marca, modelo y año

Constructor que inicialice marca y modelo 

Constructor que inicialice solamente la marca

Constructor sin parámetros

Escribe el método “imprimirDatos” dentro de la clase “Auto”, que al ser invocado imprima en consola su marca, modelo y año. Teniendo en cuenta que algunos atributos pueden no ser inicializados, el método “print” debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un mensaje en el caso de haber sido inicializado con el constructor sin parámetros. 

Crea al menos 4 objetos para poder probar todos los constructores de la clase, con diferentes valores y muestra sus atributos en la consola.

### Actividad: Trabajando con una figura geométrica

Crea una clase llamada Rectangulo

Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.

Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y que lleve un registro del número total de instancias de 'Rectangulo' creadas.

Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y que incremente en uno el valor de 'contadorRectangulos'. 

Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables de calcular el área y el perímetro del rectángulo, respectivamente.

Implementa un método llamado imprimirArea para mostrar el resultado por consola;

Implementa un método llamado imprimirPerimetro para mostrar el resultado por consola;

Implementa un método estático que permita obtener el número total de rectángulos creados hasta el momento.

Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' y acceder a sus métodos para obtener información relevante.