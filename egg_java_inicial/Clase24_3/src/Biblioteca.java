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
