package Clase20;

import java.util.Scanner;

public class Clase20Comp2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String figura = mostrarMenu();
        Double resultado = calcularFigura(figura);
        System.out.println(resultado != null ? "El resultado es: " + String.format("%.2f", resultado) : "Error");
        sc.close();
        
    }

    public static Double calcularFigura(String figura) {
        switch (figura) {
            case "1": return calcularCirculo();
            case "2": return calcularTriangulo();
            case "3": return calcularParalelogramo();
            default: 
                System.out.println("Opción inválida.");
                return null;
        }
    }

    private static Double calcularCirculo() {
        String calculo = mostrarSubmenu();
        Double radio = pedirDouble("Ingrese el radio:");
        return switch (calculo) {
            case "1" -> Math.PI * Math.pow(radio, 2);
            case "2" -> 2 * Math.PI * radio;
            default -> mostrarError();
        };
    }

    private static Double calcularTriangulo() {
        String calculo = mostrarSubmenu();
        return switch (calculo) {
            case "1" -> {
                Double base = pedirDouble("Ingrese la base:");
                Double altura = pedirDouble("Ingrese la altura:");
                yield (base * altura) / 2;
            }
            case "2" -> {
                Double[] lados = pedirLados(3);
                yield lados[0] + lados[1] + lados[2];
            }
            default -> mostrarError();
        };
    }

    private static Double calcularParalelogramo() {
        String calculo = mostrarSubmenu();
        return switch (calculo) {
            case "1" -> {
                Double base = pedirDouble("Ingrese la base:");
                Double altura = pedirDouble("Ingrese la altura:");
                yield base * altura;
            }
            case "2" -> {
                Double[] lados = pedirLados(2);
                yield 2 * (lados[0] + lados[1]);
            }
            default -> mostrarError();
        };
    }

    private static Double[] pedirLados(int cantidad) {
        Double[] lados = new Double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            lados[i] = pedirDouble("Ingrese la longitud del lado " + (i + 1) + ":");
        }
        return lados;
    }

    private static Double pedirDouble(String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Intente nuevamente:");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static Double mostrarError() {
        System.out.println("Opción de cálculo inválida.");
        return null;
    }

    public static String mostrarMenu() {
        System.out.println("""
            FIGURAS GEOMÉTRICAS
            1) Círculo
            2) Triángulo
            3) Paralelogramo
            Ingrese el número de la figura elegida:""");
        return sc.nextLine();
    }

    public static String mostrarSubmenu() {
        System.out.println("""
            CÁLCULOS
            1) Área
            2) Perímetro
            Ingrese el número del cálculo a realizar: """);
        return sc.nextLine();
    }
}

// CONSIGNA
// Figuras geométricas:

// Crea un programa que calcule las áreas y los perímetros de un círculo, un triángulo o un paralelogramo. Debe tener dos menús: uno para elegir la figura geométrica y otro para elegir qué calcular. 

// En cada opción se deben solicitar los datos necesarios para aplicar la fórmula correspondiente:

// Perímetro del círculo = 2 * π * radio

// Área del círculo = π * radio ^2 

// Perímetro del triángulo =  a + b + c (donde a, b y c son las longitudes de los lados del triángulo)

// Área del triángulo =  (base * altura) / 2

// Perímetro del paralelogramo = 2* (a + b) (donde a y b son las longitudes de los lados adyacentes del paralelogramo)

// Área del paralelogramo  = base * altura