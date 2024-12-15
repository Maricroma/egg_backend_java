public class Ejercicio6 {
    public static void main(String[] args) {
        String[] nombres = {"Laura", "Maria", "Romina", "José", "Martin"};
        String cadenaCompleta = "";

        for (String nombre : nombres) {
            cadenaCompleta += nombre.concat(" ");
        }

        System.out.println(cadenaCompleta);
    }
}
