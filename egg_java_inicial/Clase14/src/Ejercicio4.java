import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = sc.nextLine();

        int cantEspaciosEnBlanco = 0;

        for (int i = 0; i < cadena.length(); i++) {
            Character caracter = cadena.charAt(i);  // Obtener el carácter en la posición i
            if (Character.isWhitespace(caracter)) {
                cantEspaciosEnBlanco++;
            }
        }
        System.out.println("CANTIDAD DE ESPACIOS EN BLANCO: " + cantEspaciosEnBlanco);
        sc.close();
    }
}
