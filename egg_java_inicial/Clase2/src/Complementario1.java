import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        final int ANIO_ACTUAL = 2024;
        int anioNacimiento, calculoEdad;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese su año de nacimiento:");
        anioNacimiento = sc.nextInt();
        calculoEdad = ANIO_ACTUAL - anioNacimiento;
        System.out.println(String.format("%s", (calculoEdad>18? "Es mayor de edad" : "Es menor de edad")));

        sc.close();
    }
}
