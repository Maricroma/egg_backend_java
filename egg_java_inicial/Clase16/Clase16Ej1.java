package Clase16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase16Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, factorial = 1;

        try {
            System.out.println("Ingrese un número:");
            int num = sc.nextInt();
            sc.close();

            do {
                factorial *= cont;
                cont++;
            } while (cont <= num);

            System.out.println("El factorial de " + num + " es " + factorial);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: valor inválido ingresado.");
        } catch (Exception e) {
            System.out.println("Error: algo salió mal.");
        }
    }
}

// CONSIGNA
// Cálculo del factorial
// El objetivo de esta actividad es que desarrolles un programa que solicite al usuario ingresar un número y posteriormente calcule su factorial mediante un bucle do-while. El factorial de un número se define como el producto de todos los enteros desde 1 hasta ese número. A continuación, te presentamos  algunos ejemplos para mayor claridad:

// El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.

// El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.

// Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que da 5040.