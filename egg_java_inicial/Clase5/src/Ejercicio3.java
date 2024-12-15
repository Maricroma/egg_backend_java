import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Menú:
                1) Guardar
                2) Cargar
                3) Salir
                Por favor, ingrese el número correspondiente a la opción elegida: 
                """);
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Guardar");
            case 2 -> System.out.println("Cargar");
            case 3 -> System.out.println("Salir");
            default -> System.out.println("Error: opción inválida.");
        }
        sc.close();
    }
}
