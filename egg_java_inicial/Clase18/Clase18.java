package Clase18;

import java.util.Scanner;

public class Clase18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[20];
        Double[] notas = new Double[20];
        String opcion;
        int posicion = 0;

        do {
            System.out.print("""
            \n--- Menú ---
            1) Registrar alumno
            2) Mostrar todos los alumnos
            3) Mostrar promedio de notas
            4) Buscar alumno por nombre
            5) Modificar nota por nombre
            6) Eliminar alumno por nombre
            7) Salir
            Elija una opción: 
                """);
            opcion = sc.nextLine();
            String nombreBuscado;
            boolean encontrado = false;

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombres[posicion] = sc.nextLine();
                    System.out.print("Ingrese la nota del alumno: ");
                    notas[posicion] = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Datos guardados.");
                    posicion++;
                    break;
                case "2":
                    if (posicion == 0) {
                        System.out.println("No hay alumnos guardados.");
                    } else {
                        System.out.println("Lista de alumnos:");
                        for (int i = 0; i < posicion; i++) {
                            System.out.println(" - " + nombres[i]);
                        }
                    }
                    break;
                case "3":
                    if (posicion == 0) {
                        System.out.println("No hay notas guardadas.");
                    } else {
                        double promedio = 0;
                        for (int i = 0; i < posicion; i++) {
                            promedio += notas[i];
                        }
                        System.out.printf("El promedio de las notas es: %.2f%n", (promedio/posicion));
                    }
                    break;
                case "4":
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombreBuscado = sc.nextLine();
                    for (int i = 0; i < posicion; i++) {
                        if (nombreBuscado.equals(nombres[i])) {
                            System.out.println("Alumno: " + nombres[i]);
                            System.out.println("Nota: " + notas[i]);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                       System.out.println("Alumno no encontrado."); 
                    }
                    break;
                case "5":
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombreBuscado = sc.nextLine();
                    for (int i = 0; i < posicion; i++) {
                        if (nombreBuscado.equals(nombres[i])) {
                            System.out.print("Ingrese la nueva nota: ");
                            notas[i] = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Nota actualizada.");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado."); 
                    }
                    break;
                case "6":
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombreBuscado = sc.nextLine();
                    for (int i = 0; i < posicion; i++) {
                        if (nombreBuscado.equals(nombres[i])) {
                            for (int j = i; j < posicion - 1; j++) { // Mover elementos para eliminar
                                nombres[j] = nombres[j + 1];
                                notas[j] = notas[j + 1];
                            }
                            nombres[posicion - 1] = null;  // Limpiar último elemento
                            notas[posicion - 1] = null;
                            posicion--;
                            encontrado = true;
                            System.out.println("Alumno eliminado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado."); 
                    }
                    break;
                case "7":
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        } while (!opcion.equals("7"));
        sc.close();
    }
}

// CONSIGNA
// Actividad: Registro de alumnos
// Escribe un programa en Java que permita al usuario llevar un registro de alumnos.

// El programa debe cumplir con los siguientes requisitos:

// Muestra un menú de opciones al usuario donde podrá:

// Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota.

// Mostrar todos los alumnos: Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta el momento.

// Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.

// Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su nota si el alumno existe.

// Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su nota si el alumno existe.

// Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.

// Salir: Terminar el programa.

// El programa debe validar que el nombre no esté vacío y que la nota sea un número válido entre 0.00 y 10.00.

// El programa debe utilizar las estructuras de control adecuadas (if, switch, for, while, do-while) según corresponda para implementar las diferentes opciones del menú.

// El programa debe manejar excepciones utilizando bloques try-catch para manejar posibles excepciones al leer datos de entrada del usuario.

// Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción hasta que elija la opción "Salir".