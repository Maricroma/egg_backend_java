import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero == 0) {
            System.out.println("El número es 0.");
        } else System.out.println("El número es negativo.");

        sc.close();
    }
}
