import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {34, 56, 4};
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número a buscar:");
        int numBuscado = sc.nextInt();

        if (numBuscado == numeros[0] || numBuscado == numeros[1] || numBuscado == numeros[2]) {
            System.out.println("El número se encontró.");
        } else System.out.println("El número no fue encontrado."); 

        sc.close();
    }
}
