package com.egg;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una calificación entre 0 y 100: ");
        int calif = sc.nextInt();
        System.out.println(obtenerNota(calif));
        sc.close();
    }

    // Método para obtener la calificación según la puntuación
    public static String obtenerNota(int puntuacion) {
        return switch (puntuacion / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }

}
