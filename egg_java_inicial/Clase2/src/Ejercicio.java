import java.util.Scanner;

public class Ejercicio {
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
