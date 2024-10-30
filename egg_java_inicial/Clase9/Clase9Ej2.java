package Clase9;

import java.util.Scanner;

public class Clase9Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        boolean tieneLongitudSuficiente = contrasena.length() >= 8;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;
        
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

        // Verificar cada carácter de la contraseña
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (caracteresEspeciales.contains(String.valueOf(c))) {
                tieneCaracterEspecial = true;
            }
        }

        // Verificar si cumple con todos los criterios
        if (tieneLongitudSuficiente && tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los criterios de seguridad.");
        }

        scanner.close();
    }
}

// CONSIGNA
// Validación de contraseña
// Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:

// La contraseña debe tener al menos 8 caracteres.

// La contraseña debe contener al menos una letra mayúscula y una letra minúscula.

// La contraseña debe contener al menos un número.

// La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).

// El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.