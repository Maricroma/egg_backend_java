package Clase14;

import java.util.Scanner;

public class Clase14Ej5 {
    public static void main(String[] args) {
        // El try-with-resources es una característica de Java que permite declarar y utilizar recursos (como Scanner) dentro del bloque try. Estos recursos se cerrarán automáticamente al finalizar el bloque

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero:");
            String cadenaEntero = sc.nextLine();
            Integer entero = Integer.valueOf(cadenaEntero);
            
            System.out.println("Ingrese un número decimal:");
            String cadenaDecimal = sc.nextLine();
            Double decimal = Double.valueOf(cadenaDecimal);

            System.out.println("""
                    %d + %.2f = %.2f""".formatted(entero, decimal, (entero+decimal)));
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número válido.");
        }
    }
}

// CONSIGNA
// Suma de números
// Pídele al usuario que introduzca una cadena que represente un número entero y luego otra cadena que represente un número decimal. Convierte cada cadena al tipo de dato correspondiente utilizando los métodos valueOf, suma sus valores e imprímelos por consola.

