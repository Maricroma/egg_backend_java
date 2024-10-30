package Clase5;

import java.util.Scanner;

public class Clase5Ej2 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una nota del 1 al 5:");
        nota = sc.nextInt();

        switch (nota) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Error: Nota inválida");
        }
        sc.close();
    }
}

// CONSIGNA
// Conversión de Calificaciones
// En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:

// 1: "Muy deficiente"

// 2: "Deficiente"

// 3: "Suficiente"

// 4: "Notable"

// 5: "Sobresaliente"