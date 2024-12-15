## Herencia

### Gestión de Edificios

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