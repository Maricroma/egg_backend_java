import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, factorial = 1;

        try {
            System.out.println("Ingrese un número:");
            int num = sc.nextInt();
            sc.close();

            do {
                factorial *= cont;
                cont++;
            } while (cont <= num);

            System.out.println("El factorial de " + num + " es " + factorial);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: valor inválido ingresado.");
        } catch (Exception e) {
            System.out.println("Error: algo salió mal.");
        }
    }
}
