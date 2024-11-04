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
