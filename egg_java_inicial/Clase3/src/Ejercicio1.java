import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        numero = sc.nextInt();

        System.out.println(numero % 2 == 0? "Es par" : "Es impar");

        sc.close();
    }
}
