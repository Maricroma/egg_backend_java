package Clase13;

import java.util.Scanner;
import java.util.Arrays;

public class Clase13Ej3 {
    public static void main(String[] args) {
        // Actividad: Rellenando un arreglo
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la cantidad de elementos del arreglo: ");
        int longitud = sc.nextInt();
        System.out.println("Indique el número para llenarlo: ");
        int relleno = sc.nextInt();

        int[] enteros = new int[longitud];
        
        Arrays.fill(enteros, relleno); 
        System.out.println(Arrays.toString(enteros));
        sc.close();
    }
}

// CONSIGNA
// Rellenando un arreglo
// El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo modificado. Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.
