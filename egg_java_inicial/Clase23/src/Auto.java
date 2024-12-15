public class Auto {
    private String marca;
    private String modelo;
    private int anio;

    public Auto() {
        this(null, null, 0);
    }

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this(marca, modelo, 0);
    }

    public Auto(String marca) {
        this(marca, null, 0);
    }

    public void imprimirDatos() {
        System.out.println("Información del auto:");
        
        if (this.marca != null) {
            System.out.println("Marca: " + this.marca);
        } else {
            System.out.println("Marca: no especificada");
        }

        if (this.modelo != null) {
            System.out.println("Modelo: " + this.modelo);
        } else {
            System.out.println("Modelo: no especificado");
        }

        if (this.anio != 0) { 
            System.out.println("Año: " + this.anio);
        } else {
            System.out.println("Año: no especificado");
        }

        System.out.println();
    }
}
