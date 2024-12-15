import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numeros = leerValores();
        int suma = calcularSuma(numeros);
        double promedio = calcularPromedio(numeros);
        mostrarResultados(numeros, suma, promedio);

    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Ingrese números enteros (-99 para finalizar):");

        while (numero != -99) {
            numero = scanner.nextInt();
            if (numero != -99) {
                numeros.add(numero);
            }
        }
        scanner.close();
        return numeros;
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            suma += iterator.next();
        }

        return suma;
    }

    public static double calcularPromedio(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0; // Evitar división por cero
        }

        int suma = calcularSuma(numeros); // Reutilizar cálculo de suma
        return (double) suma / numeros.size();
    }

    public static void mostrarResultados(ArrayList<Integer> numeros, int suma, double promedio) {
        String resultados = """
        -------- Resultados ----------
        Valores ingresados: %s
        Cantidad total de valores: %d
        Suma de los valores: %d
        Promedio de los valores: %.2f
        """.formatted(numeros, numeros.size(), suma, promedio);

        System.out.print(resultados);

        // Calcular cuántos números son mayores que el promedio
        int mayoresQuePromedio = 0;
        for (int numero : numeros) {
            if (numero > promedio) {
                mayoresQuePromedio++;
            }
        }
        System.out.println("Cantidad de valores mayores que el promedio: " + mayoresQuePromedio);
    }
}
