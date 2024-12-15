import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Persona> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Persona> usuarios) {
        this.usuarios = usuarios;
    }

    public void prestarLibro(Libro libroAPrestar) {
        for (Libro libro : libros) {
            if (libro.equals(libroAPrestar)) {
                libro.setPrestado(true);
            }
        }
    }

    public void devolverLibro(Libro libroADevolver) {
        for (Libro libro : libros) {
            if (libro.equals(libroADevolver)) {
                libro.setPrestado(false);
            }
        }
    }

}
