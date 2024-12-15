import java.util.ArrayList;
import java.util.List;

public abstract class ItemBiblioteca {

    protected List<Prestamo> prestamos = new ArrayList<>(); // Lista de objetos Prestamo
    protected int ejemplaresPrestados = 0; // Contador de ejemplares prestados
    protected int cantidadEjemplares;
    
    public abstract void prestar();
    public abstract void devolver(int idEjemplar);
    public abstract double calcularMultas();
    
}
