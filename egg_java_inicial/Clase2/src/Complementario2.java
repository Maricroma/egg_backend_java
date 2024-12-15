import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        double baseRectangulo , alturaRectangulo, perimetro, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo:");
        baseRectangulo = sc.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        alturaRectangulo = sc.nextDouble();
        perimetro = 2*baseRectangulo + 2*alturaRectangulo;
        System.out.println("El perímetro es: " + perimetro);
        area = baseRectangulo * alturaRectangulo;
        System.out.println("El área es: " + area);

        sc.close();
    }
}
