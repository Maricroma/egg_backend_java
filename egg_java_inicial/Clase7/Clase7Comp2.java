package Clase7;

import java.util.Scanner;

public class Clase7Comp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase con espacios al principio y al final:");
        String frase = sc.nextLine();
        System.out.println("Frase sin espacios: " + frase.trim());
        sc.close();
        
    }
}

// CONSIGNA
// Eliminación de Espacios en Blanco
// Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al final. Utiliza el método trim() de la clase String para eliminar los espacios en blanco y luego muestra la frase resultante en pantalla.