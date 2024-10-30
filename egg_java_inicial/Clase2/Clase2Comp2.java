package Clase2;
import java.util.Scanner;

public class Clase2Comp2 {
    
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

//CONSIGNA:
// Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.

// Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.

// Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.

// Muestra el resultado del perímetro por consola junto con un mensaje adecuado.

// Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.

// Muestra el resultado del área por consola junto con un mensaje adecuado.