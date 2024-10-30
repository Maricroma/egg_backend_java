package Clase4;
import java.util.Scanner;

public class Clase4Ej1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero == 0) {
            System.out.println("El número es 0.");
        } else System.out.println("El número es negativo.");

        sc.close();
    }
}

//CONSIGNA:
// Clasificación de Números
// En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.
