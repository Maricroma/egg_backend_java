import java.util.Scanner;

public class Complementario2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasMultiplicar(numeros);
        sc.close(); 
    }

    // Método para pedir tres números al usuario y almacenarlos en un array
    public static int[] pedirNumeros() {
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    // Método para imprimir la tabla de multiplicar de cada número en el array
    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
    }
}
