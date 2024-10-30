package Clase7;

import java.util.Scanner;

public class Clase7Comp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //4. Calculando la Longitud de Cadenas sin Espacios
        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();

        System.out.println("Longitud sin espacios: " + palabra.replaceAll("\\s+", "").length());
        
        sc.close();
    }
}

// CONSIGNA
// Calculando la Longitud de Cadenas sin Espacios:
// En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, pero esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará el método length() de la clase String y se realizará un proceso adicional para excluir los espacios de la cuenta.