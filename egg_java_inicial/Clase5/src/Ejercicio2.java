import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una nota del 1 al 5:");
        nota = sc.nextInt();

        switch (nota) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Error: Nota inválida");
        }
        sc.close();
    }
}
