package Clase9;

import java.util.Scanner;

public class Clase9Ej1 {
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

// CONSIGNA
// Conversión de unidades de temperatura
// Escribe un programa que cumpla con las siguientes condiciones:

// 1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).

// 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.

// De Celsius a Fahrenheit	De Fahrenheit a Celsius
// [°F] = ([°C] × 9 ⁄ 5) + 32	[°C] = ([°F] − 32) × 5 ⁄ 9
// 3. El programa debe manejar al menos las siguientes situaciones:

// Si ingresa una unidad de medida inválida, mostrará un mensaje de error.

// Si ingresa una temperatura no válida, mostrará un mensaje de error.