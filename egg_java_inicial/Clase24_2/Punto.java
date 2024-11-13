package Clase24_2;

public class Punto {
    private Double x;
    private Double y;

    public Punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método de instancia para calcular la distancia desde el origen (0,0)
    // utiliza la fórmula de la distancia euclidiana entre dos puntos 
    public Double distanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método estático para calcular la distancia entre dos puntos
    public static Double calcularDistancia(Punto p1, Punto p2) {
        Double dx = p2.getX() - p1.getX();
        Double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para verificar si tres puntos están alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        // comparar las pendientes entre cada par de puntos
        // (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)
        // Si esta igualdad se cumple, entonces los tres puntos están alineados, ya que sus pendientes son iguales
        return (p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) == (p3.getY() - p2.getY()) * (p2.getX() - p1.getX());
    }
}
