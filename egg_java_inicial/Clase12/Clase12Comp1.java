package Clase12;

import java.util.Scanner;

public class Clase12Comp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAMultiplicar;

        do {
            System.out.println("Ingrese un número para ver su tabla (0 para salir):");
            numeroAMultiplicar = sc.nextInt();
            int cont = 1;
            while (numeroAMultiplicar != 0 && cont < 11) {
                System.out.println(numeroAMultiplicar + " x " + cont + " = " + (numeroAMultiplicar*cont));
                cont++;
            }           
        } while (numeroAMultiplicar != 0);

        sc.close();
    }
}

// CONSIGNA
// Tabla de multiplicar

// Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar de ese número utilizando un bucle while. El programa debe seguir solicitando números hasta que el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.

