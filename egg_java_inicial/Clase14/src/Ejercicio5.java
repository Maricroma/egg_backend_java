import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // El try-with-resources es una característica de Java que permite declarar y utilizar recursos (como Scanner) dentro del bloque try. Estos recursos se cerrarán automáticamente al finalizar el bloque

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero:");
            String cadenaEntero = sc.nextLine();
            Integer entero = Integer.valueOf(cadenaEntero);
            
            System.out.println("Ingrese un número decimal:");
            String cadenaDecimal = sc.nextLine();
            Double decimal = Double.valueOf(cadenaDecimal);

            System.out.println("""
                    %d + %.2f = %.2f""".formatted(entero, decimal, (entero+decimal)));
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número válido.");
        }
    }
}
