import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) throws Exception {

        biblioteca.setUsuarios(Arrays.asList(
            new Persona("Carlos", "Lopez"),
            new Persona("Jose", "Ramirez"),
            new Persona("Julio", "Salvador"),
            new Persona("Lorena", "Marquez"),
            new Persona("Ramiro", "Tejada")
        ));

        biblioteca.setLibros(Arrays.asList(
            new Libro("El túnel", "Ernesto Sábato", 345),
            new Libro("Cien años de soledad", "Gabriel García Márquez", 500),
            new Libro("Eva Luna", "Isabel Allende", 432),
            new Libro("El ocaso de los ídolos", "Friedrich Nietzsche", 200),
            new Libro("Rayuela", "Julio Cortázar", 776)
        ));

        gestionarBiblioteca();
        sc.close();

    }

    public static void gestionarBiblioteca() {
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            gestionarMenu(opcion);
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("""
                \nMENÚ PRINCIPAL
                1) Agregar libro
                2) Ver catálogo
                3) Ingresar como usuario
                0) Salir
                Elija una opción:
                """);
    }

    public static void mostrarMenuUsuario() {
        System.out.println("""
                \nMENÚ DE USUARIO
                1) Pedir libro 
                2) Devolver libro
                3) Ver lista de libros prestados
                0) Volver al menú anterior
                Elija una opción:
                """);
    }

    public static void gestionarMenu(int opcion) {
        switch (opcion) {
            case 1:
                agregarLibro();
                break;

            case 2:
                verCatalogo(biblioteca.getLibros());
                break;

            case 3:
                String nombre = pedirDato("Ingrese su nombre: ");
                String apellido = pedirDato("Ingrese su apellido: ");
                Persona usuario = buscarUsuario(nombre, apellido);
                if (usuario != null) {
                    do {
                        mostrarMenuUsuario();
                        opcion = sc.nextInt();
                        sc.nextLine();
                        gestionarMenuUsuario(usuario, opcion);
                    } while (opcion != 0);
                } else {
                    System.out.println("Error. Los datos no coinciden con un usuario.");
                }
                break;

            case 0:
                System.out.println("Programa finalizado.");
                break;

            default:
                System.out.println("Opción incorrecta. Intente nuevamente.");
        }
    }

    public static void gestionarMenuUsuario(Persona usuario, int opcion) {

        switch (opcion) {
            case 1:
                Libro libroAPrestar = elegirLibro(biblioteca.getLibros(),false);
                prestarLibro(libroAPrestar);
                usuario.getPrestados().add(libroAPrestar);
                break;
            
            case 2:
                Libro libroADevolver = elegirLibro(usuario.getPrestados(), true);
                devolverLibro(libroADevolver);
                break;

            case 3:
                verCatalogo(usuario.getPrestados());
                break;

            case 0:
                break;
        
            default:
                System.out.println("Opción incorrecta. Intente nuevamente.");;
        }
    }

    public static String pedirDato(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static Persona buscarUsuario(String nombre, String apellido) {
        return biblioteca.getUsuarios().stream()
        .filter(usuario -> usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido))
        .findFirst()
        .orElse(null); // Devuelve el usuario encontrado o null si no hay coincidencias
    }

    public static void agregarLibro() {
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese autor: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese cantidad de páginas: ");
        int cantPaginas = sc.nextInt();
        sc.nextLine();
        Libro libro = new Libro(nombre, autor, cantPaginas);
        biblioteca.agregarLibro(libro);
        System.out.println("Libro agregado al catálogo.");
    }

    public static void verCatalogo(List<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println(libro.obtenerInformacion());
        }
    }

    public static Libro elegirLibro(List<Libro> libros, boolean estado) {
        int cont = 0;
        int indice;
        List<Libro> temp = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.isPrestado() == estado) {
                temp.add(libro);
            }
        }

        System.out.println("Elija un libro de la lista:");
        for (Libro libro : temp) {
            System.out.println((cont+1) + " - " + libro.getTitulo());
            cont++;
        }

        indice = sc.nextInt()-1;
        sc.nextLine();

        if (indice >= 0 && indice < temp.size()) {
            return temp.get(indice); // Devuelve el objeto en el índice indicado
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango"); // Manejo de error
        }
    }

    public static void prestarLibro(Libro libroAPrestar) {
        biblioteca.prestarLibro(libroAPrestar);
        System.out.println("Libro prestado.");    
    }

    public static void devolverLibro(Libro libroADevolver) {
        biblioteca.devolverLibro(libroADevolver);;
        System.out.println("Libro devuelto.");    
    }
}
