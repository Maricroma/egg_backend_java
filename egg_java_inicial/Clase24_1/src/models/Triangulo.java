package models;

public class Triangulo {
    private Double base;
    private Double altura;

    public Triangulo() {
        this(0.0, 0.0);
    }

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        if (base > 0) {
            this.base = base;
        } else System.out.println("Error: El valor debe ser mayor a 0.");
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else System.out.println("Error: El valor debe ser mayor a 0.");
    }

    private Double area() {
        if (this.base != null && this.altura != null) {
            return (this.base*this.altura) / 2;
        } else return 0.0;
        
    }  

    public String imprimirArea() {
        return "Área: " + String.format("%.2f", this.area());
    }
}
