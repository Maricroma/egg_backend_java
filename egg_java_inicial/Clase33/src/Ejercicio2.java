import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Inicializar un ArrayList para almacenar las notas
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("Programa de Orden de Mérito.");

        // Bucle para solicitar notas al usuario
        do {
            System.out.print("Ingrese una nota (entre 1 y 10): ");
            int nota = scanner.nextInt();

            // Validar que la nota esté en el rango de 1 a 10
            if (nota >= 1 && nota <= 10) {
                notas.add(nota);
            } else {
                System.out.println("Nota inválida. Debe estar entre 1 y 10.");
            }

            System.out.print("¿Desea agregar otra nota? (si/no): ");
            scanner.nextLine(); // Consumir el salto de línea
            respuesta = scanner.nextLine().trim().toLowerCase();

        } while (respuesta.equals("si"));

        // Ordenar la lista en orden descendente
        Collections.sort(notas, Collections.reverseOrder());

        // Imprimir la lista en orden descendente
        System.out.println("\nLista ordenada en orden descendente:");
        for (int nota : notas) {
            System.out.print(nota + " ");
        }

        // Imprimir la lista en orden ascendente
        Collections.sort(notas); // Volver a ordenar en orden ascendente
        System.out.println("\n\nLista ordenada en orden ascendente:");
        for (int nota : notas) {
            System.out.print(nota + " ");
        }

        scanner.close();
    }
}
