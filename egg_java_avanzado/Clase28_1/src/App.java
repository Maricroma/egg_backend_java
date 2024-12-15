public class App {
    public static void main(String[] args) throws Exception {
        // Crear instancias de las figuras
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 7);
        Figura triangulo = new Triangulo(3, 4, 3, 4, 5);

        // Dibujar y mostrar resultados de cada figura
        Dibujable d1 = (Dibujable) circulo;
        Dibujable d2 = (Dibujable) rectangulo;
        Dibujable d3 = (Dibujable) triangulo;

        d1.dibujar();
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        d2.dibujar();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        d3.dibujar();
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
    }
}
