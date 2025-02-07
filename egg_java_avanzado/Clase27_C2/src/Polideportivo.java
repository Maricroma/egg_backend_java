public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion;


    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    
}
