import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Inicializar el ArrayList para almacenar los nombres de las ciudades
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("Programa de gestión de ciudades.");
        
        // Bucle para solicitar nombres de ciudades al usuario
        do {
            System.out.print("Ingrese el nombre de una ciudad: ");
            String ciudad = scanner.nextLine();
            ciudades.add(ciudad);

            System.out.print("¿Desea agregar otra ciudad? (si/no): ");
            respuesta = scanner.nextLine().trim().toLowerCase();

        } while (respuesta.equals("si"));

        // Mostrar la lista completa de ciudades
        System.out.println("\nLista completa de ciudades ingresadas:");
        for (String ciudad : ciudades) {
            System.out.println("- " + ciudad);
        }

        scanner.close();
    }
}
