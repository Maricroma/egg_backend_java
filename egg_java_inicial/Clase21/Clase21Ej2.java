package Clase21;

import java.util.Scanner;

public class Clase21Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial: ");
        int num = sc.nextInt(); 
        System.out.println("Factorial de " + num + ": " + factorial(1, num, 1));
        sc.close();
    }

    public static int factorial(int valor, int num, int contador) {
        if (contador > num) {
            return valor;
        } 
        return factorial(valor*=contador, num, contador+1);
    }
}

// CONSIGNA
// Factorial y recursividad
// Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.
