import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
        int cantidad = scanner.nextInt();

        int contadorPrimos = 0;  // Contador de números primos encontrados
        int numero = 2;          // Número inicial para verificar si es primo

        while (contadorPrimos < cantidad) {
            boolean esPrimo = true;

            // Verificar si el número actual es primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Si es primo, imprimirlo y aumentar el contador
            if (esPrimo) {
                System.out.println(numero);
                contadorPrimos++;
            }

            numero++;
        }

        scanner.close();
    }
}


