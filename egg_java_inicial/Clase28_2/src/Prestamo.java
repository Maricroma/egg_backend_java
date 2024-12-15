import java.time.LocalDate;

public class Prestamo {
    private int idEjemplar;  // ID único para cada ejemplar
    private LocalDate fechaPrestamo;

    public Prestamo(int idEjemplar, LocalDate fechaPrestamo) {
        this.idEjemplar = idEjemplar;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}
