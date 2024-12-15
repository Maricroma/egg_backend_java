public class Main {
    // Arreglo global de objetos Punto
    private static Punto[] puntos = new Punto[10]; // Ejemplo con capacidad de 10 puntos
    private static int indice = 0; // Para rastrear la cantidad de puntos almacenados

    public static void main(String[] args) {
        // Creación de instancias de Punto y almacenamiento en el arreglo
        Punto punto1 = new Punto(2.0, 3.0);
        Punto punto2 = new Punto(5.0, 7.0);
        Punto punto3 = new Punto(8.0, 11.0);

        // Almacenando puntos en el arreglo global
        almacenarPunto(punto1);
        almacenarPunto(punto2);
        almacenarPunto(punto3);

        // Pruebas de métodos
        System.out.println("Distancia del punto1 desde el origen: " + punto1.distanciaDesdeOrigen());
        System.out.println("Distancia entre punto1 y punto2: " + Punto.calcularDistancia(punto1, punto2));
        System.out.println("¿Están alineados los puntos? " + Punto.estanAlineados(punto1, punto2, punto3));
    }

    // Método para almacenar puntos en el arreglo global
    public static void almacenarPunto(Punto punto) {
        if (indice < puntos.length) {
            puntos[indice] = punto;
            indice++;
        } else {
            System.out.println("El arreglo de puntos está lleno.");
        }
    }
}
