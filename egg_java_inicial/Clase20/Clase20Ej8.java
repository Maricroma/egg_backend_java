package Clase20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clase20Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique cantidad de números a ingresar:");
        int longitud = sc.nextInt();
        System.out.println("Indique el valor mínimo:");
        int min = sc.nextInt();
        System.out.println("Indique el valor máximo:");
        int max = sc.nextInt();
        System.out.println(Arrays.toString(crearArreglo(longitud, min, max)));
        sc.close();
    }

    public static int[] crearArreglo(int longitud, int min, int max) {
        int[] arregloNumeros = new int[longitud];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = numeroAleatorio(min, max);
        }
        return arregloNumeros;
    }

    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

// CONSIGNA
// Crear array aleatorio: Basándote en el ejercicio “Generación de números aleatorios” de este paso, crea un programa que te permita generar un array de tipo "int" de manera aleatoria. El programa debe solicitar al usuario el tamaño del array y el rango de números posibles para rellenarlo.