package Clase5;

import java.util.Scanner;

public class Clase5Ej3 {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Menú:
                1) Guardar
                2) Cargar
                3) Salir
                Por favor, ingrese el número correspondiente a la opción elegida: 
                """);
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Guardar");
            case 2 -> System.out.println("Cargar");
            case 3 -> System.out.println("Salir");
            default -> System.out.println("Error: opción inválida.");
        }
        sc.close();
    }
}

// CONSIGNA
// Selección de Opción
// En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:

// Opción 1: "Guardar"

// Opción 2: "Cargar"

// Opción 3: "Salir"

// El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 

// Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada.