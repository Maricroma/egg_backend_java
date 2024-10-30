package Clase4;
import java.util.Scanner;

public class Clase4Ej3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = sc.nextInt();

        if (numero % 5 == 0) {
            if (numero % 3 == 0) {
                System.out.println("El número es divisible por 3 y por 5.");
            } else {
                System.out.println("El número es divisible por 5.");
            }
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else System.out.println("El número no es divisible por 3 ni por 5.");

        sc.close();
    }
}

//CONSIGNA:
// Divisibilidad
// En esta actividad, escribirás un programa que solicite al usuario un número y determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla.