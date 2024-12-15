import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int opcion;
        boolean error = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Cálculo del área:
                1) Círculo
                2) Cuadrado
                3) Triángulo
                Por favor, ingrese el número correspondiente a la figura elegida: 
                """);
        opcion = sc.nextInt();
        
        double area = switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el radio:");
                double radio = sc.nextDouble();
                yield Math.PI * Math.pow(radio, 2); // Área = π * radio^2
            }
            case 2 -> {
                System.out.println("Ingrese el lado:");
                double lado = sc.nextDouble();
                yield Math.pow(lado, 2);
            }
            case 3 -> {
                System.out.println("Ingrese la base:");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura:");
                double altura = sc.nextDouble();
                yield 0.5 * base * altura;
            }
            default -> {
                error = true;
                yield 0;
            }
        };

        System.out.println(error ? "Error en la opción elegida.": "El área es: " + String.format("%.2f", area));

        sc.close();
    }
}
