public class Complementario2 {
    public static void main(String[] args) {
        int[] enteros = {5, 6, 4, 7, 8};
        int suma = 0;

        for (int i = 0; i < enteros.length; i++) {
            suma += enteros[i];
            enteros[i] = suma;
            //array[i]= array[i-1] + array[i];
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }
    }
}
