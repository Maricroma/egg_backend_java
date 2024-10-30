package Clase8;

import java.util.Scanner;

public class Clase8Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = sc.nextInt();

        //Actividad: Calculando el valor absoluto
        System.out.println("Valor absoluto: " + Math.abs(numero));

        //Actividad: Redondeo de números
        System.out.println("Ingrese un número decimal:");
        double numero2 = sc.nextDouble();

        System.out.println("Redondeo: " + Math.round(numero2));

        //Actividad: Generando números aleatorios
        //rango del 1 al 355
        System.out.println("Número aleatorio: " + (int) Math.floor(Math.random()*355)+1);
        // Math.random() genera un numero entre 0 y 1
        // Math.random() * 355 multiplica el valor para obtener un numero entre 0 y 354.9999
        // Math.floor() redondea hacia abajo el numero para obtener un valor entre 0 y 354
        // + 1 se asegura que el rango final sea entre 1 y 355
        sc.close();
    }
}

// CONSIGNA
// Calculando el valor absoluto
// Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.
// Redondeo de números
// Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
// Generando números aleatorios
// Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
