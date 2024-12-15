import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Actividad: Calculando la potencia
        System.out.println("Ingrese la base:");
        int base = sc.nextInt();
        System.out.println("Ingrese la potencia:");
        int potencia = sc.nextInt();

        System.out.println("El número " + base + " elevado a " + potencia + " es: " + Math.pow(base, potencia));

        //Actividad: Calculando la raíz cuadrada
        System.out.println("Ingrese un número positivo:");
        int numero = sc.nextInt();
        System.out.println(numero < 0? "El número debe ser positivo" : "La raíz cuadrada de " + numero + " es: " + Math.sqrt(numero));

        sc.close();
    }
}
