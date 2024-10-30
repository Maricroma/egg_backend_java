package Clase12;

import java.util.Scanner;

public class Clase12Comp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        int num, suma = 0;

        do {
            System.out.println("Ingrese un número positivo: ");
            num = sc.nextInt();
            suma += num;
            System.out.println("¿Desea ingresar otro número? (s/n):");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("SUMA ACUMULADA: " + suma);
        sc.close();
    }
}

// CONSIGNA
// Calculadora de suma acumulada

// Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. Utiliza un bucle do-while para ir acumulando la suma de los números ingresados. Después de cada entrada de número, pregunta al usuario si desea ingresar otro número. Si el usuario responde afirmativamente, continúa solicitando números; de lo contrario, muestra la suma acumulada de todos los números ingresados y termina el programa.