package Clase11;

public class Clase11Ej6 {
    public static void main(String[] args) {
        String[] nombres = {"Laura", "Maria", "Romina", "José", "Martin"};
        String cadenaCompleta = "";

        for (String nombre : nombres) {
            cadenaCompleta += nombre.concat(" ");
        }

        System.out.println(cadenaCompleta);
    }
}

// CONSIGNA
// Concatenando elementos
// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.