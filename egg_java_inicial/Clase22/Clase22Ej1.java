package Clase22;

public class Clase22Ej1 {
    public static void main(String[] args) {
        int[] array = { 4, 5, 6, 7, 7, 8, 0 };
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i]; 
        }

        System.out.println("La suma de los valores es " + suma);
    }
}

// CONSIGNA
// Actividad: Depurando un programa con un Bucle
// Crea un programa que use un bucle fori para iterar a través de un array de
// números y calcular la suma de todos los números en el array.

// Coloca un punto de interrupción dentro del bucle.

// Ejecuta el programa en modo debug y observa cómo cambian los valores de
// "suma" y "número" en cada iteración usando el “step over”.

// Luego vuelve a ejecutar el programa pero utiliza un “breakpoint condicional”
// para que el programa se detenga en el anteúltimo índice del array