public class Ejercicio2 {
    public static void main(String[] args) {
        int[] enteros = {45, 67, 4, 7, 8};
        int min = enteros[0];

        for (int i = 1; i < enteros.length; i++) {
            if (enteros[i] < min) {
                min = enteros[i];
            }
        }
        System.out.println("MINIMO: " + min);
    }
}
