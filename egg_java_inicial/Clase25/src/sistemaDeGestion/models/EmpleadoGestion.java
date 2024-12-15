package sistemaDeGestion.models;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoGestion {
    private ArrayList<Empleado> empleados;
    private ArrayList<Empleado> empleadosFiltrados;
    private Scanner scanner;

    public EmpleadoGestion() {
        empleados = new ArrayList<>();
        empleadosFiltrados = new ArrayList<>(empleados); // Almacena la versión original
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("""
                    \n-- Menú de Gestión de Empleados --
                    1. Mostrar todos los empleados
                    2. Crear empleado
                    3. Filtrar empleados
                    4. Ordenar empleados
                    5. Incrementar salario
                    6. Limpiar filtros
                    7. Salir del programa""");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    mostrarTodosLosEmpleados();
                    break;
                case 2:
                    crearEmpleado();
                    break;
                case 3:
                    filtrarEmpleados();
                    mostrarEmpleadosFiltrados();
                    break;
                case 4:
                    ordenarEmpleados();
                    break;
                case 5:
                    incrementarSalario();
                    break;
                case 6:
                    limpiarFiltros();
                    mostrarEmpleadosFiltrados();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    private void mostrarTodosLosEmpleados() {
        if (empleados == null || empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar.");
            return;
        }
        // Imprimir los encabezados de la tabla
        // %-5s alinea la número de fila a la izquierda con un ancho de 5 caracteres.
        // %-15s alinea el nombre a la izquierda con un ancho de 15 caracteres.
        // %-5d alinea la edad a la izquierda con un ancho de 5 caracteres.
        // %-10s alinea el salario a la izquierda con un ancho de 10 caracteres.
        // %-15s alinea el departamento a la izquierda con un ancho de 15 caracteres.
        System.out.printf("%-5s %-15s %-5s %-10s %-15s\n", "N°", "Nombre", "Edad", "Salario", "Departamento");
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            // %-10.2f asegura que el salario tenga 2 decimales y 10 caracteres de ancho.
            System.out.printf("%-5d %-15s %-5d $%-10.2f %-15s\n", i + 1, empleado.getNombre(), empleado.getEdad(), empleado.getSalario(), empleado.getDepartamento());
        }
    }

    private void mostrarEmpleadosFiltrados() {
        if (empleadosFiltrados == null || empleadosFiltrados.isEmpty()) {
            System.out.println("No hay empleados para mostrar.");
            return;
        }
        System.out.printf("%-5s %-15s %-5s %-10s %-15s\n", "N°", "Nombre", "Edad", "Salario", "Departamento");
        for (int i = 0; i < empleadosFiltrados.size(); i++) {
            Empleado empleado = empleadosFiltrados.get(i);
            System.out.printf("%-5d %-15s %-5d $%-10.2f %-15s\n", i + 1, empleado.getNombre(), empleado.getEdad(), empleado.getSalario(), empleado.getDepartamento());
        }
    }

    private void crearEmpleado() {
        System.out.print("Ingrese nombre del empleado: ");
        String nombre = scanner.nextLine();
        if (buscarPorNombre(nombre) != null) {
            System.out.println("Error: Ya existe un empleado con ese nombre.");
            return;
        }
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese departamento: ");
        String departamento = scanner.nextLine();

        empleados.add(new Empleado(nombre, edad, salario, departamento));
        empleadosFiltrados = new ArrayList<>(empleados); // Actualizar la lista filtrada
        System.out.println("Empleado creado exitosamente.");
    }

    private void filtrarEmpleados() {
        System.out.print("Seleccione atributo para filtrar (nombre/edad/salario/departamento): ");
        String atributo = scanner.nextLine();
        ArrayList<Empleado> filtradosTemp = new ArrayList<>(empleadosFiltrados);

        switch (atributo) {
            case "nombre":
                System.out.print("Ingrese el nombre para filtrar: ");
                String nombreFiltro = scanner.nextLine();
                for (Empleado empleado : empleadosFiltrados) {
                    if (!(empleado.getNombre().equalsIgnoreCase(nombreFiltro))) {
                        filtradosTemp.remove(empleado);
                    }
                }
                break;
            case "edad":
                System.out.print("Ingrese edad mínima: ");
                int edadMin = scanner.nextInt();
                System.out.print("Ingrese edad máxima: ");
                int edadMax = scanner.nextInt();
                scanner.nextLine();
                for (Empleado empleado : empleadosFiltrados) {
                    if (empleado.getEdad() < edadMin || empleado.getEdad() > edadMax) {
                        filtradosTemp.remove(empleado);
                    }
                }
                break;
            case "salario":
                System.out.print("Ingrese salario mínimo: ");
                double salarioMin = scanner.nextDouble();
                System.out.print("Ingrese salario máximo: ");
                double salarioMax = scanner.nextDouble();
                scanner.nextLine();
                for (Empleado empleado : empleadosFiltrados) {
                    if (empleado.getSalario() < salarioMin || empleado.getSalario() > salarioMax) {
                        filtradosTemp.remove(empleado);
                    }
                }
                break;
            case "departamento":
                System.out.print("Ingrese departamento para filtrar: ");
                String deptoFiltro = scanner.nextLine();
                for (Empleado empleado : empleadosFiltrados) {
                    if (!(empleado.getDepartamento().equalsIgnoreCase(deptoFiltro))) {
                        filtradosTemp.remove(empleado);
                    }
                }
                break;
            default:
                System.out.println("Atributo no válido.");
                return;
        }
        empleadosFiltrados = filtradosTemp;
        System.out.println("Filtro aplicado.");
    }

    private void ordenarEmpleados() {
        System.out.print("Seleccione atributo para ordenar (nombre/edad/salario/departamento): ");
        String atributo = scanner.nextLine();

        for (int i = 0; i < empleados.size() - 1; i++) {
            for (int j = 0; j < empleados.size() - 1 - i; j++) {
                boolean intercambio = false;
                if (atributo.equals("nombre") && empleados.get(j).getNombre().compareToIgnoreCase(empleados.get(j + 1).getNombre()) > 0) {
                    intercambio = true;
                } else if (atributo.equals("edad") && empleados.get(j).getEdad() > empleados.get(j + 1).getEdad()) {
                    intercambio = true;
                } else if (atributo.equals("salario") && empleados.get(j).getSalario() > empleados.get(j + 1).getSalario()) {
                    intercambio = true;
                } else if (atributo.equals("departamento") && empleados.get(j).getDepartamento().compareToIgnoreCase(empleados.get(j + 1).getDepartamento()) > 0) {
                    intercambio = true;
                }
                if (intercambio) {
                    Empleado temp = empleados.get(j);
                    empleadosFiltrados.set(j, empleados.get(j + 1));
                    empleadosFiltrados.set(j + 1, temp);
                }
            }
        }
        System.out.println("Empleados ordenados por " + atributo + ".");
    }

    private void incrementarSalario() {
        System.out.print("Ingrese el nombre del empleado para aumentar salario: ");
        String nombre = scanner.nextLine();
        Empleado empleado = buscarPorNombre(nombre);
        if (empleado == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }
        System.out.print("Ingrese porcentaje de aumento: ");
        double porcentaje = scanner.nextDouble();
        scanner.nextLine();

        double salarioActual = empleado.getSalario();
        double incremento = salarioActual * (porcentaje / 100);
        empleado.setSalario(salarioActual + incremento);
        System.out.println("Salario incrementado exitosamente.");
    }

    private void limpiarFiltros() {
        empleadosFiltrados = new ArrayList<>(empleados);
        System.out.println("Filtros eliminados.");
    }

    private Empleado buscarPorNombre(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }
}
