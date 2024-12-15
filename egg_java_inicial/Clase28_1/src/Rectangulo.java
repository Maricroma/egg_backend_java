public class Rectangulo extends Figura implements Dibujable {

    private double alto;
    private double ancho;


    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return this.alto * this.ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de ancho: " + ancho + " y alto: " + alto);
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
    
}
