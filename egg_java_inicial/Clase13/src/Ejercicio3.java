import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Actividad: Rellenando un arreglo
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la cantidad de elementos del arreglo: ");
        int longitud = sc.nextInt();
        System.out.println("Indique el número para llenarlo: ");
        int relleno = sc.nextInt();

        int[] enteros = new int[longitud];
        
        Arrays.fill(enteros, relleno); 
        System.out.println(Arrays.toString(enteros));
        sc.close();
    }
}
