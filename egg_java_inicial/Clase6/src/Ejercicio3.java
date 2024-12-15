import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            String numeroCadena = sc.nextLine();
            int numero = Integer.parseInt(numeroCadena);// Posible error de conversion
            System.out.println("Conversión del número " + numero + " ok.");
        } catch (NumberFormatException e) {
            System.out.println("Error: No fue posible realizar la conversión.");
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
