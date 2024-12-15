import java.util.ArrayList;
import java.util.Scanner;

public class LigaFutbol {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Equipo> equipos = new ArrayList<>();
    public static ArrayList<Jugador> jugadores = new ArrayList<>();
    public static ArrayList<Entrenador> entrenadores = new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = pedirOpcion("Elige una opción: ");
            scanner.nextLine(); 
            gestionarMenuPrincipal(opcion);
            
        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("""
                \n=== Menú de la Liga de Fútbol ===
                1. Crear jugador
                2. Crear equipo
                3. Crear entrenador
                4. Asignar jugador a equipo
                5. Asignar entrenador a equipo
                6. Mostrar jugadores
                7. Mostrar entrenadores
                8. Mostrar equipos
                9. Eliminar jugador
                10. Eliminar entrenador
                11. Eliminar equipo
                12. Seleccionar jugador
                13. Seleccionar equipo
                14. Seleccionar entrenador
                0. Salir""");
    }

    public static void mostrarMenuJugador() {
        System.out.println("""
                \n=== Menú de Jugador ===
                1. Ver detalles
                2. Cambiar nombre
                3. Cambiar equipo
                0. Volver al menú principal
                """);
    }

    public static void mostrarMenuEntrenador() {
        System.out.println("""
                \n=== Menú de Entrenador ===
                1. Ver detalles
                2. Ver jugadores a cargo
                3. Cambiar nombre
                4. Cambiar equipo
                0. Volver al menú principal
                """);
    }

    public static void mostrarMenuEquipo() {
        System.out.println("""
                \n=== Menú de Equipo ===
                1. Ver detalles
                2. Cambiar nombre
                3. Agregar jugador al equipo
                4. Mostrar jugadores del equipo
                5. Gritar gol
                0. Volver al menú principal
                """);
    }

    public static void gestionarMenuPrincipal(int opcion) {
        switch (opcion) {
            case 1:
                // Crear jugador
                crearIntegranteDeEquipo(opcion);
                break;

            case 2:
                // Crear equipo
                crearEquipo();
                break;

            case 3:
                // Crear entrenador
                crearIntegranteDeEquipo(opcion);
                break;

            case 4:
                // Asignar jugador a equipo
                asignarIntegranteAEquipo(opcion);
                break;

            case 5:
                //5. Asignar entrenador a equipo
                asignarIntegranteAEquipo(opcion);
                break;

            case 6:
                // Mostrar jugadores
                mostrarJugadores();
                break;

            case 7:
                // Mostrar entrenadores
                mostrarEntrenadores();
                break;

            case 8:
                // Mostrar equipos
                mostrarEquipos();
                break;
            
            case 9:
                // Eliminar jugador
                eliminarIntegranteDeEquipo(opcion);
                break;

            case 10:
                // Eliminar entrenador
                eliminarIntegranteDeEquipo(opcion);
                break;

            case 11:
                // Eliminar equipo
                eliminarEquipo();
                break;

            case 12:
                // Seleccionar jugador
                if (existenJugadores()) {
                    Jugador jugadorSeleccionado = (Jugador) seleccionarIntegranteDeEquipo(opcion);
                    do {
                        mostrarMenuJugador();
                        opcion = pedirOpcion("Elige una opción: ");
                        scanner.nextLine();
                        gestionarMenuJugador(opcion, jugadorSeleccionado);
                    } while (opcion != 0);
                }
                break;
            
            case 13:
                // Seleccionar equipo
                if (existenEquipos()) {
                    Equipo equipoSeleccionado = seleccionarEquipo();
                    do {
                        mostrarMenuEquipo();
                        opcion = pedirOpcion("Elige una opción: ");
                        scanner.nextLine();
                        gestionarMenuEquipo(opcion, equipoSeleccionado);
                    } while (opcion != 0);
                }
                break;

            case 14:
                // Seleccionar entrenador
                if (existenEntrenadores()) {
                    Entrenador entrenadorSeleccionado = (Entrenador) seleccionarIntegranteDeEquipo(opcion);
                    do {
                        mostrarMenuEntrenador();
                        opcion = pedirOpcion("Elige una opción: ");
                        scanner.nextLine();
                        gestionarMenuEntrenador(opcion, entrenadorSeleccionado);
                    } while (opcion != 0);
                }
                break;

            case 0:
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

    public static boolean existenEntrenadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay entrenadores cargados.");
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

            case 0:
                break;

            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");
        }
    }

    public static void gestionarMenuEntrenador(int opcion, Entrenador entrenadorSeleccionado) {
        switch (opcion) {
            case 1:
                // Ver detalles
                System.out.println(entrenadorSeleccionado.toString());
                break;

            case 2:
                // Ver jugadores a cargo
                filtrarJugadoresPorEntrenador(entrenadorSeleccionado);
                break;

            case 3:
                // Cambiar nombre
                String nuevoNombre = pedirDato("Ingrese el nuevo nombre: "); 
                entrenadorSeleccionado.setNombre(nuevoNombre);
                System.out.println("Nuevo nombre guardado.");
                break;

            case 4:
                // Cambiar equipo
                Equipo nuevoEquipo = seleccionarEquipo(); 
                entrenadorSeleccionado.setEquipo(nuevoEquipo);
                System.out.println("Nuevo equipo guardado.");
                break;

            case 0:
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
                Jugador jugadorSeleccionado = (Jugador) seleccionarIntegranteDeEquipo(12);
                asignarJugadorAEquipo(jugadorSeleccionado, equipoSeleccionado);
                break;

            case 4:
                // Mostrar jugadores del equipo
                filtrarJugadoresPorEquipo(equipoSeleccionado);
                break;

            case 5:
                // Gritar gol
                gritarGol(equipoSeleccionado);
                break;

            case 0:
                break;

            default:
                System.out.println("Opción inválida. Inténtalo de nuevo.");

        }
    }

    public static void crearIntegranteDeEquipo(int opcion) {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles. Debe crear un equipo primero.");
        } else {
            String nombre = pedirDato("Ingresa el nombre: ");
            Integer edad = pedirOpcion("Ingresa la edad: ");
            System.out.println("Elige un equipo:");
            Equipo equipoSeleccionado = seleccionarEquipo();
            if (equipoSeleccionado != null) {
                if (opcion == 1) {
                    jugadores.add(new Jugador(nombre, edad, equipoSeleccionado));
                    System.out.println("Jugador creado y asignado al equipo " + equipoSeleccionado.getNombre() + ".");
                } else {
                    entrenadores.add(new Entrenador(nombre, edad, equipoSeleccionado));
                    System.out.println("Entrenador creado y asignado al equipo " + equipoSeleccionado.getNombre() + ".");
                }
            } else {
                System.out.println("No hay equipo seleccionado.");
            }
        }
    }

    public static void crearEquipo() {
        String nombreEquipo = pedirDato("Ingresa el nombre del equipo: ");
        equipos.add(new Equipo(nombreEquipo));
        System.out.println("Equipo creado correctamente.");
    }

    public static void asignarIntegranteAEquipo(int opcion) {
        if (opcion == 4 && existenJugadores() && existenEquipos()) {
            Jugador jugadorSeleccionado = (Jugador) seleccionarIntegranteDeEquipo(12);
            Equipo equipoSeleccionado = seleccionarEquipo();
            jugadorSeleccionado.setEquipo(equipoSeleccionado);
            System.out.println("Jugador " + jugadorSeleccionado.getNombre() + " asignado al equipo " + equipoSeleccionado.getNombre() + ".");
        } else if (opcion == 5 && existenEntrenadores() && existenEquipos()) {
            Entrenador entrenadorSeleccionado = (Entrenador) seleccionarIntegranteDeEquipo(opcion);
            Equipo equipoSeleccionado = seleccionarEquipo();
            entrenadorSeleccionado.setEquipo(equipoSeleccionado);
            System.out.println("Entrenador " + entrenadorSeleccionado.getNombre() + " asignado al equipo " + equipoSeleccionado.getNombre() + ".");
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

    public static boolean mostrarEntrenadores() {
        if (existenEntrenadores()) {
            System.out.println("=== Lista de Entrenadores ===");
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre() + " (" + (entrenadores.get(i).getEquipo() != null ? entrenadores.get(i).getEquipo().getNombre() : "Sin equipo") + ")");
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

    public static Persona seleccionarIntegranteDeEquipo(int opcion) { 
        int eleccion;
        if (opcion == 12) {
            if (mostrarJugadores()) {
                eleccion = pedirOpcion("Ingresa el número del jugador: ");
                scanner.nextLine();
    
                if (eleccion > 0 && eleccion <= jugadores.size()) {
                    return jugadores.get(eleccion - 1);
                } else {
                    System.out.println("Selección inválida.");
                }
            } 
        } else {
            if (mostrarEntrenadores()) {
                eleccion = pedirOpcion("Ingresa el número del entrenador: ");
                scanner.nextLine();
    
                if (eleccion > 0 && eleccion <= entrenadores.size()) {
                    return entrenadores.get(eleccion - 1);
                } else {
                    System.out.println("Selección inválida.");
                }
            } 
        }
        return null;
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

    public static void eliminarIntegranteDeEquipo(int opcion) {
        if (opcion == 9 && existenJugadores()) {
            Jugador jugadorSeleccionado = (Jugador) seleccionarIntegranteDeEquipo(12);
            jugadores.remove(jugadorSeleccionado);
            System.out.println("Jugador eliminado.");
        } else if (opcion == 10 && existenEntrenadores()) {
            Entrenador entrenadorSeleccionado = (Entrenador) seleccionarIntegranteDeEquipo(opcion);
            entrenadores.remove(entrenadorSeleccionado);
            System.out.println("Entrenador eliminado.");
        }
    }

    public static void eliminarEquipo() {
        if (existenEquipos()) {
            Equipo equipoSeleccionado = seleccionarEquipo();
            equipos.remove(equipoSeleccionado);

            // Eliminar jugadores que pertenecen al equipo seleccionado
            jugadores.removeIf(jugador -> jugador.getEquipo() == equipoSeleccionado);
            
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

    public static void filtrarJugadoresPorEntrenador(Entrenador entrenadorSeleccionador) {
        for (Jugador jugador : jugadores) {
            if (jugador.getEquipo() == entrenadorSeleccionador.getEquipo()) {
                System.out.println(" - " + jugador.getNombre());
            }
        }
    }

    public static void gritarGol(Equipo equipoSeleccionado) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getEquipo() == equipoSeleccionado) {
                System.out.println(entrenador.gritarGol());
            }
        }

        for (Jugador jugador : jugadores) {
            if (jugador.getEquipo() == equipoSeleccionado) {
                System.out.println(jugador.gritarGol());
            }
        }
    }
}
