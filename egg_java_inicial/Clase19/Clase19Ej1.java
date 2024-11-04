package Clase19;

public class Clase19Ej1 {
    public static void main(String[] args) {
        String nombre = "Cristina";
        int edad = 38;
        imprimeNombre(nombre);
        imprimeNombreYEdad(nombre, edad);
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}

// CONSIGNA
// Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola

// Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".
