public class Ejercicio4 {
    public static void main(String[] args) {
        int[] enteros = new int[10];
        int pares = 0;

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 100);
        }

        for (int entero : enteros) {
            System.out.print(entero + " ");
            if (entero % 2 == 0) {
                pares ++;
            }
        }

        System.out.println("\nCantidad de pares: " + pares);
    }
}
