package Clase5;

import java.util.Scanner;

public class Clase5Ej1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7:");
        numero = sc.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Error: Número inválido");
        }
        sc.close();
    }
}

// CONSIGNA
// Ejercicio de Días de la Semana
// En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa.