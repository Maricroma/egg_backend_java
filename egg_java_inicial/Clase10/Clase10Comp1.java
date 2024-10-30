package Clase10;

public class Clase10Comp1 {
    public static void main(String[] args) {
        int[] numeros = {34, 56, 4, 6, 55, 23};
        int contadorPares = 0;

        if (numeros[0] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[1] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[2] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[3] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[4] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[5] % 2 == 0) {
            contadorPares++;
        }
        System.out.println("Cantidad de pares: " + contadorPares);

    }
}

// CONSIGNA
// Generando un número aleatorio entre dos límites

// Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero. El programa debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por consola utilizando solo las herramientas aprendidas hasta el momento.