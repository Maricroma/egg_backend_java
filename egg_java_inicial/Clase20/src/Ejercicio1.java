import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(esPar(solicitarNumero())? "El número es par" : "El número es impar");
        sc.close();
        
    }

    public static int solicitarNumero() {
        Integer numero = null;
        do {
            try {
                System.out.println("Ingrese un número:");
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: valor inválido ingresado. Intente nuevamente.");
                sc.nextLine();  // Limpiar el buffer de entrada
            } catch (Exception e) {
                System.out.println("Ocurrió un error. Intente nuevamente.");
            }
        } while (numero == null);
        return numero;
    }

    public static Boolean esPar(Integer numero) {
        return numero % 2 == 0;
    }
}
