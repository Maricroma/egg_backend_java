package Clase3;

import java.util.Scanner;

public class Clase3Ej1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = sc.nextInt();

        System.out.println(numero % 2 == 0? "Es par" : "Es impar");

        sc.close();
    }
}

// CONSIGNA:
// Programa identificador de número par o impar 

// Solicita al usuario que ingrese un número y almacena este valor en una variable.

// Desarrolla un programa que determine si el número ingresado es par o impar.

// Muestra el resultado en la consola.