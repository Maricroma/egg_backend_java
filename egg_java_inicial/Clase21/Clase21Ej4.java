package Clase21;

import java.util.Arrays;
import java.util.Scanner;

public class Clase21Ej4 {
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

// CONSIGNA
// Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:

// 1. Muestra un menú de opciones al usuario donde podrá:

// a. Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

// b. Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).

// c. Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.

// d. Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.

// e. Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".

// f. Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.

// g. Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).

// h. Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.

// i. Salir: Terminar el programa.

// Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".

// Realiza las validaciones que consideres necesarias.
