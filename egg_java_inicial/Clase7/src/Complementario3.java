import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Ingrese otra palabra:");
        String otraPalabra = sc.nextLine();

        System.out.println(palabra.equals(otraPalabra)? "Las palabras son iguales":"Las palabras no son iguales");
        
        sc.close();
    }
}
