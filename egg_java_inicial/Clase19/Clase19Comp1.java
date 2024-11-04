package Clase19;

import java.util.Scanner;

public class Clase19Comp1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
        sc.close(); 
    }

    // Método para pedir un número al usuario
    public static int pedirNumero() {
        System.out.println("Ingrese un número para mostrar su tabla de multiplicar:");
        return sc.nextInt();
    }

    // Método para imprimir la tabla de multiplicar del número dado
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

// CONSIGNA
// Tabla de multiplicar

// En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero())  y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente.