import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo: ");
        int num = sc.nextInt();
        System.out.println(esPrimo(num) ? "Es primo" : "No es primo");
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        return esPrimoRecursivo(numero, 2);
    }

    private static boolean esPrimoRecursivo(int numero, int divisor) {
        //Si divisor supera la raíz cuadrada del número, entonces no hay divisores posibles, y el número es primo.
        if (divisor > Math.sqrt(numero)) {
            return true; // No se encontró ningún divisor, el número es primo
        }
        if (numero % divisor == 0) {
            return false; // Se encontró un divisor, no es primo
        }
        return esPrimoRecursivo(numero, divisor + 1); // Llamada recursiva incrementando el divisor
    }
}
