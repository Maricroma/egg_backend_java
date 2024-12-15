public class EdificioDeOficinas extends Edificio {
    private int numeroOficinas;
    private int personasPorOficina;
    private int numeroPisos;

    // Constructor
    public EdificioDeOficinas(double ancho, double alto, double largo, int numeroOficinas, int personasPorOficina, int numeroPisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo * numeroPisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    public int cantPersonas() {
        return numeroOficinas * personasPorOficina * numeroPisos;
    }
}
