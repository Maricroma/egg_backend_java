import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Cantidad de caracteres: " + palabra.length()); //LONGITUD

        System.out.println("Ingrese otra palabra:");
        String otraPalabra = sc.nextLine();
        System.out.println("Concatenadas: " + palabra.concat(otraPalabra)); //CONCATENAR

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        System.out.println("Ingrese el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Subcadena: " + frase.substring(num1, num2)); //SUBCADENA

        sc.close();
    }
}
