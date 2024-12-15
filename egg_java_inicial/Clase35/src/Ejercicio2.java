public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre = "Cristina";
        int edad = 30;
        System.out.println(crearMensaje(nombre, edad));
    }

    public static String crearMensaje(String nombre, int edad) {
        return "Me llamo " + nombre + " y tengo " + edad + " años.";
    }
}
