import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita la temperatura
            System.out.print("Ingrese la temperatura: ");
            double temperatura = scanner.nextDouble();

            // Solicita la unidad de medida
            System.out.print("Ingrese la unidad de medida (C para Celsius o F para Fahrenheit): ");
            char unidad = scanner.next().toUpperCase().charAt(0);

            double temperaturaConvertida;

            // Convierte según la unidad ingresada
            if (unidad == 'C') {
                temperaturaConvertida = (temperatura * 9 / 5) + 32;
                System.out.printf("La temperatura en Fahrenheit es: %.2f °F%n", temperaturaConvertida);
            } else if (unidad == 'F') {
                temperaturaConvertida = (temperatura - 32) * 5 / 9;
                System.out.printf("La temperatura en Celsius es: %.2f °C%n", temperaturaConvertida);
            } else {
                System.out.println("Error: Unidad de medida no válida. Use 'C' para Celsius o 'F' para Fahrenheit.");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada de temperatura no válida. Por favor, ingrese un número.");
        } finally {
            scanner.close();
        }
    }
}
