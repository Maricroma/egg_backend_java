import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        Integer numero = sc.nextInt();

        String cadena = Integer.toString(numero);

        int cantDigitos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            Character caracter = cadena.charAt(i);  // Obtener el carácter en la posición i
            if (Character.isDigit(caracter)) {
                cantDigitos++;
            }
        }
        System.out.println("CANTIDAD DE DIGITOS: " + cantDigitos);
        sc.close();
    }
}
