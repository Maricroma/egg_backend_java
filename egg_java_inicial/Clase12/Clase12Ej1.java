package Clase12;

import java.util.Scanner;

public class Clase12Ej1 {
    public static void main(String[] args) {
        String opcion = "";
        Scanner sc = new Scanner(System.in);
        
        while (!opcion.equals("5")) {
            System.out.println("""

                1) Comprar producto.
                2) Realizar devolución.
                3) Ver mis pedidos.
                4) Preguntas frecuentes.
                5) Salir.
                Ingrese la opción elegida:""");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Eligió comprar un producto");
                    break;
                case "2":
                    System.out.println("Eligió realizar una devolución");
                    break;
                case "3":
                    System.out.println("Eligió ver pedidos");
                    break;
                case "4":
                    System.out.println("Eligió preguntas frecuentes");
                    break;
                case "5":
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
                    break;
            }
        }
        sc.close();
    }
}

// CONSIGNA
// Menú interactivo con while 
// Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:

// Comprar producto.

// Realizar devolución.

// Ver mis pedidos.

// Preguntas frecuentes.

// Salir.

// Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa. En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, simplemente muestra un mensaje que indique qué opción eligió el usuario.