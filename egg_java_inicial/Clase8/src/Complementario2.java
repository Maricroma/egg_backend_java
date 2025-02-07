import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario un número entre 1 y 30
        int numeroLimite;
        do {
            System.out.println("Ingrese un número entre 1 y 30:");
            numeroLimite = sc.nextInt();
        } while (numeroLimite < 1 || numeroLimite > 30);

        // Generar un número aleatorio entre 1 y numeroLimite
        int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;

        // Calcular la raíz cuadrada del número aleatorio
        double raizCuadrada = Math.sqrt(numeroAleatorio);

        // Verificar si el número aleatorio es primo
        boolean esPrimo = esNumeroPrimo(numeroAleatorio);

        // Mostrar si el número aleatorio es primo o no
        if (esPrimo) {
            System.out.println("El número aleatorio " + numeroAleatorio + " es un número primo.");
        } else {
            System.out.println("El número aleatorio " + numeroAleatorio + " no es un número primo.");
        }

        // Mostrar el número aleatorio y su raíz cuadrada
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
        System.out.println("Raíz cuadrada del número aleatorio: " + String.format("%.2f", raizCuadrada));

        sc.close();
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
