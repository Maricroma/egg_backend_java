package Clase12;

import java.util.Scanner;

public class Clase12Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadDigitos = 0;

        System.out.println("Ingrese un número entero:");
        int numero = Math.abs(sc.nextInt());
        
        if (numero != 0) {
            while (numero > 0) {
                numero = (int) (numero / 10);
                cantidadDigitos++;
            }
        } else cantidadDigitos = 1;

        System.out.println("CANTIDAD DE DIGITOS: " + cantidadDigitos);
        sc.close();
    }
}

// CONSIGNA
// Número de dígitos
// Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras de números negativos.


