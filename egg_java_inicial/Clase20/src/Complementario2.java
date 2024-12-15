import java.util.Scanner;

public class Complementario2 {
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
        Double radio = pedirDato("Ingrese el radio:");
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
                Double base = pedirDato("Ingrese la base:");
                Double altura = pedirDato("Ingrese la altura:");
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
                Double base = pedirDato("Ingrese la base:");
                Double altura = pedirDato("Ingrese la altura:");
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
            lados[i] = pedirDato("Ingrese la longitud del lado " + (i + 1) + ":");
        }
        return lados;
    }

    private static Double pedirDato(String mensaje) {
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
