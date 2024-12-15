import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número:");
            String cadena = sc.nextLine();
            System.out.println("NUMERO ENTERO: " + Integer.valueOf(cadena));
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número entero válido.");
        }
    }
}
