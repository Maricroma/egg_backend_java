import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[4]; 

        System.out.println("Ingrese 4 nombres:");
        nombres[0] = sc.nextLine();
        nombres[1] = sc.nextLine();
        nombres[2] = sc.nextLine(); 
        nombres[3] = sc.nextLine();

        // Comparaciones manuales e intercambios
        // Comparar nombres[0] con nombres[1], [2], [3] y realizar los intercambios
        if (nombres[0].compareToIgnoreCase(nombres[1]) > 0) {
            intercambiar(nombres, 0, 1);
        }
        if (nombres[0].compareToIgnoreCase(nombres[2]) > 0) {
            intercambiar(nombres, 0, 2);
        }
        if (nombres[0].compareToIgnoreCase(nombres[3]) > 0) {
            intercambiar(nombres, 0, 3);
        }

        // Comparar nombres[1] con nombres[2], [3]
        if (nombres[1].compareToIgnoreCase(nombres[2]) > 0) {
            intercambiar(nombres, 1, 2);
        }
        if (nombres[1].compareToIgnoreCase(nombres[3]) > 0) {
            intercambiar(nombres, 1, 3);
        }

        // Comparar nombres[2] con nombres[3]
        if (nombres[2].compareToIgnoreCase(nombres[3]) > 0) {
            intercambiar(nombres, 2, 3);
        }

        // Imprimir los nombres ordenados
        System.out.println("Nombres ordenados alfabéticamente:");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        sc.close();
    }

    // Método para intercambiar dos elementos del array
    public static void intercambiar(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
