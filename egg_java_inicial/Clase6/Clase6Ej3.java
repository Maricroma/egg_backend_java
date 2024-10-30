package Clase6;

import java.util.Scanner;

public class Clase6Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            String numeroCadena = sc.nextLine();
            int numero = Integer.parseInt(numeroCadena);// Posible error de conversion
            System.out.println("Conversión del número " + numero + " ok.");
        } catch (NumberFormatException e) {
            System.out.println("Error: No fue posible realizar la conversión.");
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

// CONSIGNA
// Conversión de Cadena a Entero
// Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.