import java.util.Scanner;

public class Ejercicio2 {
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
