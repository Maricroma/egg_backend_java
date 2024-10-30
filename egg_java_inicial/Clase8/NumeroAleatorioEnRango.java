package Clase8;

import java.util.Scanner;

public class NumeroAleatorioEnRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el límite inferior y superior
        System.out.println("Ingrese el límite inferior:");
        int limiteInferior = sc.nextInt();

        System.out.println("Ingrese el límite superior:");
        int limiteSuperior = sc.nextInt();

        // Validar que el límite inferior sea menor o igual que el límite superior
        if (limiteInferior > limiteSuperior) {
            System.out.println("El límite inferior debe ser menor o igual que el límite superior.");
        } else {
            // Generar un número aleatorio en el rango [limiteInferior, limiteSuperior]
            int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;

            // Mostrar el número aleatorio generado
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
        }

        sc.close();
    }
}

// CONSIGNA
// Generando un número aleatorio entre dos límites

// Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior. Luego, utiliza el método random() de la clase Math para generar y mostrar en pantalla un número aleatorio dentro del rango especificado por los límites ingresados.
