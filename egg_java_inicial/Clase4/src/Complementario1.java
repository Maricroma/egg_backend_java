import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        String password = "Cris123", response;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la contraseña:");
        response = sc.nextLine();

        if (response.equals(password)) {
            System.out.println("Acceso concedido");
        } else System.out.println("Acceso denegado");

        sc.close();
    }
}
