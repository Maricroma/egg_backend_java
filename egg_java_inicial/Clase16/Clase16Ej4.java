package Clase16;

import java.util.Scanner;

public class Clase16Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del cuadrado (N): ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {      // Controla las filas
            for (int j = 0; j < N; j++) {  // Controla las columnas
                // Imprime "*" en los bordes, espacios en el interior
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();          // Salto de línea al final de cada fila
        }

        scanner.close();
    }
}

// CONSIGNA
// Dibujando cuadrados
// Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.
// Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado.
// Observación: El cuadrado solo debe ser dibujado por sus lados. 