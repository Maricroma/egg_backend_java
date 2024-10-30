package Clase10;

public class Clase10Ej2 {
    public static void main(String[] args) {

        int[] numeros = {34, 55, 4, 6};
        int total = 0;

        total = numeros[0] + numeros[1] + numeros[2] + numeros[3];

        System.out.println("PROMEDIO: " + (double) total/numeros.length);
    }
}

// CONSIGNA
// Promediando elementos
// Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.

