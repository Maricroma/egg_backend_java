import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double califNumerica;
        String califLetra = "";
        boolean esValido = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificación (0-100):");
        califNumerica = sc.nextDouble();

        if (califNumerica > 100 || califNumerica < 0) {
            System.out.println("Calificación inválida.");
            esValido = false;
        } else if (califNumerica >= 90) {
            califLetra = "A";
        } else if (califNumerica >= 80) {
            califLetra = "B";
        } else if (califNumerica >= 70) {
            califLetra = "C";
        } else if (califNumerica >= 60) {
            califLetra = "D";
        } else califLetra = "F";

        if (esValido) {
            System.out.println("Calificación correspondiente: " + califLetra);
        }
        sc.close();
    }
}
