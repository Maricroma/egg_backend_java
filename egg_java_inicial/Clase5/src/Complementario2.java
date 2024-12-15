import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcionFigura, opcionCalculo;
        double resultado = 0;
        boolean error = false;

        System.out.print("""
                Cálculo de Área y Perímetro:
                1) Círculo
                2) Rectángulo
                Por favor, ingrese el número correspondiente a la figura elegida: 
                """);
        opcionFigura = sc.nextInt();

        switch (opcionFigura) {
            case 1 -> {
                System.out.println("Ha elegido Círculo.");
                System.out.println("Ingrese el valor del radio:");
                double radio = sc.nextDouble();

                System.out.print("""
                        ¿Qué desea calcular?
                        1) Área
                        2) Perímetro
                        """);
                opcionCalculo = sc.nextInt();

                resultado = switch (opcionCalculo) {
                    case 1 -> Math.PI * Math.pow(radio, 2); // Área = π * radio^2
                    case 2 -> 2 * Math.PI * radio; // Perímetro = 2π * radio
                    default -> {
                        System.out.println("Opción de cálculo no válida.");
                        error = true;
                        yield 0;
                    }
                };
            }
            case 2 -> {
                System.out.println("Ha elegido Rectángulo.");
                System.out.println("Ingrese el valor de la base:");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura:");
                double altura = sc.nextDouble();

                System.out.print("""
                        ¿Qué desea calcular?
                        1) Área
                        2) Perímetro
                        """);
                opcionCalculo = sc.nextInt();

                resultado = switch (opcionCalculo) {
                    case 1 -> base * altura; // Área = base * altura
                    case 2 -> 2 * (base + altura); // Perímetro = 2 * (base + altura)
                    default -> {
                        System.out.println("Opción de cálculo no válida.");
                        error = true;
                        yield 0;
                    }
                };
            }
            default -> {
                System.out.println("Opción de figura no válida.");
                error = true;
            }
        }

        if (!error) {
            System.out.println("El resultado es: " + String.format("%.2f", resultado));
        }

        sc.close();
    }
}
