package Clase17;

import java.util.Scanner;

public class Clase17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oracion = "";
        int opcion;

        do {
            // Mostrar el menú de opciones
            System.out.println("\n--- Menú ---");
            if (oracion.isEmpty()) {
                System.out.println("1. Crear oración");
            } else {
                System.out.println("1. Borrar oración");
            }
            System.out.println("""
                    2. Cantidad de caracteres de la oración
                    3. Cantidad de palabras de la oración
                    4. Mostrar palabras ordenadas alfabéticamente
                    5. Ingresar un número y devolver la palabra correspondiente
                    6. Buscar palabra dentro de la oración
                    7. Modificar palabra dentro de la oración
                    8. Agregar contenido a la oración
                    9. Salir
                    Seleccione una opción:""");
            opcion = scanner.nextInt();
            scanner.nextLine();
            String[] palabras = oracion.split(" ");

            switch (opcion) {
                case 1:
                    if (oracion.isEmpty()) {
                        System.out.print("Ingrese la nueva oración: ");
                        oracion = scanner.nextLine();
                    } else {
                        oracion = "";
                        System.out.println("Oración borrada.");
                    }
                    break;
                case 2:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración no contiene caracteres.");
                    } else {
                        System.out.println("Cantidad de caracteres: " + oracion.length());
                    }
                    break;
                case 3:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración no contiene palabras.");
                    } else {
                        System.out.println("Cantidad de palabras: " + palabras.length);
                    }
                    break;
                case 4:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración no contiene palabras.");
                    } else {
                        for (int i = 0; i < palabras.length - 1; i++) {
                            for (int j = i + 1; j < palabras.length; j++) {
                                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                                    String temp = palabras[i];
                                    palabras[i] = palabras[j];
                                    palabras[j] = temp;
                                }
                            }
                        }
                        System.out.println("Palabras ordenadas alfabéticamente:");
                        for (int i = 0; i < palabras.length; i++) {
                            System.out.println(palabras[i]);
                        }
                    }
                    break;
                case 5:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración no contiene palabras.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int numero = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        if (numero > 0 && numero <= palabras.length) {
                            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                    }
                    break;
                case 6:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración no contiene palabras.");
                    } else {
                        System.out.print("Ingrese una palabra para buscar: ");
                        String palabraBuscar = scanner.nextLine();
                        boolean encontrada = false;
                        for (int i = 0; i < palabras.length; i++) {
                            if (palabras[i].equalsIgnoreCase(palabraBuscar)) {
                                System.out.println("Palabra encontrada en la posición " + (i + 1));
                                encontrada = true;
                                break;
                            }
                        }
                        if (!encontrada) {
                            System.out.println("Palabra no encontrada.");
                        }
                    }
                    break;
                case 7:
                    if (oracion.isEmpty()) {
                        System.out.println("La oración no contiene palabras.");
                    } else {
                        System.out.print("Ingrese la palabra que quiere modificar: ");
                        String palabraModificar = scanner.nextLine();
                        boolean existe = false;
                        for (int i = 0; i < palabras.length; i++) {
                            if (palabras[i].equalsIgnoreCase(palabraModificar)) {
                                System.out.print("Ingrese la nueva palabra: ");
                                String nuevaPalabra = scanner.nextLine();
                                palabras[i] = nuevaPalabra;
                                existe = true;
                                break;
                            }
                        }
                        if (!existe) {
                            System.out.println("Palabra no encontrada. Intente nuevamente.");
                        } else {
                            oracion = "";
                            for (int i = 0; i < palabras.length; i++) {
                                oracion += palabras[i] + (i < palabras.length - 1 ? " " : "");
                            }
                            System.out.println("Nueva oración: " + oracion);
                        }
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el contenido a agregar: ");
                    String contenidoAgregar = scanner.nextLine();
                    oracion += " " + contenidoAgregar;
                    System.out.println("Oración actualizada: " + oracion);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;

            }
        } while (opcion != 9);

        scanner.close();
    }
}

// CONSIGNA
// Manipulando oraciones
// Escribe un programa en Java que permita al usuario realizar diversas
// operaciones con una oración. El programa debe cumplir con los siguientes
// requisitos:

// Muestra un menú de opciones al usuario donde podrá:

// Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje
// "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar
// oración".

// Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de
// caracteres en la oración (incluyendo espacios).

// Cantidad de palabras de la oración: Calcular y mostrar la cantidad de
// palabras en la oración.

// Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la
// oración ordenadas alfabéticamente.

// Ingresar un número y devolver la palabra correspondiente: Solicitar al
// usuario ingresar un número y mostrar la palabra correspondiente a esa
// posición en la oración. Si se ingresa un número fuera del rango de número de
// palabras (la primera palabra corresponde al número 1), mostrar el mensaje
// "Número inválido. Intente nuevamente".

// Buscar palabra dentro de la oración: Solicitar al usuario ingresar una
// palabra y verificar si esa palabra se encuentra en la oración. Mostrar un
// mensaje indicando si la palabra fue encontrada y la posición en la que se
// encuentra.

// Modificar palabra dentro de la oración: Solicitar al usuario ingresar la
// palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra
// y volver a solicitar la palabra. Si la palabra es correcta, solicitar una
// nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración
// modificada (recordar validar que solo contenga letras y espacios).

// Agregar contenido a la oración: Solicitar al usuario ingresar contenido y
// agregar ese contenido al final de la oración.

// Salir: Terminar el programa.

// Después de realizar una operación, mostrar el menú de opciones nuevamente
// para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".

// Realiza las validaciones que consideres necesarias.
