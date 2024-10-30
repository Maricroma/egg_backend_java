package Clase15;

import java.util.Scanner;

public class Clase15Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esPrimo;

        do {
            System.out.println("Ingrese un número (0 para salir):");
            numero = sc.nextInt();
            esPrimo = true;

            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (numero <= 1) {
                esPrimo = false; // Los números menores o iguales a 1 no son primos
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Si es divisible por i, no es primo
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo. Intente de nuevo.");
            }

        } while (!esPrimo && numero != 0);

        sc.close();
    }
}

// CONSIGNA
// Números primos
// Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).

// Un número es primo si solo tiene dos divisores: 1 y él mismo. 