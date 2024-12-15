import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        numero2 = sc.nextInt();

        double resultado = 0;

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número de la operación: ");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();
    }
}
