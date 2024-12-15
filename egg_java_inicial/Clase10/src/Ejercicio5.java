import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {34, 56, 4};
        int[] numerosCopia = new int[5];
        Scanner sc = new Scanner(System.in);

        numerosCopia[0] = numeros[0];
        numerosCopia[1] = numeros[1];
        numerosCopia[2] = numeros[2];

        System.out.println("Ingrese un número:");
        numerosCopia[3] = sc.nextInt();
        System.out.println("Ingrese otro número:");
        numerosCopia[4] = sc.nextInt();

        System.out.println(numerosCopia[0] + ", " + numerosCopia[1] + ", " + numerosCopia[2] + ", " + numerosCopia[3] + ", " + numerosCopia[4]);
        System.out.println(Arrays.toString(numerosCopia));
        sc.close();
    }
}
