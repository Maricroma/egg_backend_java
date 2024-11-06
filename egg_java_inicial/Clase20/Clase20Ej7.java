package Clase20;

import java.util.Random;
import java.util.Scanner;

public class Clase20Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMinimo = 1;
        int numeroMaximo = 20;
        int num;
        
        int numeroAleatorio = numeroAleatorio(numeroMinimo, numeroMaximo);
        //System.out.println(numeroAleatorio);
        
        do {
            System.out.println("Intenta adivinar el número:");
            num = sc.nextInt();
            if (num > numeroAleatorio) {
                System.out.println("Intenta con un número más bajo.");
            } else if (num < numeroAleatorio) {
                System.out.println("Intenta con un número más alto.");
            } else System.out.println("¡Acertaste!");
        } while (num != numeroAleatorio);
        sc.close();
    }

    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

// CONSIGNA
// Adivinar el número: Basándose en el ejercicio que ya has realizado, crea un método "numeroAleatorio()" que reciba por parámetro dos variables de tipo "int": un número máximo y un número mínimo. El método debe generar y devolver un número aleatorio dentro del rango especificado.
