import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
 
        // El try-with-resources es una característica de Java que permite declarar y utilizar recursos (como Scanner) dentro del bloque try. Estos recursos se cerrarán automáticamente al finalizar el bloque

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número:");
            String cadena = sc.nextLine();
            System.out.println("NUMERO DECIMAL: " + Double.valueOf(cadena));
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número válido.");
        }
            
    }
}
