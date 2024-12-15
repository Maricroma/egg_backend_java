import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int decision;
        do {
            decision = menu();
            if (decision == 1 || decision == 2 || decision == 3 || decision == 4) {
                System.out.println("Ingrese un número entero");
                int num1 = scan.nextInt();
                System.out.println("Ingrese un segundo número entero");
                int num2 = scan.nextInt();
                switch (decision) {
                    case 1 -> suma(num1, num2);
                    case 2 -> resta(num1, num2);
                    case 3 -> multiplicar(num1, num2);
                    case 4 -> dividir(num1, num2);
                }
            } else if (decision == 0) {
                System.out.println("saliendo del menú");
            } else {
                System.out.println("Ingresó una opción fuera de las dadas");
            }
        } while (decision != 0);

        scan.close();
    }

    public static int menu() {
        System.out.println("------------Menú-----------");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Salir");
        return scan.nextInt();
    }

    public static void suma(int num1, int num2) {
        int suma = (num1 + num2);
        System.out.println("La suma es " + suma);
    }

    public static void resta(int num1, int num2) {
        int resta = (num1 - num2);
        System.out.println("La resta es " + resta);
    }

    public static void multiplicar(int num1, int num2) {
        int multiplicar = (num1 * num2);
        System.out.println("La multiplicación es " + multiplicar);
    }

    public static void dividir(int num1, int num2) {
        try {
            int division = (num1 / num2);
            System.out.println("La división es " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: No es posible dividir por 0.");
        }
    }
}
