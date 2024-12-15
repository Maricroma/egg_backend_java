package models;

public class Rectangulo {
    private Double ancho;
    private Double alto;

    public Rectangulo() {
        this(0.0, 0.0);
    }

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        } else System.out.println("Error: El valor debe ser mayor a 0.");
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        if (alto > 0) {
            this.alto = alto;
        } else System.out.println("Error: El valor debe ser mayor a 0.");
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

    public String imprimirArea() {
        return "Área: " + String.format("%.2f", this.area());
    }

    public String imprimirPerimetro() {
        return "Perímetro: " + String.format("%.2f", this.perimetro());
    }
}
