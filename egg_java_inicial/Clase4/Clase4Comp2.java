package Clase4;
import java.util.Scanner;

public class Clase4Comp2 {
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

//CONSIGNA
// Cálculo de Descuento:

// En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio original sin descuento.