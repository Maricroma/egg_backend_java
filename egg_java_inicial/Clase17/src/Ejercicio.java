import java.util.Scanner;

public class Ejercicio {
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
