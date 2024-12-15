import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor, int cantidadEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
            System.out.println("Libro prestado. Ejemplares restantes: " + cantidadEjemplares);
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
                System.out.println("Libro devuelto. Ejemplares disponibles: " + cantidadEjemplares);
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
                multaTotal += diasDeRetraso * 2.0;  // La multa es de 2 unidades monetarias por día de retraso
            }
        }
        return multaTotal;
    }

    @Override
    public String obtenerInformacion() {
        return """
                ----------------------------
                LIBRO
                Título: %s,
                Autor: %s,
                Cantidad de ejemplares: %d 
                ----------------------------
                """.formatted(titulo, autor, cantidadEjemplares);
    }

}
