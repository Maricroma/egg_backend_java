import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7:");
        numero = sc.nextInt();

        switch (numero) {
            case 1, 2, 3, 4, 5 -> System.out.println("Día hábil");
            case 6, 7 -> System.out.println("Día no hábil");
            default -> System.out.println("Error: Número inválido");
        }
        sc.close();
    }
}
