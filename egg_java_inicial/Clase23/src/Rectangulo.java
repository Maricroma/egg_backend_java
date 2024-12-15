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
