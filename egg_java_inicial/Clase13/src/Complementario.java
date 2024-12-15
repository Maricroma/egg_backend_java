import java.util.Arrays;
import java.util.Scanner;

public class Complementario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud, relleno, indiceFinal, indiceInicial = 0;

        System.out.println("Indique la cantidad de elementos del arreglo: ");
        longitud = sc.nextInt();
        int[] enteros = new int[longitud];
        do {
            System.out.println("Indique el número para llenarlo: ");
            relleno = sc.nextInt();
            do {
                System.out.println("Indique el índice hasta el cual quiere rellenar el array con el número anterior (0-" + (enteros.length-1)+ "):");
                indiceFinal = sc.nextInt();
                if (indiceFinal >= enteros.length) {
                    System.out.println("El índice debe ser menor que el tamaño total del arreglo");
                }
            } while (indiceFinal >= enteros.length);
            
            // Llenar el arreglo desde la posición 0 hasta hastaPosicion (exclusivo)
            Arrays.fill(enteros, indiceInicial, indiceFinal+1, relleno);
            indiceInicial = indiceFinal + 1;

            // Mostrar el arreglo
            System.out.println(Arrays.toString(enteros));
        } while (indiceFinal < enteros.length-1);
        sc.close();
    }
}
