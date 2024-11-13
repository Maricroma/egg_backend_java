package Clase24_1.modelos;

public class Circulo {
    private Double radio;

    public Circulo() {
        this(0.0);
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else System.out.println("Error: El valor debe ser mayor a 0.");
    }

    private Double area() {
        if (this.radio != null) {
            return Math.PI * Math.pow(this.radio, 2);
        } else return 0.0;
        
    }   

    private Double perimetro() {
        if (this.radio != null) {
            return 2 * Math.PI * this.radio;
        } else return 0.0;
        
    }

    public String imprimirArea() {
        return "Área: " + String.format("%.2f", this.area());
    }

    public String imprimirPerimetro() {
        return "Perímetro: " + String.format("%.2f", this.perimetro());
    }
    
}
