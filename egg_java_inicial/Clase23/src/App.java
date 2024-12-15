import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static Auto auto = null;
    public static Rectangulo rectangulo = null;
    public static void main(String[] args) {
        System.out.println("\n-------- ACTIVIDAD 1 ---------");

        Persona p1 = new Persona("Lucía", 23);
        
        p1.imprimirDatos();
        System.out.println(p1.getNombre() + " tiene " + p1.getEdad() + " años.");

        System.out.println("\n-------- ACTIVIDAD 2 ---------");

        Auto auto1 = new Auto("Toyota", "Corolla", 2020);
        Auto auto2 = new Auto("Ford", "Focus");
        Auto auto3 = new Auto("Chevrolet");
        Auto auto4 = new Auto();

        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();

        System.out.println("\n-------- ACTIVIDAD 3 ---------");

        String opcion = null;
        do {
            mostrarMenuAuto();
            opcion = sc.nextLine();
            crearAuto(opcion);
        } while (!opcion.equals("6"));

        System.out.println("\n-------- ACTIVIDAD 4 ---------");
        do {
            mostrarMenuRectangulo();
            opcion = sc.nextLine();
            gestionarOpcion(opcion);
        } while (!opcion.equals("6"));
        sc.close();
    }

    public static void mostrarMenuAuto() {
        System.out.println("""
            \nMenú de opciones:
            1. Crear Auto con marca, modelo y año
            2. Crear Auto con marca y modelo
            3. Crear Auto con solo la marca
            4. Crear Auto sin datos
            5. Imprimir datos del Auto
            6. Salir
            Seleccione una opción:
            """);
       
    }

    public static void crearAuto(String opcion) {
        switch (opcion) {
            case "1":
                System.out.print("Ingrese la marca: ");
                String marcaCompleta = sc.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modeloCompleto = sc.nextLine();
                System.out.print("Ingrese el año: ");
                int anioCompleto = sc.nextInt();
                sc.nextLine();
                auto = new Auto(marcaCompleta, modeloCompleto, anioCompleto);
                System.out.println("Auto creado con marca, modelo y año.\n");
                break;

            case "2":
                System.out.print("Ingrese la marca: ");
                String marcaModelo = sc.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modeloSolo = sc.nextLine();
                auto = new Auto(marcaModelo, modeloSolo);
                System.out.println("Auto creado con marca y modelo.\n");
                break;

            case "3":
                System.out.print("Ingrese la marca: ");
                String marcaSolo = sc.nextLine();
                auto = new Auto(marcaSolo);
                System.out.println("Auto creado con solo la marca.\n");
                break;

            case "4":
                auto = new Auto();
                System.out.println("Auto creado sin datos.\n");
                break;

            case "5":
                if (auto != null) {
                    auto.imprimirDatos();
                } else {
                    System.out.println("Primero debes crear un auto.\n");
                }
                break;

            case "6":
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida.\n");
        }
    }

    public static void mostrarMenuRectangulo() {
        System.out.println("""
            \nMenú de opciones:
            1. Crear rectángulo
            2. Calcular área
            3. Calcular perímetro
            4. Imprimir datos del rectángulo
            5. Ver cantidad de rectángulos creados
            6. Salir
            Seleccione una opción:
            """);
       
    }

    public static void gestionarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                System.out.print("Ingrese alto: ");
                Double alto = sc.nextDouble();
                System.out.print("Ingrese ancho: ");
                Double ancho = sc.nextDouble();
                sc.nextLine();
                rectangulo = new Rectangulo(ancho, alto);
                System.out.println("Rectángulo creado.\n");
                break;

            case "2":
                if (rectangulo != null) {
                    System.out.println("Área: " + rectangulo.imprimirArea());
                } else {
                    System.out.println("No hay rectángulo creado.");
                }
                break;

            case "3":
                if (rectangulo != null) {
                    System.out.println("Área: " + rectangulo.imprimirPerimetro());
                } else {
                    System.out.println("No hay rectángulo creado.");
                }
                break;

            case "4":
            if (rectangulo != null) {
                System.out.println("Área: " + rectangulo.imprimirDatos());
            } else {
                System.out.println("No hay rectángulo creado.");
            }
            break;

            case "5":
                System.out.println("Cantidad de rectángulos creados: " + Rectangulo.mostrarCantRectangulos());
                break;

            case "6":
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida.\n");
        }
    }
}
