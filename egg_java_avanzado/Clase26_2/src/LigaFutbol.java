import java.util.ArrayList;
import java.util.Scanner;

public class LigaFutbol {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Equipo> equipos = new ArrayList<>();
    public static ArrayList<Jugador> jugadores = new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = pedirOpcion("Elige una opción: ");
            scanner.nextLine(); 
            gestionarMenuPrincipal(opcion);
            
        } while (opcion != 10);

        scanner.close();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("""
                \n=== Menú de la Liga de Fútbol ===
                1. Crear jugador
                2. Crear equipo
                3. Asignar jugador a equipo
                4. Mostrar jugadores
                5. Mostrar equipos
                6. Eliminar jugador
                7. Eliminar equipo
                8. Seleccionar jugador
                9. Seleccionar equipo
                10. Salir""");
    }

    public static void mostrarMenuJugador() {
        System.out.println("""
                \n=== Menú de Jugador ===
                1. Ver detalles
                2. Cambiar nombre
                3. Cambiar equipo
                4. Volver al menú principal
                """);
    }

    public static void mostrarMenuEquipo() {
        System.out.println("""
                \n=== Menú de Equipo ===
                1. Ver detalles
                2. Cambiar nombre
                3. Agregar jugador al equipo
                4. Mostrar jugadores del equipo
                5. Volver al menú principal
                """);
    }

    public static void gestionarMenuPrincipal(int opcion) {
        switch (opcion) {
            case 1:
                // Crear jugador
                crearJugador();
                break;

            case 2:
                // Crear equipo
                crearEquipo();
                break;

            case 3:
                // Asignar jugador a equipo
                asignarJugadorAEquipo();
                break;

            case 4:
                // Mostrar jugadores
                mostrarJugadores();
                break;

            case 5:
                // Mostrar equipos
                mostrarEquipos();
                break;
            
            case 6:
                // Eliminar jugador
                eliminarJugador();
                break;

            case 7:
                // Eliminar equipo
                eliminarEquipo();
                break;

            case 8:
                // Seleccionar jugador
                if (existenJugadores()) {
                    Jugador jugadorSeleccionado = seleccionarJugador();
                    do {
                        mostrarMenuJugador();
                        opcion = pedirOpcion("Elige una opción: ");
                        scanner.nextLine();
                        gestionarMenuJugador(opcion, jugadorSeleccionado);
                    } while (opcion != 4);
                }
                break;
            
            case 9:
                // Seleccionar equipo
                if (existenEquipos()) {
                    Equipo equipoSeleccionado = seleccionarEquipo();
                    do {
                        mostrarMenuEquipo();
                        opcion = pedirOpcion("Elige una opción: ");
                        scanner.nextLine();
                        gestionarMenuEquipo(opcion, equipoSeleccionado);
                    } while (opcion != 5);
                }
                break;

            case 10:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");
                break;
        }
    }

    public static boolean existenJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores cargados.");
            return false;
        }
        return true;
    }

    public static boolean existenEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos cargados.");
            return false;
        }
        return true;
    }

    public static void gestionarMenuJugador(int opcion, Jugador jugadorSeleccionado) {
        switch (opcion) {
            case 1:
                // Ver detalles
                System.out.println(jugadorSeleccionado.toString());
                break;

            case 2:
                // Cambiar nombre
                String nuevoNombre = pedirDato("Ingrese el nuevo nombre: "); 
                jugadorSeleccionado.setNombre(nuevoNombre);
                System.out.println("Nuevo nombre guardado.");
                break;

            case 3:
                // Cambiar equipo
                Equipo nuevoEquipo = seleccionarEquipo(); 
                jugadorSeleccionado.setEquipo(nuevoEquipo);
                System.out.println("Nuevo equipo guardado.");
                break;
            case 4:
                break;
            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");
        }
    }

    public static void gestionarMenuEquipo(int opcion, Equipo equipoSeleccionado) {
        switch (opcion) {
            case 1:
                // Ver detalles
                System.out.println("Nombre: " + equipoSeleccionado.getNombre());
                break;

            case 2:
                // Cambiar nombre
                String nuevoNombre = pedirDato("Ingrese el nuevo nombre: "); 
                equipoSeleccionado.setNombre(nuevoNombre);
                System.out.println("Nuevo nombre guardado.");
                break;

            case 3:
                // Agregar jugador al equipo
                Jugador jugadorSeleccionado = seleccionarJugador();
                asignarJugadorAEquipo(jugadorSeleccionado, equipoSeleccionado);
                break;
            case 4:
                // Mostrar jugadores del equipo
                filtrarJugadoresPorEquipo(equipoSeleccionado);
                break;
            case 5:
                break;
            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");

        }
    }

    public static void crearJugador() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles. Debe crear un equipo primero.");
        } else {
            String nombreJugador = pedirDato("Ingresa el nombre del jugador: ");
            System.out.println("Elige un equipo para el jugador:");
            Equipo equipoSeleccionado = seleccionarEquipo();
            if (equipoSeleccionado != null) {
                jugadores.add(new Jugador(nombreJugador, equipoSeleccionado));
                System.out.println("Jugador creado y asignado al equipo " + equipoSeleccionado.getNombre() + ".");
            } else {
                System.out.println("Jugador creado sin equipo asignado.");
                jugadores.add(new Jugador(nombreJugador, null));
            }
        }
    }

    public static void crearEquipo() {
        String nombreEquipo = pedirDato("Ingresa el nombre del equipo: ");
        equipos.add(new Equipo(nombreEquipo));
        System.out.println("Equipo creado correctamente.");
    }

    public static void asignarJugadorAEquipo() {
        if (existenJugadores() && existenEquipos()) {
            Jugador jugadorSeleccionado = seleccionarJugador();
            Equipo equipoSeleccionado = seleccionarEquipo();
            jugadorSeleccionado.setEquipo(equipoSeleccionado);
            System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " asignado al equipo " + equipoSeleccionado.getNombre() + ".");
        } 
    }

    public static void asignarJugadorAEquipo(Jugador jugadorSeleccionado, Equipo equipoSeleccionado) {
        jugadorSeleccionado.setEquipo(equipoSeleccionado);
        System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " asignado al equipo " + equipoSeleccionado.getNombre() + ".");
            
    }

    public static boolean mostrarEquipos() {
        if (existenEquipos()) {
            System.out.println("=== Lista de Equipos ===");
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
            }
            return true;
        }
        return false;
    }

    public static boolean mostrarJugadores() {
        if (existenJugadores()) {
            System.out.println("=== Lista de Jugadores ===");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println((i + 1) + ". " + jugadores.get(i).getNombre() + " (" + (jugadores.get(i).getEquipo() != null ? jugadores.get(i).getEquipo().getNombre() : "Sin equipo") + ")");
            }
            return true;   
        }
        return false;
    }

    public static String pedirDato(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static Integer pedirOpcion(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static Jugador seleccionarJugador() { 
        int eleccion;
        if (mostrarJugadores()) {
            eleccion = pedirOpcion("Ingresa el número del jugador: ");
            scanner.nextLine();

            if (eleccion > 0 && eleccion <= jugadores.size()) {
                return jugadores.get(eleccion - 1);
            } else {
                System.out.println("Selección inválida.");
                return null;
            }
        } else  {
            return null;
        }
        
    }

    public static Equipo seleccionarEquipo() { 
        int eleccion;
        if (mostrarEquipos()) {
            eleccion = pedirOpcion("Ingresa el número del equipo: ");
            scanner.nextLine(); 
            if (eleccion > 0 && eleccion <= equipos.size()) {
                return equipos.get(eleccion - 1);
            } else {
                System.out.println("Selección inválida.");
                return null;
            }
        } else  {
            return null;
        }
        
    }

    public static void eliminarJugador() {
        if (existenJugadores()) {
            Jugador jugadorSeleccionado = seleccionarJugador();
            jugadores.remove(jugadorSeleccionado);
            System.out.println("Jugador eliminado.");
        }
    }

    public static void eliminarEquipo() {
        if (existenEquipos()) {
            Equipo equipoSeleccionado = seleccionarEquipo();
            equipos.remove(equipoSeleccionado);

            // Eliminar jugadores que pertenecen al equipo seleccionado
            jugadores.removeIf(jugador -> jugador.getEquipo() == equipoSeleccionado);
            
            // // Usamos un iterador para evitar problemas de concurrencia al eliminar elementos de la lista
            // Iterator<Jugador> iterador = jugadores.iterator();
            // while (iterador.hasNext()) {
            //     Jugador jugador = iterador.next();
            //     if (jugador.getEquipo() == equipoSeleccionado) {
            //         iterador.remove();
            //     }
            // }

            // // Filtrar jugadores que no pertenecen al equipo seleccionado y recolectar en un ArrayList
            // jugadores = jugadores.stream()
            //                     .filter(jugador -> jugador.getEquipo() != equipoSeleccionado)
            //                     .collect(Collectors.toCollection(ArrayList::new));
            
            System.out.println("Equipo y sus jugadores eliminados.");
        }
    }

    public static void filtrarJugadoresPorEquipo(Equipo equipoSeleccionado) {
        for (Jugador jugador : jugadores) {
            if (jugador.getEquipo() == equipoSeleccionado) {
                System.out.println(" - " + jugador.getNombre());
            }
        }
    }
}

