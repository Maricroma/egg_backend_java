package Clase7;

import java.util.Scanner;

public class Clase7Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Ingrese un caracter:");
        String caracter = sc.nextLine();

        System.out.println(palabra.indexOf(caracter)!= -1? "El caracter se encuentra":"El caracter no se encuentra");

        System.out.println("Minusculas: " + palabra.toLowerCase());
        System.out.println("Mayusculas: " + palabra.toUpperCase());

        sc.close();
    }
}

// CONSIGNA
// Búsqueda de Caracteres
// Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.
// Conversión de Mayúsculas y Minúsculas
// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.

