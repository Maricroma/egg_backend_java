import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = sc.nextInt();// Posible entrada inválida
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = sc.nextInt();// Posible entrada inválida
            double resultado = numero1 - numero2 ;
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
