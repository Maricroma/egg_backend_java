import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el límite inferior y superior
        System.out.println("Ingrese el límite inferior:");
        int limiteInferior = sc.nextInt();

        System.out.println("Ingrese el límite superior:");
        int limiteSuperior = sc.nextInt();

        // Validar que el límite inferior sea menor o igual que el límite superior
        if (limiteInferior > limiteSuperior) {
            System.out.println("El límite inferior debe ser menor o igual que el límite superior.");
        } else {
            // Generar un número aleatorio en el rango [limiteInferior, limiteSuperior]
            int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;

            // Mostrar el número aleatorio generado
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
        }

        sc.close();
    }
}
