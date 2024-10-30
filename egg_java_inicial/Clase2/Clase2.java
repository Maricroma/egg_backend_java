package Clase2;
import java.util.Scanner;

public class Clase2 {
    
public static void main(String[] args) {
    // String nombreUsuario;
    // int edad;
    Scanner sc = new Scanner(System.in);

    // System.out.println("Ingrese su nombre de usuario:");
    // nombreUsuario = sc.nextLine();

    // System.out.println("Ingrese su edad:");
    // edad = sc.nextInt();
    // System.out.println(String.format("Su nombre es %s y su edad es %d", nombreUsuario, edad));


    int num1 = 50, num2 = 5;

    System.out.println("\nLa suma de las 2 variables es: " + (num1+num2));
    System.out.println("La resta de las 2 variables es: " + (num1-num2));
    System.out.println("La multiplicación de las 2 variables es: " + (num1*num2));
    System.out.println("La división de las 2 variables es: " + (num1/num2));
    System.out.println("El módulo de la división de las 2 variables es: " + (num1%num2));

    int num3, num4, num5, num6;

    System.out.println("Ingrese el primer número:");
    num3 = sc.nextInt();
    System.out.println("Ingrese el segundo número:");
    num4 = sc.nextInt();

    System.out.println("El número " + num3 + " es mayor a " + num4 + "? = " + (num3>num4));
    System.out.println("El número " + num3 + " es distinto a " + num4 + "? = " + (num3!=num4));
    System.out.println("El número " + num3 + " es divisible por 2? = " + (num3%2==0));

    System.out.println("Ingrese el tercer número:");
    num5 = sc.nextInt();
    System.out.println("Ingrese el cuarto número:");
    num6 = sc.nextInt();

    System.out.println("""
        El número %d es mayor al número %d y el número %d es mayor al número %d? = %b
        """.formatted(num3, num4, num5, num6, (num3>num4 && num5>num6)));

    System.out.println("""
        El número %d es mayor al número %d o el número %d es mayor al número %d? = %b
        """.formatted(num3, num4, num5, num6, (num3>num4 || num5>num6)));

    sc.close();
}
    
}

//CONSIGNA:
// 1)
// Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola.
// Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
// Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.

// 2)
// Declara dos variables, y asígnales un valor a cada una de ellas.
// Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;
// Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola.

// 3)
// 1. Pide al usuario que ingrese dos números, y:
// A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado.
// B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
// C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
// 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
// A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
// B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.