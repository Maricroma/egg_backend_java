package Clase6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase6Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = sc.nextInt();// Posible entrada inválida
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = sc.nextInt();// Posible entrada inválid
            double resultado = numero1 - numero2 ;
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

// CONSIGNA
// Resta con Manejo de Excepciones
// Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.
