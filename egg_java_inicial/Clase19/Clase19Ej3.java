package Clase19;

import java.util.Scanner;

public class Clase19Ej3 {
    // Declaración de la variable global Scanner
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimeNombreYEdad(nombre, edad);
        sc.close(); 
    }

    public static String obtenerNombre() {
        System.out.println("Ingrese su nombre:");
        return sc.nextLine();
    }

    public static int obtenerEdad() {
        System.out.println("Ingrese su edad:");
        return sc.nextInt();
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}

//CONSIGNA

// Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()" para que no necesiten recibir el Scanner por parámetro. En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.