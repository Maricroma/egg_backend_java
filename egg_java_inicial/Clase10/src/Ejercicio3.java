import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        numeros[0] = sc.nextInt();
        int max = numeros[0];
        
        System.out.println("Ingrese el segundo número entero:");
        numeros[1] = sc.nextInt();
        if (numeros[1] > max) {
            max = numeros[1];
        }
        System.out.println("Ingrese el tercer número entero:");
        numeros[2] = sc.nextInt();
        if (numeros[2] > max) {
            max = numeros[2];
        }
        System.out.println("Ingrese el cuarto número entero:");
        numeros[3] = sc.nextInt();
        if (numeros[3] > max) {
            max = numeros[3];
        }
        System.out.println("Ingrese el quinto número entero:");
        numeros[4] = sc.nextInt();
        if (numeros[4] > max) {
            max = numeros[4];
        }

        System.out.println("Número máximo: " + max);

        sc.close();
    }
}
