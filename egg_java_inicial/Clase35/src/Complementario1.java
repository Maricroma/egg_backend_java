import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        System.out.println(esPar(solicitarNumero()) ? "Es par" : "No es par" );
    }

    public static int solicitarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
