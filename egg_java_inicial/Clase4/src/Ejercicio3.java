import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = sc.nextInt();

        if (numero % 5 == 0) {
            if (numero % 3 == 0) {
                System.out.println("El número es divisible por 3 y por 5.");
            } else {
                System.out.println("El número es divisible por 5.");
            }
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else System.out.println("El número no es divisible por 3 ni por 5.");

        sc.close();
    }
}
