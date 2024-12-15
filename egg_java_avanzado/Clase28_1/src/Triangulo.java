public class Triangulo extends Figura implements Dibujable {
    
    private int base;
    private double altura;
    private int lado1;
    private int lado2;
    private int lado3;

    
    public Triangulo(int base, double altura, int lado1, int lado2, int lado3) {

        if (!esTrianguloValido(lado1, lado2, lado3)) {
            throw new IllegalArgumentException("Los lados proporcionados no forman un triángulo válido.");
        }
        
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo con base: " + base + " y altura: " + altura);
 
        for (int i = 1; i <= altura; i++) {
            int numAsteriscos = (int) Math.round((double) base * i / altura);
            
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    public boolean esTrianguloValido(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
