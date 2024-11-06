package Clase20;

public class Clase20Ej4 {
    public static void main(String[] args) {
        int[] numeros = {34, 3, 33, 7, 66, 76, 55};
        String[] nombres = {"Laura", "Maria", "José", "Facundo", "Sofía"};
        int[][] matrizNumeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        String[][] matrizNombres = {
            {"Ana", "Carlos", "César"},
            {"Sonia", "Analia", "Néstor"},
            {"Lucia", "Ernesto", "Victoria"}
        };
        imprimirArray(numeros);
        imprimirArray(nombres);
        imprimirArray(matrizNumeros);
        imprimirArray(matrizNombres);

    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// CONSIGNA
// Imprimir array: Crea un programa que utilice un método "imprimirArray(int[] array)" que se encargue de imprimir un array por consola. El método debe recibir como parámetro un arreglo de tipo "int" y no devolver nada. Luego, crea una sobrecarga del método para que acepte arrays de tipo String y arreglos bidimensionales de tipo "int" y de tipo "String".

