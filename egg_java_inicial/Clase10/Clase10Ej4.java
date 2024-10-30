package Clase10;

import java.util.Scanner;

public class Clase10Ej4 {
    public static void main(String[] args) {
        int[] numeros = {34, 56, 4};
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número a buscar:");
        int numBuscado = sc.nextInt();

        if (numBuscado == numeros[0] || numBuscado == numeros[1] || numBuscado == numeros[2]) {
            System.out.println("El número se encontró.");
        } else System.out.println("El número no fue encontrado."); 

        sc.close();
    }
}
    
// CONSIGNA
// Buscando un elemento
// El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.