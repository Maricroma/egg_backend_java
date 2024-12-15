import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula extends ItemBiblioteca implements Catalogable {

    private String titulo;
    private String director;

    public Pelicula(String titulo, String director, int cantidadEjemplares) {
        this.titulo = titulo;
        this.director = director;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public void prestar() {
        if (ejemplaresPrestados < cantidadEjemplares) {
            ejemplaresPrestados++;
            cantidadEjemplares--; // Disminuir la cantidad de ejemplares disponibles
            int idEjemplar = ejemplaresPrestados; // Asignar un ID único por ejemplar
            prestamos.add(new Prestamo(idEjemplar, LocalDate.now()));  // Guardamos el ID y la fecha del préstamo
            System.out.println("Película prestada. Ejemplares restantes: " + cantidadEjemplares);
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
    }

    @Override
    public void devolver(int idEjemplar) {
        if (ejemplaresPrestados > 0) {
            // Buscar el préstamo con el ID del ejemplar
            Prestamo prestamoADevolver = null;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getIdEjemplar() == idEjemplar) {
                    prestamoADevolver = prestamo;
                    break;
                }
            }

            if (prestamoADevolver != null) {
                prestamos.remove(prestamoADevolver);  // Eliminar el préstamo correspondiente
                ejemplaresPrestados--;
                cantidadEjemplares++; // Aumentar la cantidad de ejemplares disponibles
                System.out.println("Película devuelta. Ejemplares disponibles: " + cantidadEjemplares);
            } else {
                System.out.println("El ejemplar con ID " + idEjemplar + " no fue encontrado en los préstamos.");
            }
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }
    }

    @Override
    public double calcularMultas() {
        double multaTotal = 0.0;
        for (Prestamo prestamo : prestamos) {
            long diasDeRetraso = ChronoUnit.DAYS.between(prestamo.getFechaPrestamo(), LocalDate.now());  // Calcular el retraso en días
            if (diasDeRetraso > 0) {
                multaTotal += diasDeRetraso * 3.0;  // La multa es de 3 unidades monetarias por día de retraso
            }
        }
        return multaTotal;
    }

    @Override
    public String obtenerInformacion() {
        return """
                ----------------------------
                PELÍCULA
                Título: %s,
                Director: %s,
                Cantidad de ejemplares: %d 
                ----------------------------
                """.formatted(titulo, director, cantidadEjemplares);
    }

}
