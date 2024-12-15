public class Ejercicio1 {
    public static void main(String[] args) {
        int[] array = { 4, 5, 6, 7, 7, 8, 0 };
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i]; 
        }

        System.out.println("La suma de los valores es " + suma);
    }
}
