public class Ejercicio5 {
    public static void main(String[] args) {
        
        System.out.println("El número aleatorio generado es: " + numeroAleatorio());

        // Explicación del código:
        // Math.random(): Este método genera un número decimal aleatorio entre 0.0 y 1.0 (excluyendo 1.0).
        // Multiplicación por 355: Al multiplicar el resultado por 355, obtenemos un número en el rango de 0.0 a 354.9999.
        // Math.floor(): Redondea hacia abajo el número decimal, resultando en un valor entero entre 0 y 354.
        // Suma de 1: Al agregar 1, se ajusta el rango para obtener un número entero entre 1 y 355.
    }

    public static int numeroAleatorio() {
        return (int) Math.floor(Math.random() * 355) + 1;
    }
}
