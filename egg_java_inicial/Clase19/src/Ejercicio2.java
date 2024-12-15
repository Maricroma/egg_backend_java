import java.util.Scanner;

public class Ejercicio2 {
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
