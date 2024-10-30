package Clase7;

import java.util.Scanner;

public class Clase7Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Cantidad de caracteres: " + palabra.length()); //LONGITUD

        System.out.println("Ingrese otra palabra:");
        String otraPalabra = sc.nextLine();
        System.out.println("Concatenadas: " + palabra.concat(otraPalabra)); //CONCATENAR

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        System.out.println("Ingrese el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Subcadena: " + frase.substring(num1, num2)); //SUBCADENA

        sc.close();
    }
}

// CONSIGNA
// Longitud de Cadena
// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla su longitud utilizando el método length() de la clase String.
// Concatenación de Cadenas
// Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.
// Extracción de Subcadena
// Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen un índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla.