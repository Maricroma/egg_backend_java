package Clase14;

import java.util.Scanner;

public class Clase14Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = sc.nextLine();

        boolean soloLetras = true;

        for (int i = 0; i < cadena.length(); i++) {
            Character caracter = cadena.charAt(i);  // Obtener el carácter en la posición i
            if (!Character.isLetter(caracter)) {
                soloLetras = false;
                break;
            }
        }

        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }
        sc.close();
    }
}

// CONSIGNA
// Verificando si una cadena contiene solo letras
// Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.