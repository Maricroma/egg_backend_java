package Clase19;

import java.util.Scanner;

public class Clase19Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = obtenerNombre(sc);
        int edad = obtenerEdad(sc);
        imprimeNombreYEdad(nombre, edad);
        sc.close();
    }

    public static String obtenerNombre(Scanner sc) {
        System.out.println("Ingrese su nombre:");
        return sc.nextLine();
    }

    public static int obtenerEdad(Scanner sc) {
        System.out.println("Ingrese su edad:");
        return sc.nextInt();
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}

// CONSIGNA

// Obtener datos: Perfeccionando la actividad de “imprimir datos”, no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
