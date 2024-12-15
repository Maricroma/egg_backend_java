import java.util.Scanner;

public class Complementario4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //4. Calculando la Longitud de Cadenas sin Espacios
        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();

        System.out.println("Longitud sin espacios: " + palabra.replaceAll("\\s+", "").length());
        
        sc.close();
    }
}
