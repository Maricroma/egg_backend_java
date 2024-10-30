package Clase11;

import java.util.Scanner;

public class Clase11Comp3 {
    public static void main(String[] args) {
        // Inicializar el array con una frase de hasta 50 caracteres
        char[] frase = {
            'a', 'p', 'r', 'e', 'n', 'd', 'i', 'e', 'n', 'd', 'o', 
            ' ', 'j', 'a', 'v', 'a', ' ', 'e', 's', ' ', 'd', 'i', 
            'v', 'e', 'r', 't', 'i', 'd', 'o', ' ', 'y', ' ', 'ú', 
            't', 'i', 'l', ' ', 'p', 'a', 'r', 'a', ' ', 'e', 'l', 
            ' ', 'f', 'u', 't', 'u', 'r', 'o'
        };

        // Solicitar al usuario un carácter objetivo
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un carácter para buscar en la frase: ");
        char objetivo = sc.next().charAt(0);
        
        // Contar cuántas veces aparece el carácter en el array
        int contador = 0;
        for (char c : frase) {
            if (c == objetivo) {
                contador++;
            }
        }
        
        // Mostrar el resultado
        if (contador > 0) {
            System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
        }
        
        sc.close();
    }
}

// CONSIGNA
// Contar ocurrencias

// Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.

// Por ejemplo, si el array contiene la siguiente frase:

// a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
// y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:

// El carácter "d" aparece 2 veces.

// Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:

// El carácter "z" no aparece en la frase.

