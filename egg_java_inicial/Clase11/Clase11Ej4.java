package Clase11;

public class Clase11Ej4 {
    public static void main(String[] args) {
        int[] enteros = new int[10];
        int pares = 0;

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 100);
        }

        for (int entero : enteros) {
            System.out.print(entero + " ");
            if (entero % 2 == 0) {
                pares ++;
            }
        }

        System.out.println("\nCantidad de pares: " + pares);
    }
}

// CONSIGNA
// Contando Elementos Pares
// Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime todos los elementos del array en una única línea. Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola.

