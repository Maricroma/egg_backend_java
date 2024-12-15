import java.util.Scanner;

import models.Circulo;
import models.Rectangulo;
import models.Triangulo;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Rectangulo rectangulo = null;
    public static Triangulo triangulo = null;
    public static Circulo circulo = null;

    public static void main(String[] args) {

        String opcion = null;
        do {
            mostrarMenuPrincipal();
            opcion = sc.nextLine();
            if (!opcion.equals("4")) {
                gestionarOpcion(opcion);
                sc.nextLine();
            } else System.out.println("Fin del programa.");
        } while (!opcion.equals("4"));
        
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("""
            \nCREACIÓN DE FIGURA GEOMÉTRICA
            1. Rectángulo
            2. Triángulo
            3. Círculo
            4. Salir
            Seleccione una opción:
            """);
       
    }

    public static void gestionarOpcion(String opcionPrincipal) {

        switch (opcionPrincipal) {
            case "1":
                rectangulo = crearRectangulo();
                System.out.println("Rectángulo creado.");
                System.out.println(rectangulo.imprimirArea() + "\n" + rectangulo.imprimirPerimetro());
                break;

            case "2":
                triangulo = crearTriangulo();
                System.out.println("Triángulo creado.");
                System.out.println(triangulo.imprimirArea());
                break;

            case "3":
                circulo = crearCirculo();
                System.out.println("Círculo creado.");
                System.out.println(circulo.imprimirArea() + "\n" + circulo.imprimirPerimetro());
                break;
        
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
       
    }

    public static Rectangulo crearRectangulo() {
        System.out.print("Ingrese el ancho: ");
        Double ancho = sc.nextDouble();
        System.out.print("Ingrese el alto: ");
        Double alto = sc.nextDouble();
        return new Rectangulo(ancho, alto);
         
    }

    public static Triangulo crearTriangulo() {
        System.out.print("Ingrese base: ");
        Double base = sc.nextDouble();
        System.out.print("Ingrese altura: ");
        Double altura = sc.nextDouble();
        return new Triangulo(base, altura);
         
    }

    public static Circulo crearCirculo() {
        System.out.print("Ingrese radio: ");
        Double radio = sc.nextDouble();
        return new Circulo(radio);
         
    }

}
