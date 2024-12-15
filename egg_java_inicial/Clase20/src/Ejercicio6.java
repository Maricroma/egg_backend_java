import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña:");
        String clave = sc.nextLine();
        System.out.println(esSegura(clave)? "La clave es segura" : "La clave no es segura");
        sc.close();
    }

    public static Boolean tieneCaracterEspecial(String clave) {
        return clave.matches(".*[^a-zA-Z0-9\\s].*");
    }

    public static Boolean tieneNumero(String clave) {
        return clave.matches(".*\\d.*");
    }

    public static Boolean tieneMinuscula(String clave) {
        return clave.matches(".*[a-z].*");
    }

    public static Boolean tieneMayuscula(String clave) {
        return clave.matches(".*[A-Z].*");
    }

    public static Boolean tieneLongitudCorrecta(String clave) {
        return clave.length() >= 8;
    }

    public static Boolean esSegura(String clave) {
        return tieneCaracterEspecial(clave) && tieneLongitudCorrecta(clave) && tieneMayuscula(clave) && tieneMinuscula(clave) && tieneNumero(clave);
    }
}
