import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int puntuacion = pedirNota();
        if (puntuacion < 0 || puntuacion > 100) {
            System.out.println("La puntuación ingresada no es válida. Debe estar entre 0 y 100.");
        } else {
            System.out.println("La calificación es: " + obtenerNota(puntuacion));
        }
        sc.close();
    }

    public static int pedirNota() {
        System.out.println("Ingrese la nota:");
        return sc.nextInt();
    }

    public static String obtenerNota(int notaNumero) {
        return switch (notaNumero / 10) {
            case 10, 9 -> "A"; // Para puntuaciones de 90 a 100
            case 8 -> "B";      // Para puntuaciones de 80 a 89
            case 7 -> "C";      // Para puntuaciones de 70 a 79
            case 6 -> "D";      // Para puntuaciones de 60 a 69
            default -> "F";     // Para puntuaciones menores a 60
        };
    }
}
