package Clase13;

import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;


public class Clase13Ej1 {
    public static void main(String[] args) {
        //Actividad: Ordenar en forma descendente
        int[] enteros = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println(Arrays.toString(enteros));

        // Ordenar el array en forma ascendente
        Arrays.sort(enteros);

        // Invertir el array para obtener el orden descendente
        for (int i = 0; i < enteros.length / 2; i++) { //recorro hasta la mitad
            int temp = enteros[i]; 
            enteros[i] = enteros[enteros.length - 1 - i]; //recorro de atras para adelante
            enteros[enteros.length - 1 - i] = temp;
        }

        // Imprimir el array ordenado
        System.out.println("Array ordenado en forma descendente: " + Arrays.toString(enteros));

        // Actividad: Búsqueda binaria
        Arrays.sort(enteros);

        try {
            System.out.println("Indique el número entero a buscar:");
            int enteroBuscado = sc.nextInt();
            int indice = Arrays.binarySearch(enteros,enteroBuscado);
            if (indice>=0) {
                System.out.println("El índice es: " + indice);
            } else {
                System.out.println("El entero ingresado no se encuentra en el arreglo."); 
            }
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero.");
        } catch (Exception e) {
            System.out.println("Error.");
        }

        //Actividad: Comparando arreglos
        int[] numeros = {45, 56, 66, 55, 66, 78};
        //int[] numeros = Arrays.copyOf(enteros, enteros.length);
        System.out.println("ARREGLO 2: " + Arrays.toString(numeros));
        System.out.println(Arrays.equals(numeros, enteros)? "Los arreglos son iguales" : "Los arreglos son distintos");
        sc.close();
    }
}

// CONSIGNA
// Ordenar en forma descendente
// Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
// Búsqueda binaria
// La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.
// Comparando arreglos
// Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.
