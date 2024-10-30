package Clase11;

public class Clase11Comp2 {
    public static void main(String[] args) {
        int[] enteros = {5, 6, 4, 7, 8};
        int suma = 0;

        for (int i = 0; i < enteros.length; i++) {
            suma += enteros[i];
            enteros[i] = suma;
            //array[i]= array[i-1] + array[i];
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }
    }
}

// CONSIGNA
// Calcular suma acumulada:

// Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de los elementos, reemplazando cada elemento por la suma acumulada hasta ese punto.El tamaño y los números  a contener pueden ser de tu elección.