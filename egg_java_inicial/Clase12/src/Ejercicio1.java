import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String opcion = "";
        Scanner sc = new Scanner(System.in);
        
        while (!opcion.equals("5")) {
            System.out.println("""

                1) Comprar producto.
                2) Realizar devolución.
                3) Ver mis pedidos.
                4) Preguntas frecuentes.
                5) Salir.
                Ingrese la opción elegida:""");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Eligió comprar un producto");
                    break;
                case "2":
                    System.out.println("Eligió realizar una devolución");
                    break;
                case "3":
                    System.out.println("Eligió ver pedidos");
                    break;
                case "4":
                    System.out.println("Eligió preguntas frecuentes");
                    break;
                case "5":
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
                    break;
            }
        }
        sc.close();
    }
}
