import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Ingrese un caracter:");
        String caracter = sc.nextLine();

        System.out.println(palabra.indexOf(caracter)!= -1? "El caracter se encuentra":"El caracter no se encuentra");

        System.out.println("Minusculas: " + palabra.toLowerCase());
        System.out.println("Mayusculas: " + palabra.toUpperCase());

        sc.close();
    }
}
