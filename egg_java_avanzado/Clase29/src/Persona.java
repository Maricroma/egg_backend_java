import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private List<Libro> prestados;


    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestados = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public List<Libro> getPrestados() {
        return prestados;
    }


    public void setPrestados(List<Libro> prestados) {
        this.prestados = prestados;
    }

    
}
