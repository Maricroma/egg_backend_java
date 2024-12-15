import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición para ver el número de la secuencia Fibonacci: ");
        int num = sc.nextInt(); 
        System.out.println("Posición " + num + ": " + calcularFibonacci(0, 1, num, 0));
        sc.close();
    }

    public static int calcularFibonacci(int valor, int valorSig, int num, int contador) {
        if (contador == num) {
            return valor;
        }
        //System.out.println(valorSig + ", " + (valor+valorSig));
        return calcularFibonacci(valorSig, valor + valorSig, num, contador + 1);
    }
}
