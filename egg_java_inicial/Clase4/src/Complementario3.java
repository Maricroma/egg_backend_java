import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("Error: edad inválida");
        } else if (edad >= 65) {
            System.out.println("Eres un adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Eres un adulto");
        } else System.out.println("Eres menor de edad");

        sc.close();
    }
}
