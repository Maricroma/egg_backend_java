public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numeros = {34, 55, 4, 6};
        int total = 0;

        total = numeros[0] + numeros[1] + numeros[2] + numeros[3];

        System.out.println("PROMEDIO: " + (double) total/numeros.length);
    }
}
