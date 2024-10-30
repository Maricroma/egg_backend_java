package Clase14;

import java.util.Scanner;

public class Clase14Ej1 {
    public static void main(String[] args) {
 
        // El try-with-resources es una característica de Java que permite declarar y utilizar recursos (como Scanner) dentro del bloque try. Estos recursos se cerrarán automáticamente al finalizar el bloque

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número:");
            String cadena = sc.nextLine();
            System.out.println("NUMERO DECIMAL: " + Double.valueOf(cadena));
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número válido.");
        }
            
    }
}

// CONSIGNA
// Verificando si una cadena representa un número válido
// Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número decimal usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido.