package Clase13;

import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;


public class Clase13Ej2 {
    public static void main(String[] args) {
        //Actividad: Copiando parte de un arreglo. 
        int[] enteros = new int[10];
        int indiceInicial, indiceFinal;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.println(i + ": " + enteros[i]);
        }

        try {
            do {
                System.out.println("Indique el índice inicial (0-9):");
                indiceInicial = sc.nextInt();
                if (indiceInicial < 0 || indiceInicial > 9) {
                    System.out.println("Índice fuera de rango");    
                } 
            } while (indiceInicial < 0 || indiceInicial > 9);
            do {
                System.out.println("Indique el índice final (0-9):");
                indiceFinal = sc.nextInt();
                if (indiceFinal < 0 || indiceFinal > 9) {
                    System.out.println("Índice fuera de rango");    
                } 
            } while (indiceFinal < 0 || indiceFinal > 9);
            if (indiceInicial < indiceFinal) {
                int[] nuevoArreglo= Arrays.copyOfRange(enteros, indiceInicial, indiceFinal+1); 
                System.out.println("PARTE DEL ARREGLO ORIGINAL: " + Arrays.toString(nuevoArreglo));
            } else {
                System.out.println("El índice inicial debe ser menor al índice final.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Los índices deben ser números enteros.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
        sc.close();
    }
}

// CONSIGNA
// Copiando parte de un arreglo. 
// Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
