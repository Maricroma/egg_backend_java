public class Circulo extends Figura implements Dibujable {

    private int radio;
    

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio: " + radio);
        for (int i = -radio; i <= radio; i++) {
            for (int j = -radio; j <= radio; j++) {
                if (i * i + j * j <= radio * radio) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
