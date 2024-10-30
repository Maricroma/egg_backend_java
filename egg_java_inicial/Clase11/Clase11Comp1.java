package Clase11;

public class Clase11Comp1 {
    public static void main(String[] args) {
        int[] enteros = {45, 67, 4, 7, 8};
        int[] invertidos = new int[5];
        int j = enteros.length-1;

        for (int i = 0; i < invertidos.length; i++) {
            invertidos[i] = enteros[j];
            j--;
        }

        for (int i = 0; i < invertidos.length; i++) {
            System.out.println(invertidos[i]);
        }
        
    }
}

// CONSIGNA
// Invertir un array

// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta en el último y viceversa, luego imprime el array resultante por consola.  El tamaño y los números  a contener pueden ser de tu elección.

// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de elementos auxiliares para concluir el ejercicio. 