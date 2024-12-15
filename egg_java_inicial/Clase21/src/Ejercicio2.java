import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial: ");
        int num = sc.nextInt(); 
        System.out.println("Factorial de " + num + ": " + factorial(1, num, 1));
        sc.close();
    }

    public static int factorial(int valor, int num, int contador) {
        if (contador > num) {
            return valor;
        } 
        return factorial(valor*=contador, num, contador+1);
    }
}
