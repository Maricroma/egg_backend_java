import java.util.Scanner;

public class Complementario2 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("=== Calculadora ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }
            opcion = sc.nextInt();

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    realizarOperacion(sc, "suma");
                    break;
                case 2:
                    realizarOperacion(sc, "resta");
                    break;
                case 3:
                    realizarOperacion(sc, "multiplicación");
                    break;
                case 4:
                    realizarOperacion(sc, "división");
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        } while (opcion != 5);

        sc.close();
    }

    private static void realizarOperacion(Scanner sc, String operacion) {
        System.out.print("Ingrese el primer número: ");
        double num1 = leerNumero(sc);

        System.out.print("Ingrese el segundo número: ");
        double num2 = leerNumero(sc);

        switch (operacion) {
            case "suma":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "resta":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "multiplicación":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "división":
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
        }
    }

    private static double leerNumero(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            sc.next();
        }
        return sc.nextDouble();
    }
}

