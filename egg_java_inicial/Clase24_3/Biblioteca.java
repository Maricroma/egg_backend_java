package Clase24_3;

import java.util.Scanner;

public class Biblioteca {
    // Arreglo para almacenar instancias de Libro
    private static Libro[] libros = new Libro[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de creación de instancias de Libro
        for (int i = 0; i < libros.length; i++) {  // Crear 3 libros como ejemplo
            Libro libro = new Libro();

            System.out.println("Ingrese el título del libro:");
            libro.setTitulo(scanner.nextLine());

            System.out.println("Ingrese el autor del libro:");
            libro.setAutor(scanner.nextLine());

            System.out.println("Ingrese un número para calcular las páginas:");
            int numero = scanner.nextInt();
            libro.setPaginas(numero);
            scanner.nextLine(); 

            libros[i] = libro;
            
        }

        // Imprimir detalles de un libro específico
        System.out.println("\nDetalles de los libros:");
        for (Libro libro : libros) {
            libro.imprimirDetalles();
            System.out.println("------");
        }

        // Imprimir todos los títulos de los libros disponibles
        System.out.println("Títulos de todos los libros disponibles:");
        imprimirTodosLosTitulos();

        scanner.close();
    }

    // Método para imprimir todos los títulos de los libros disponibles
    public static void imprimirTodosLosTitulos() {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}

// Actividad: Ejercicio Complementario
// Supongamos que estás desarrollando un sistema para una biblioteca. Necesitas modelar la clase "Libro" con los siguientes requisitos:

// La clase "Libro" debe tener tres atributos privados: "titulo", "autor" y "paginas".

// Debes proporcionar métodos públicos para establecer y obtener el título y el autor.

// Crea un método para establecer el número de páginas, teniendo en cuenta que este número surge del cálculo entre un número ingresado por el usuario multiplicado por 7. Ej: Si el usuario ingresa 20, la cantidad de páginas que tendrá ese libro es 140 (7*20).

// Además, la clase debe tener un método público llamado "imprimirDetalles" que imprime por consola todos los detalles del libro, incluyendo el título, el autor y el número de páginas.

// Almacena cada instancia creada  de Libro en un array.

// Crea un método para imprimir TODOS los libros disponibles (solo su título).