import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        System.out.println("Ingrese el primer caracter:");
        String car1 = sc.nextLine();
        System.out.println("Ingrese el segundo caracter:");
        String car2 = sc.nextLine();
        
        System.out.println("Frase convertida: " + frase.replace(car1, car2));
        sc.close();
    }
}
