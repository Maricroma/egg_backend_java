import java.util.Random;
import java.util.Scanner;

public class Complementario {
    private static final String[] PALABRAS = {"casa", "perro", "auto", "gato", "montaña", "nieve", "playa", "rio"};
    private static final int INTENTOS_MAXIMOS = 6;
    
    public static void main(String[] args) {
        String palabra = seleccionarPalabra();
        String pista = generarPista(palabra.length());
        int intentos = 0;
        boolean adivinada = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Adivinar Palabra!");
        System.out.println("Intenta adivinar la palabra. Tienes " + INTENTOS_MAXIMOS + " intentos.");
        System.out.println("Pista: " + pista);

        while (intentos < INTENTOS_MAXIMOS && !adivinada) {
            System.out.print("Intenta adivinar la palabra: ");
            String intento = scanner.nextLine().toLowerCase();

            if (intento.equals(palabra)) {
                adivinada = true;
                break;
            } else {
                System.out.println("¡Incorrecto! Esa no es la palabra.");
                pista = actualizarPista(intento, palabra, pista);
                System.out.println("Pista actualizada: " + pista);
            }

            intentos++;
        }

        if (adivinada) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + palabra);
        } else {
            System.out.println("Lo siento, has agotado los intentos. La palabra era: " + palabra);
        }

        scanner.close();
    }

    private static String seleccionarPalabra() {
        Random random = new Random();
        int indice = random.nextInt(PALABRAS.length);
        return PALABRAS[indice];
    }

    private static String generarPista(int longitud) {
        return "_ ".repeat(longitud).trim();
    }

    private static String actualizarPista(String intento, String palabra, String pistaActual) {
        StringBuilder nuevaPista = new StringBuilder(pistaActual);

        for (int i = 0; i < palabra.length(); i++) {
            if (i < intento.length() && palabra.charAt(i) == intento.charAt(i)) {
                nuevaPista.setCharAt(i * 2, palabra.charAt(i)); // i * 2 para alinear con los espacios en la pista
            }
        }
        return nuevaPista.toString();
    }
    
}
