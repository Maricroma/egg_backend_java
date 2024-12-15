import java.util.Scanner;

public class Complementario1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
        sc.close(); 
    }

    // Método para pedir un número al usuario
    public static int pedirNumero() {
        System.out.println("Ingrese un número para mostrar su tabla de multiplicar:");
        return sc.nextInt();
    }

    // Método para imprimir la tabla de multiplicar del número dado
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
