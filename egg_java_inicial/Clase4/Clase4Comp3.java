package Clase4;
import java.util.Scanner;

public class Clase4Comp3 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("Error: edad inválida");
        } else if (edad >= 65) {
            System.out.println("Eres un adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Eres un adulto");
        } else System.out.println("Eres menor de edad");

        sc.close();
    }
}

//CONSIGNA:
// Determinación de Edades

// En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. Las categorías son las siguientes:

// Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".

// Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".

// Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".

// El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.