package Clase12;

import java.util.Scanner;

public class Clase12Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "secreto";
        String claveIngresada = "";

        do {
            System.out.println("Ingrese una contraseña:");
            claveIngresada = sc.nextLine();
            if (!claveCorrecta.equals(claveIngresada)) {
                System.out.println("Error en la contraseña ingresada. Intente nuevamente.");
            }
        } while (!claveCorrecta.equals(claveIngresada));
        System.out.println("Ingreso exitoso");
        sc.close();
    }
}

// CONSIGNA
// Validación de contraseña
// Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.