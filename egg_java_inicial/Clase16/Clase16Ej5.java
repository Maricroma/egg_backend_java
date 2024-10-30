package Clase16;

import java.util.Scanner;

public class Clase16Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        // Solicitar al usuario que ingrese 4 números entre 1 y 20
        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("Ingrese el número " + (i + 1) + " (entre 1 y 20): ");
                numeros[i] = scanner.nextInt();
            } while (numeros[i] < 1 || numeros[i] > 20);  // Validar rango
        }

        // Imprimir el gráfico de barras
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");  // Imprimir asteriscos para la barra
            }
            System.out.println();  // Salto de línea al final de cada barra
        }

        scanner.close();
    }
}

// CONSIGNA
// Creando un gráfico de barras:

// Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico, donde cada asterisco representa una unidad en la escala. A modo de ejemplo:

// 2**

// 5*****

// 1*

// 4****