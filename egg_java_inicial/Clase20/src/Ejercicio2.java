import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        sc.close();
    }

    public static Double pedirNumero() {
        System.out.println("Ingrese un número");
        return sc.nextDouble();
    }

    public static void mostrarOpciones() {
        System.out.println("""
            1 - Sumar
            2 - Restar
            3 - Multiplicar
            4 - Dividir
            5 - Salir
            Ingresa el número del opción del cálculo que quieres realizar:""");
    }

    public static Double sumar(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double restar(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double multiplicar(Double num1, Double num2) {
        return num1 * num2;
    }

    public static Double dividir(Double num1, Double num2) {
        Double resultado;

        if (num2 == 0) {
            System.out.println("Error: División por cero.");
            resultado = null;
        } else resultado = num1 / num2;
        
        return resultado;
    }

    public static void menu() {
        String opcion = null;
        Double num1 = pedirNumero();
        Double num2 = pedirNumero();
        sc.nextLine();
        do {
            mostrarOpciones();
            opcion = sc.nextLine();
            Double resultado = null;
            switch (opcion) {
                case "1":
                    resultado = sumar(num1, num2);
                    break;
                case "2":
                    resultado = restar(num1, num2);
                    break;
                case "3":
                    resultado = multiplicar(num1, num2);
                    break;
                case "4":
                    resultado = dividir(num1, num2);
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
            }

            if (resultado != null) {
                System.out.println("El resultado es: " +  String.format("%.2f", resultado));
            }
        } while (!opcion.equals("5"));

    }
}
