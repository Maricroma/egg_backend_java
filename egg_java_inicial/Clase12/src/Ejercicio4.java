import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadDigitos = 0;

        System.out.println("Ingrese un número entero:");
        int numero = Math.abs(sc.nextInt());
        
        if (numero != 0) {
            while (numero > 0) {
                numero = (int) (numero / 10);
                cantidadDigitos++;
            }
        } else cantidadDigitos = 1;

        System.out.println("CANTIDAD DE DIGITOS: " + cantidadDigitos);
        sc.close();
    }
}
