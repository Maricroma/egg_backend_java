import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        double precio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio:");
        precio = sc.nextDouble();

        if (precio >= 100) {
            precio -= precio * 0.10;
            System.out.println("Precio con descuento del 10% $" + precio);
        } else System.out.println("Precio $" + precio);

        sc.close();
    }
}
