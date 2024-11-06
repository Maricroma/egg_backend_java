package Clase20;

import java.util.Arrays;
import java.util.Scanner;

public class Clase20Comp1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indique la cantidad de elementos del arreglo: ");
        int longitud = sc.nextInt();
        int[] enteros = new int[longitud];
        rellenarArray(enteros);
        sc.close();
    }

    public static void rellenarArray(int[] array) {
        int relleno, indiceFinal, indiceInicial = 0;

        do {
            System.out.println("Indique el número para llenarlo: ");
            relleno = sc.nextInt();
            do {
                System.out.println("Indique el índice hasta el cual quiere rellenar el array con el número anterior (0-" + (array.length-1)+ "):");
                indiceFinal = sc.nextInt();
                if (indiceFinal >= array.length || indiceFinal < indiceInicial) {
                    System.out.println("El índice debe estar en el rango entre " + indiceInicial + " y " + (array.length - 1) + ".");
                }
            } while (indiceFinal >= array.length || indiceFinal < indiceInicial);
            
            // Llenar el arreglo desde la posición 0 hasta hastaPosicion (exclusivo)
            Arrays.fill(array, indiceInicial, indiceFinal+1, relleno);
            indiceInicial = indiceFinal + 1;

            // Mostrar el arreglo
            System.out.println(Arrays.toString(array));
        } while (indiceFinal < array.length-1);
    }

}

// CONSIGNA
// Rellenar un arreglo de manera personalizada: 

// Basándote en el ejercicio que ya has realizado, crea un método llamado "rellenarArray(int[] array)" que recibirá como parámetro un arreglo de tipo "int" y no devolverá ningún valor. Este método contendrá la lógica necesaria para solicitar datos al usuario y completar el arreglo con ellos.
