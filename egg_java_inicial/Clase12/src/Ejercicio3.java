import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "secreto";
        String claveIngresada = "";

        do {
            System.out.println("Ingrese una contraseña:");
            claveIngresada = sc.nextLine();
            if (!claveCorrecta.equals(claveIngresada)) {
                System.out.println("Error en la contraseña ingresada. Intente nuevamente.");
            }
        } while (!claveCorrecta.equals(claveIngresada));
        System.out.println("Ingreso exitoso");
        sc.close();
    }
}
