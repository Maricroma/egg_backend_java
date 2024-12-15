## Herencia

### Actividad: Herencia simple con mascotas

En esta actividad, se te solicita crear una clase llamada "Animal". Esta clase debe incluir los atributos "nombre" y "edad", así como los métodos "comer()" y "dormir()". En este contexto, la clase "Animal" actúa como la superclase o clase padre.


Luego, deberás crear dos clases que hereden de la clase "Animal": La clase "Perro" y la clase "Gato". Cada una de estas subclases debe poseer sus propios atributos y métodos únicos. Por ejemplo, la clase "Perro" podría incluir el atributo "raza" y el método "ladrar()".

### Actividad: Sobrescritura de métodos

A partir de las clases "Perro" y "Gato" creadas anteriormente, debes realizar las siguientes tareas:

Sobrescribe los métodos "comer()" y "dormir()" en las subclases "Perro" y "Gato" para que muestren comportamientos específicos de cada animal. Por ejemplo, cuando un perro coma, podría imprimir "El perro está comiendo croquetas" y cuando un gato duerma, podría imprimir "El gato está durmiendo encima del sofá".

Sobrescribe el método "equals()" y "hashCode()" únicamente en la clase "Perro". La clase "Gato" no requerirá esta sobrescritura.

Recuerda invocar estos métodos desde el método main() para demostrar su funcionamiento.

### Actividad: Utilización de Instanceof

En esta actividad, crearás una lista de objetos de tipo "Animal" y agregarás varios objetos de las clases "Perro" y "Gato". La lista debe contener al menos diez objetos. Luego, deberás:


Recorrer la lista de objetos utilizando el operador Instanceof para identificar si cada objeto corresponde a una clase "Perro" o "Gato", e imprimir los resultados.

Una vez identificada la instancia del objeto, el programa debe ejecutar los métodos propios y comunes del objeto.

### 

2. Gestión de Edificios

En esta actividad, se propone crear una jerarquía de clases para gestionar diferentes tipos de edificios, como polideportivos y edificios de oficinas.

Instrucciones:

Crear una superclase llamada "Edificio" con los siguientes atributos: ancho, alto y largo. La clase "Edificio" tendrá como métodos abstractos:

calcularSuperficie(): para calcular la superficie del edificio.

calcularVolumen(): para calcular el volumen del edificio.

Implementar dos clases hijas:

Clase "Polideportivo": con atributos adicionales como nombre y tipo de instalación (Techado o Abierto). Esta clase implementará los métodos abstractos y heredará los atributos de la clase padre.

Clase "EdificioDeOficinas": con atributos como número de oficinas, cantidad de personas por oficina y número de pisos. Esta clase también implementará los métodos abstractos y heredará los atributos de la clase padre. Además, se creará el método "cantPersonas()" para calcular cuántas personas pueden trabajar en todo el edificio.

En el programa principal (main), se creará un ArrayList de tipo “Edificio”, que contendrá dos instancias de polideportivos y dos instancias de edificios de oficinas. Luego, se recorrerá este ArrayList y se ejecutarán los métodos "calcularSuperficie" y "calcularVolumen" en cada edificio, mostrando los resultados.

Para la clase "Polideportivo", se mostrará la cantidad de polideportivos techados y abiertos.

Para la clase "EdificioDeOficinas", se llamará al método "cantPersonas()" y se mostrarán los resultados de cada edificio de oficinas.