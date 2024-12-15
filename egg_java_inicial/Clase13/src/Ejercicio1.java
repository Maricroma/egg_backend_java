import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Actividad: Ordenar en forma descendente
        int[] enteros = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println(Arrays.toString(enteros));

        // Ordenar el array en forma ascendente
        Arrays.sort(enteros);

        // Invertir el array para obtener el orden descendente
        for (int i = 0; i < enteros.length / 2; i++) { //recorro hasta la mitad
            int temp = enteros[i]; 
            enteros[i] = enteros[enteros.length - 1 - i]; //recorro de atras para adelante
            enteros[enteros.length - 1 - i] = temp;
        }

        // Imprimir el array ordenado
        System.out.println("Array ordenado en forma descendente: " + Arrays.toString(enteros));

        // Actividad: Búsqueda binaria
        Arrays.sort(enteros);

        try {
            System.out.println("Indique el número entero a buscar:");
            int enteroBuscado = sc.nextInt();
            int indice = Arrays.binarySearch(enteros,enteroBuscado);
            if (indice>=0) {
                System.out.println("El índice es: " + indice);
            } else {
                System.out.println("El entero ingresado no se encuentra en el arreglo."); 
            }
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero.");
        } catch (Exception e) {
            System.out.println("Error.");
        }

        //Actividad: Comparando arreglos
        int[] numeros = {45, 56, 66, 55, 66, 78};
        //int[] numeros = Arrays.copyOf(enteros, enteros.length);
        System.out.println("ARREGLO 2: " + Arrays.toString(numeros));
        System.out.println(Arrays.equals(numeros, enteros)? "Los arreglos son iguales" : "Los arreglos son distintos");
        sc.close();
    }
}
