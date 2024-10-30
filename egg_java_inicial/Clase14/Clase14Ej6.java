package Clase14;

import java.util.Scanner;

public class Clase14Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        Integer numero = sc.nextInt();

        String cadena = Integer.toString(numero);

        int cantDigitos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            Character caracter = cadena.charAt(i);  // Obtener el carácter en la posición i
            if (Character.isDigit(caracter)) {
                cantDigitos++;
            }
        }
        System.out.println("CANTIDAD DE DIGITOS: " + cantDigitos);
        sc.close();
    }
}

// CONSIGNA
// Contando los dígitos en un número
// Pídele al usuario que introduzca un número. Convierte el número en una cadena y luego utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.