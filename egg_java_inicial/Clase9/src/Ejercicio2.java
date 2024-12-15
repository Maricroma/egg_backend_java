import java.util.Scanner;

public class Ejercicio2 {
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
