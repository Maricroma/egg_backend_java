package Clase6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase6Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = sc.nextInt();// Posible entrada inválida
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = sc.nextInt();// Posible entrada inválid
            double resultado = numero1 / numero2 ;// Posible división por cero
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

// CONSIGNA
// Division Segura
// Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.