package Clase24_1;

import java.util.Scanner;

import Clase24_1.modelos.Circulo;
import Clase24_1.modelos.Rectangulo;
import Clase24_1.modelos.Triangulo;

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

// Actividad: Avanzando con las figuras geométricas
// Basándote el la actividad realizada anteriormente, crea un nuevo proyecto para realizar las siguientes actividades:


// Crea una carpeta llamada modelos donde crearas todas tus clases personalizadas.

// Dentro de la carpeta, crea una clase llamada Rectangulo.

// Define 2 atributos para la clase del tipo private: ancho y alto. Pueden ser números decimales o enteros.

// Diseña  2 constructores, uno con todos los parámetros y otro sin parámetros. 

// Crea los métodos getter y setter de todos los atributos de la clase. 

// Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables de calcular el área y el perímetro del rectángulo, respectivamente.

// Implementa un método para imprimir los datos de dicha figura.

// Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' y acceder a sus métodos para obtener información relevante.

// En la misma carpeta modelos, crea una nueva  clase llamada Triangulo. Define los atributos necesarios para calcular el área de la figura geométrica. Implementa los modificadores de acceso adecuados para estos atributos y crea getters y setters según sea necesario. Además, desarrolla el método para calcular el área del triángulo. Implementa un método para imprimir los datos de dicha figura. Asegúrate de especificar los parámetros necesarios y el tipo de retorno de estos métodos.

// En la misma carpeta modelos, crea una nueva  clase llamada Circulo. Define los atributos necesarios para calcular el área y el perímetro de la figura geométrica. Implementa los modificadores de acceso adecuados para estos atributos y crea getters y setters según sea necesario. Además, desarrolla métodos para calcular el área y el perímetro del círculo. Asegúrate de especificar los parámetros necesarios y el tipo de retorno de estos métodos.

// Genera un menú para que el usuario pueda seleccionar la figura geométrica que desea crear, ingresar los datos necesarios para la misma, y obtener en consola los datos de dicha figura. 