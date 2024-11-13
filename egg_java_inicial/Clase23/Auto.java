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

// Actividad: Usando los constructores
// El propósito de esta actividad es implementar el uso de constructores.


// Crea una clase llamada Auto

// Define 3 atributos para la clase: marca, modelo y año. 

// Crea los siguientes constructores:

// Constructor que inicialice marca, modelo y año

// Constructor que inicialice marca y modelo 

// Constructor que inicialice solamente la marca

// Constructor sin parámetros

// Escribe el método “imprimirDatos” dentro de la clase “Auto”, que al ser invocado imprima en consola su marca, modelo y año. Teniendo en cuenta que algunos atributos pueden no ser inicializados, el método “print” debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un mensaje en el caso de haber sido inicializado con el constructor sin parámetros. 

// Crea al menos 4 objetos para poder probar todos los constructores de la clase, con diferentes valores y muestra sus atributos en la consola.


