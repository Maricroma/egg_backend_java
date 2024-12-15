import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase con espacios al principio y al final:");
        String frase = sc.nextLine();
        System.out.println("Frase sin espacios: " + frase.trim());
        sc.close();
        
    }
}
