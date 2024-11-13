package Clase24_2;

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

// Actividad: Plano X - Y
// Considerando lo aprendido en la actividad realizada anteriormente, crea un nuevo proyecto para cumplir con los siguientes objetivos: 


// Crea una clase llamada  'Punto' que representa un punto en un plano bidimensional.

// Define 2 atributos para la clase del tipo private: x e y que representan las coordenadas del punto.

// Crea los métodos getter y setter de todos los atributos de la clase. 

// Crea un método de instancia llamado 'distanciaDesdeOrigen', que calcula y devuelve la distancia del punto desde el origen (0,0).

// Crea un método para cálculos entre puntos, estático, llamado 'calcularDistancia' en la clase 'Punto'. Este método recibe dos objetos de la misma clase y calcula la distancia entre ellos.

// Crea un método estático para cálculos entre puntos, llamado 'estanAlineados' en la clase 'Punto'. Este método recibe tres objetos de la clase 'Punto' y determina si los puntos dados están alineados en la misma recta

// En la clase ejecutable, declara una variable global como un arreglo de objetos 'Punto' para almacenar las instancias creadas."


