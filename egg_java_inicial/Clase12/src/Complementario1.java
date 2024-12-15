import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAMultiplicar;

        do {
            System.out.println("Ingrese un número para ver su tabla (0 para salir):");
            numeroAMultiplicar = sc.nextInt();
            int cont = 1;
            while (numeroAMultiplicar != 0 && cont < 11) {
                System.out.println(numeroAMultiplicar + " x " + cont + " = " + (numeroAMultiplicar*cont));
                cont++;
            }           
        } while (numeroAMultiplicar != 0);

        sc.close();
    }
}
