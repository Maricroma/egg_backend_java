package Clase7;

import java.util.Scanner;

public class Clase7Comp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        System.out.println("Ingrese el primer caracter:");
        String car1 = sc.nextLine();
        System.out.println("Ingrese el segundo caracter:");
        String car2 = sc.nextLine();
        
        System.out.println("Frase convertida: " + frase.replace(car1, car2));
        sc.close();
    }
}

// CONSIGNA
// Reemplazo de Caracteres
// Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias del primer carácter con el segundo carácter en la frase ingresada por el usuario. Muestra la frase resultante en pantalla.