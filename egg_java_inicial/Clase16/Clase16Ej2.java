package Clase16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase16Ej2 {
    public static void main(String[] args) {
        int valor = 0, valorSig = 1;
        Scanner sc = new Scanner(System.in);
        boolean error;

        do {
            error = false;
            try {
                System.out.println("Ingrese la posición:");
                int posicion = sc.nextInt();

                if (posicion < 0) {
                    System.out.println("Error: la posición no puede ser negativa.");
                    error = true;
                } else if (posicion == 0) {
                    System.out.println("Posición 0: " + valor);
                } else if (posicion == 1 || posicion == 2) {
                    System.out.println("Posición " + posicion + ": " + valorSig);
                } else {
                    int valorActual = 0;
                    valor = 1;
                    for (int i = 3; i <= posicion; i++) {
                        valorActual = valor + valorSig;
                        valor = valorSig;
                        valorSig = valorActual;
                    }
                    System.out.println("Posición " + posicion + ": " + valorActual);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: valor inválido ingresado.");
                error = true;
            } catch (Exception e) {
                System.out.println("Error: algo salió mal.");
                error = true;
            }
        } while (error);
        sc.close();
    }
}

// CONSIGNA
// Serie Fibonacci mejorada
// En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.

// Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:

// Posición 0: 0

// Posición 1: 1

// Posición 2: 1

// Posición 3: 2

// Posición 4: 3

// Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de Fibonacci para cualquier posición ingresada por el usuario. Este ejercicio te ayudará a consolidar tu comprensión sobre cómo generar y trabajar con la serie de Fibonacci.