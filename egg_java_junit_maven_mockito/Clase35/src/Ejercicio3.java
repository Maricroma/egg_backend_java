import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = pedirNombre(sc);
        int edad = pedirEdad(sc);
        sc.close();
        System.out.println(crearMensaje(nombre, edad));
        
    }

    public static String pedirNombre(Scanner sc) {
        System.out.print("Ingrese su nombre: ");
        return sc.nextLine();
    }

    public static int pedirEdad(Scanner sc) {
        System.out.print("Ingrese su edad: ");
        return sc.nextInt();
    }

    public static String crearMensaje(String nombre, int edad) {
        return "Me llamo " + nombre + " y tengo " + edad + " años.";
    }
}
