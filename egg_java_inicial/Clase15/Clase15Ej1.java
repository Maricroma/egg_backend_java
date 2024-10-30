package Clase15;

import java.util.Scanner;

public class Clase15Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String clave = "";
        boolean tieneDigito, tieneMayuscula, tieneMinuscula;

        System.out.println("Indique la cantidad de caracteres de la contraseña:");
        int longitud = sc.nextInt();
        sc.close();

        Character[] arrCaracteres = new Character[longitud];

        do {
            tieneDigito = false;
            tieneMayuscula = false;
            tieneMinuscula = false;

            for (int i = 0; i < longitud; i++) {
                Character caracter;
                do {
                    int aleatorio = (int)(Math.random() * 74) + 48; // Rango de 48 a 122
                    caracter = (char) aleatorio;
                } while (!Character.isLetterOrDigit(caracter)); // Repetir hasta obtener letra o dígito

                // Asignar el carácter al arreglo y verificar sus propiedades
                arrCaracteres[i] = caracter;
                if (Character.isDigit(caracter)) {
                    tieneDigito = true;
                } else if (Character.isUpperCase(caracter)) {
                    tieneMayuscula = true;
                } else if (Character.isLowerCase(caracter)) {
                    tieneMinuscula = true;
                }
            }
        } while (!tieneMinuscula || !tieneMayuscula || !tieneDigito); // Repetir si falta alguna condición

        // Convertir el arreglo de caracteres en una cadena
        for (Character caracter : arrCaracteres) {
            clave += caracter;
        }

        //opcional pero recomendado para un rendimiento óptimo
        // StringBuilder sb = new StringBuilder();
        // for (Character caracter : arrCaracteres) {
        //     sb.append(caracter);
        // }
        // clave = sb.toString();

        System.out.println("CONTRASEÑA: " + clave);
    }
}

// CONSIGNA
// Generando contraseñas
// Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.

// Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.

// Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.

// Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola.