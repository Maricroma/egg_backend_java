package Clase21;

import java.util.Scanner;

public class Clase21Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición para ver el número de la secuencia Fibonacci: ");
        int num = sc.nextInt(); 
        System.out.println("Posición " + num + ": " + calcularFibonacci(0, 1, num, 0));
        sc.close();
    }

    public static int calcularFibonacci(int valor, int valorSig, int num, int contador) {
        if (contador == num) {
            return valor;
        }
        //System.out.println(valorSig + ", " + (valor+valorSig));
        return calcularFibonacci(valorSig, valor + valorSig, num, contador + 1);
    }
}

// CONSIGNA
// Fibonacci y Recursividad
// En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.

// Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:

// - Posición 0: 0

// - Posición 1: 1

// - Posición 2: 1

// - Posición 3: 2

// - Posición 4: 3

// Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de Fibonacci para cualquier posición ingresada por el usuario