public class Complementario1 {
    public static void main(String[] args) {
        int[] numeros = {34, 56, 4, 6, 55, 23};
        int contadorPares = 0;

        if (numeros[0] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[1] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[2] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[3] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[4] % 2 == 0) {
            contadorPares++;
        }
        if (numeros[5] % 2 == 0) {
            contadorPares++;
        }
        System.out.println("Cantidad de pares: " + contadorPares);

    }
}
