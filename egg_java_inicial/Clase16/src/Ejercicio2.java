import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int valor = 0, valorSig = 1;
        Scanner sc = new Scanner(System.in);
        boolean error;

        do {
            error = false;
            try {
                System.out.println("Ingrese la posición:");
                int posicion = sc.nextInt();

                if (posicion < 0) {
                    System.out.println("Error: la posición no puede ser negativa.");
                    error = true;
                } else if (posicion == 0) {
                    System.out.println("Posición 0: " + valor);
                } else if (posicion == 1 || posicion == 2) {
                    System.out.println("Posición " + posicion + ": " + valorSig);
                } else {
                    int valorActual = 0;
                    valor = 1;
                    for (int i = 3; i <= posicion; i++) {
                        valorActual = valor + valorSig;
                        valor = valorSig;
                        valorSig = valorActual;
                    }
                    System.out.println("Posición " + posicion + ": " + valorActual);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: valor inválido ingresado.");
                error = true;
            } catch (Exception e) {
                System.out.println("Error: algo salió mal.");
                error = true;
            }
        } while (error);
        sc.close();
    }
}
