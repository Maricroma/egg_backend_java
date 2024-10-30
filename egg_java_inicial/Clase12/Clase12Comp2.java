package Clase12;

import java.util.Scanner;

public class Clase12Comp2 {
    public static void main(String[] args) {
        int cantidadPares = 0, cantidadImpares = 0, num;
        Scanner sc = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Ingrese un número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                cantidadPares++;
            } else cantidadImpares ++;
            System.out.println("¿Desea ingresar otro número? (s/n):");
            continuar = sc.next();
        }
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

        sc.close();
        
    }
}

// CONSIGNA
// Contador de números pares e impares

// Escribe un programa que solicite al usuario ingresar una serie de números enteros. Utiliza un bucle while para contar la cantidad de números pares e impares ingresados hasta que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad de números pares e impares ingresados