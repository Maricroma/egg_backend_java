public class Complementario1 {
    public static void main(String[] args) {
        int[] enteros = {45, 67, 4, 7, 8};
        int[] invertidos = new int[5];
        int j = enteros.length-1;

        for (int i = 0; i < invertidos.length; i++) {
            invertidos[i] = enteros[j];
            j--;
        }

        for (int i = 0; i < invertidos.length; i++) {
            System.out.println(invertidos[i]);
        }
        
    }
}
