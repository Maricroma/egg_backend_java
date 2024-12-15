import java.util.Objects;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, Integer edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String ladrar() {
        return this.nombre + " está ladrando.";
    }

    @Override
    public String comer() {
        return this.nombre + " está comiendo croquetas.";
    }

    @Override
    public String dormir() {
        return this.nombre + " está durmiendo en su cama.";
    }


    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((raza == null) ? 0 : raza.hashCode()) + ((nombre == null) ? 0 : nombre.hashCode()) + ((edad == null) ? 0 : edad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica que sea del mismo tipo
        Perro other = (Perro) obj; // Realiza un casting seguro
        return Objects.equals(nombre, other.nombre) && 
            Objects.equals(edad, other.edad) && 
            Objects.equals(raza, other.raza);
    }

     
}
