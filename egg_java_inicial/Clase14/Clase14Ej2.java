package Clase14;

import java.util.Scanner;

public class Clase14Ej2 {
    public static void main(String[] args) {
        // El try-with-resources es una característica de Java que permite declarar y utilizar recursos (como Scanner) dentro del bloque try. Estos recursos se cerrarán automáticamente al finalizar el bloque

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número:");
            String cadena = sc.nextLine();
            System.out.println("NUMERO ENTERO: " + Integer.valueOf(cadena));
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número entero válido.");
        }
    }
}

// CONSIGNA
// Conversión de cadena a número
// Escribe un programa que lea una cadena que represente un número entero como entrada utilizando la clase Scanner. Luego, convierte la cadena en un número entero utilizando la clase de envoltura Integer.