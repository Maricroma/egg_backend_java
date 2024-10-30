package Clase11;

public class Clase11Ej2 {
    public static void main(String[] args) {
        int[] enteros = {45, 67, 4, 7, 8};
        int min = enteros[0];

        for (int i = 1; i < enteros.length; i++) {
            if (enteros[i] < min) {
                min = enteros[i];
            }
        }
        System.out.println("MINIMO: " + min);
    }
}

// CONSIGNA
// Encontrando el valor mínimo 
// Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección.