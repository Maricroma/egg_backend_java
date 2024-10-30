package Clase7;

import java.util.Scanner;

public class Clase7Comp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Ingrese otra palabra:");
        String otraPalabra = sc.nextLine();

        System.out.println(palabra.equals(otraPalabra)? "Las palabras son iguales":"Las palabras no son iguales");
        
        sc.close();
    }
}

// CONSIGNA
// Comparación de Cadenas
// Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales. Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.