package Clase12;

import java.util.Scanner;

public class Clase12Ej2 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 20) + 1;
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println(numeroAleatorio);

        do {
            System.out.println("Intente adivinar el número:");
            numero = sc.nextInt();
            if (numero < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor.");
            } else if (numero > numeroAleatorio) {
                System.out.println("El número que ingresaste es mayor.");
            } else System.out.println("Acertaste!");
        } while (numero != numeroAleatorio);
        sc.close();
    }
}

// CONSIGNA
// Adivinando un número 
// Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente.