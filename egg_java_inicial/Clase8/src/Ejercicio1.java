import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = sc.nextInt();

        //Actividad: Calculando el valor absoluto
        System.out.println("Valor absoluto: " + Math.abs(numero));

        //Actividad: Redondeo de números
        System.out.println("Ingrese un número decimal:");
        double numero2 = sc.nextDouble();

        System.out.println("Redondeo: " + Math.round(numero2));

        //Actividad: Generando números aleatorios
        //rango del 1 al 355
        System.out.println("Número aleatorio: " + (int) Math.floor(Math.random()*355)+1);
        // Math.random() genera un numero entre 0 y 1
        // Math.random() * 355 multiplica el valor para obtener un numero entre 0 y 354.9999
        // Math.floor() redondea hacia abajo el numero para obtener un valor entre 0 y 354
        // + 1 se asegura que el rango final sea entre 1 y 355
        sc.close();
    }
}
