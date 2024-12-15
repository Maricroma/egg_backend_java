package principal;

public class MiPrimerPrograma {

    public static void main(String[] args) {
        //Declaracion de variables y entrada y salida de datos por consola
        boolean estaConectado = false;
        char letra = 'a';
        String nombre = "Cristina";
        int edad = 35;
        //long numero = 33545;
        float decimal = 34.56f;
        System.out.println("Imprimo tres variables: " + decimal + " - " + letra + " - " + estaConectado);
        System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");

        // COMPLEMENTARIOS
        String mensajeBienvenida = "Bienvenido a Java";
        double temperaturaActual = 19;
        boolean datoLogico = true;
        //text block
        System.out.println("""
                %s
                La temperatura actual es de %.2f °C
                Tu estado actual es: Conectado{%b}
                """.formatted(mensajeBienvenida, temperaturaActual, datoLogico)); 
    }
}
