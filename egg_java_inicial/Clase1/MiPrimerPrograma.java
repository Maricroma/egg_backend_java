package Clase1;
public class MiPrimerPrograma {

    public static void main(String[] args) {
        //Declaracion de variables y entrada y salida de datos por consola
        boolean estaConectado = false;
        char letra = 'a';
        String nombre = "Cristina";
        int edad = 35;
        //long numero = 33545;
        float decimal = 34.56f;
        System.out.println("Imprimo tres variables: " + decimal + " - " + letra + " - " + estaConectado);
        System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");

        // COMPLEMENTARIOS
        String mensajeBienvenida = "Bienvenido a Java";
        double temperaturaActual = 19;
        boolean datoLogico = true;
        //text block
        System.out.println("""
                %s
                La temperatura actual es de %.2f °C
                Tu estado actual es: Conectado{%b}
                """.formatted(mensajeBienvenida, temperaturaActual, datoLogico)); 
    }
}

/*
La temperatura media de una ciudad durante el verano (en grados Celsius).
-- double, se permite decimal y cubre un amplio rango de valores posibles para la temperatura

El precio de un producto en una tienda (en dólares y centavos).
-- double, se permite decimal y cubre un amplio rango de valores posibles para la temperatura

El nombre completo de una persona.
-- String, porque va a contener un conjunto de caracteres de distinta longitud.

La fecha de nacimiento de una persona.
-- LocalDate (de la API de tiempo de Java) se utiliza para representar fechas sin información de tiempo, lo que lo hace ideal para manejar una fecha de nacimiento.

El número de habitantes de una ciudad.
-- int, porque el número de habitantes es un número entero, y el tipo int puede representar un rango suficientemente grande para la mayoría de las ciudades. Si se trata de una ciudad extremadamente grande, podría considerarse long.

La duración de una película (en minutos).
-- int, porque la duración se mide en minutos, un número entero que normalmente no excede los límites del tipo int.

Si un artículo está disponible o no en una tienda (true/false).
-- boolean, ya que se indica que puede tomar sólo dos valores posibles v o f.

La distancia entre dos ciudades (en kilómetros).
-- double, la distancia entre ciudades puede contener decimales (por ejemplo, 45.7 km), por lo que el tipo double es apropiado para representar valores con fracciones.

El número de teléfono de una persona.
-- String, aunque los números de teléfono contienen dígitos, no se deben tratar como números ya que no se realizan operaciones matemáticas con ellos. Además, los números de teléfono pueden comenzar con ceros y tener caracteres especiales como guiones, por lo que el tipo String es más adecuado.

La cantidad de existencias de un producto en una tienda.
int, la cantidad de existencias es un número entero que generalmente no supera los límites del tipo int, por lo que es adecuado para representar este dato.
 */



