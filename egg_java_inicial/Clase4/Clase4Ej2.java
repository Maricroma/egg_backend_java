package Clase4;
import java.util.Scanner;

public class Clase4Ej2 {
    public static void main(String[] args) {
        double califNumerica;
        String califLetra = "";
        boolean esValido = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificación (0-100):");
        califNumerica = sc.nextDouble();

        if (califNumerica > 100 || califNumerica < 0) {
            System.out.println("Calificación inválida.");
            esValido = false;
        } else if (califNumerica >= 90) {
            califLetra = "A";
        } else if (califNumerica >= 80) {
            califLetra = "B";
        } else if (califNumerica >= 70) {
            califLetra = "C";
        } else if (califNumerica >= 60) {
            califLetra = "D";
        } else califLetra = "F";

        if (esValido) {
            System.out.println("Calificación correspondiente: " + califLetra);
        }
        sc.close();
    }
}

//CONSIGNA:

// Practicando con estructuras de control
// En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:

// Si la puntuación está entre 90 y 100, se mostrará "A".

// Si la puntuación está entre 80 y 89, se mostrará "B".

// Si la puntuación está entre 70 y 79, se mostrará "C".

// Si la puntuación está entre 60 y 69, se mostrará "D".

// Si la puntuación es menor a 60, se mostrará "F".

// Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.

// El programa mostrará en la consola el valor de la calificación obtenida.

// Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta. 