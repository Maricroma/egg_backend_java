public class Rectangulo {
    private Double ancho;
    private Double alto;
    private static Integer contadorRectangulos = 0;

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    private Double area() {
        if (this.alto != null && this.ancho != null) {
            return this.alto * this.ancho;
        } else return 0.0;
        
    }   

    private Double perimetro() {
        if (this.alto != null && this.ancho != null) {
            return 2*this.alto + 2*this.ancho;
        } else return 0.0;
        
    }

    public Double imprimirArea() {
        return this.area();
    }

    public Double imprimirPerimetro() {
        return this.perimetro();
    }

    public String imprimirDatos() {
        if (this.alto != null && this.ancho != null) {
            return "Alto: " + this.alto + " - Ancho: " + this.ancho;
        } else return "No hay datos para mostrar.";
        
    }

    public static Integer mostrarCantRectangulos() {
        return contadorRectangulos;
    }
}

// Actividad: Trabajando con una figura geométrica
// Crea una clase llamada Rectangulo

// Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.

// Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y que lleve un registro del número total de instancias de 'Rectangulo' creadas.

// Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y que incremente en uno el valor de 'contadorRectangulos'. 

// Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables de calcular el área y el perímetro del rectángulo, respectivamente.

// Implementa un método llamado imprimirArea para mostrar el resultado por consola;

// Implementa un método llamado imprimirPerimetro para mostrar el resultado por consola;

// Implementa un método estático que permita obtener el número total de rectángulos creados hasta el momento.

// Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' y acceder a sus métodos para obtener información relevante.
