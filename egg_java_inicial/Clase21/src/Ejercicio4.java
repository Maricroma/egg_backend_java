import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner sc = new Scanner(System.in);
    private static String oracion = "";

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenu();
            sc.nextLine();
            switch (opcion) {
                case 1 -> gestionarOracion();
                case 2 -> mostrarCantidadCaracteres();
                case 3 -> mostrarCantidadPalabras();
                case 4 -> mostrarPalabrasOrdenadas();
                case 5 -> mostrarPalabraEnPosicion();
                case 6 -> buscarPalabra();
                case 7 -> modificarPalabra();
                case 8 -> agregarContenido();
                case 9 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 9);
    }

    public static int mostrarMenu() {
        String menu = """
                ----- MENÚ DE OPCIONES -----
                1. %s
                2. Cantidad de caracteres de la oración
                3. Cantidad de palabras de la oración
                4. Mostrar palabras ordenadas alfabéticamente
                5. Ingresar un número y devolver la palabra correspondiente
                6. Buscar palabra dentro de la oración
                7. Modificar palabra dentro de la oración
                8. Agregar contenido a la oración
                9. Salir
                Seleccione una opción: 
                """.formatted(oracion.isEmpty() ? "Crear oración" : "Borrar oración");
    
        System.out.print(menu);
        return sc.nextInt();
    }

    public static void gestionarOracion() {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una nueva oración: ");
            oracion = sc.nextLine();
            System.out.println("Oración agregada.");
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    public static void mostrarCantidadCaracteres() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            System.out.println("Cantidad de caracteres en la oración: " + oracion.length());
        }
    }

    public static void mostrarCantidadPalabras() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            String[] palabras = oracion.trim().split("\\s+"); //corta x espacios
            System.out.println("Cantidad de palabras en la oración: " + palabras.length);
        }
    }

    public static void mostrarPalabrasOrdenadas() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            String[] palabras = oracion.trim().split("\\s+");
            Arrays.sort(palabras, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Palabras ordenadas alfabéticamente: " + String.join(", ", palabras));
        }
    }

    public static void mostrarPalabraEnPosicion() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            System.out.print("Ingrese el número de la palabra a mostrar: ");
            int posicion = sc.nextInt();
            String[] palabras = oracion.trim().split("\\s+");
            if (posicion < 1 || posicion > palabras.length) {
                System.out.println("Número inválido. Intente nuevamente.");
            } else {
                System.out.println("La palabra en la posición " + posicion + " es: " + palabras[posicion - 1]);
            }
        }
    }

    public static void buscarPalabra() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            System.out.print("Ingrese la palabra a buscar: ");
            String palabra = sc.nextLine();
            String[] palabras = oracion.trim().split("\\s+");
            int posicion = Arrays.asList(palabras).indexOf(palabra);
            if (posicion == -1) {
                System.out.println("Palabra no encontrada.");
            } else {
                System.out.println("Palabra encontrada en la posición: " + (posicion + 1));
            }
        }
    }

    public static void modificarPalabra() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            System.out.print("Ingrese la palabra que desea modificar: ");
            String palabraAntigua = sc.nextLine();
            if (!oracion.contains(palabraAntigua)) {
                System.out.println("La palabra no se encuentra en la oración.");
                return;
            }
            System.out.print("Ingrese la nueva palabra: ");
            String palabraNueva = sc.nextLine();
            if (palabraNueva.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) { // Validar que solo contenga letras y espacios
                oracion = oracion.replaceFirst("\\b" + palabraAntigua + "\\b", palabraNueva);
                System.out.println("Oración modificada: " + oracion);
            } else {
                System.out.println("La nueva palabra contiene caracteres inválidos.");
            }
        }
    }

    public static void agregarContenido() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración creada.");
        } else {
            System.out.print("Ingrese el contenido a agregar: ");
            String contenido = sc.nextLine();
            oracion += " " + contenido;
            System.out.println("Nueva oración: " + oracion);
        }
    }
}
