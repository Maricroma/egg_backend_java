package Clase8;

import java.util.Scanner;

public class Clase8Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Actividad: Calculando la potencia
        System.out.println("Ingrese la base:");
        int base = sc.nextInt();
        System.out.println("Ingrese la potencia:");
        int potencia = sc.nextInt();

        System.out.println("El número " + base + " elevado a " + potencia + " es: " + Math.pow(base, potencia));

        //Actividad: Calculando la raíz cuadrada
        System.out.println("Ingrese un número positivo:");
        int numero = sc.nextInt();
        System.out.println(numero < 0? "El número debe ser positivo" : "La raíz cuadrada de " + numero + " es: " + Math.sqrt(numero));

        sc.close();
    }
}

// CONSIGNA
// Calculando la potencia
// Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, y calcula el resultado de elevar la base al exponente utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.
// Calculando la raíz cuadrada
// Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.

