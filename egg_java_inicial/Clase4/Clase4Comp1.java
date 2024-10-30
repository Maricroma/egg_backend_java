package Clase4;
import java.util.Scanner;

public class Clase4Comp1 {
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

//CONSIGNA:
// Verificación de Contraseña:

// En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado".