public class Ejercicio5 {
    public static void main(String[] args) {
        float[] numeros = {
            1.5f, 2.3f, 3.9f, 4.0f, 5.1f, 
            6.7f, 7.8f, 8.2f, 9.3f, 10.0f, 
            11.4f, 12.6f, 13.1f, 14.5f, 15.9f, 
            16.3f, 17.7f, 18.8f, 19.2f, 20.0f
        };
        float suma = 0;

        for (float numero : numeros) {
            suma += numero;
        }
        System.out.println("SUMA: " + suma);
        System.out.println("PROMEDIO: " + suma/numeros.length);
    }
}
