import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        int num, suma = 0;

        do {
            System.out.println("Ingrese un número positivo: ");
            num = sc.nextInt();
            suma += num;
            System.out.println("¿Desea ingresar otro número? (s/n):");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("SUMA ACUMULADA: " + suma);
        sc.close();
    }
}
