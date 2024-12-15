import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemBiblioteca implements Catalogable {

    private int nroEdicion;
    private String nombreRevista;


    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }


    @Override
    public void prestar() {
        if (ejemplaresPrestados < cantidadEjemplares) {
            ejemplaresPrestados++;
            cantidadEjemplares--; // Disminuir la cantidad de ejemplares disponibles
            int idEjemplar = ejemplaresPrestados; // Asignar un ID único por ejemplar
            prestamos.add(new Prestamo(idEjemplar, LocalDate.now()));  // Guardamos el ID y la fecha del préstamo
            System.out.println("Revista prestada. Ejemplares restantes: " + cantidadEjemplares);
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
                System.out.println("Revista devuelta. Ejemplares disponibles: " + cantidadEjemplares);
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
                multaTotal += diasDeRetraso * 1.0;  // Suponemos que la multa es de 1 unidad monetaria por día de retraso
            }
        }
        return multaTotal;
    }

    @Override
    public String obtenerInformacion() {
        return """
                ----------------------------
                REVISTA
                Nombre: %s,
                N° de edición: %d,
                Cantidad de ejemplares: %d 
                ----------------------------
                """.formatted(nombreRevista, nroEdicion, cantidadEjemplares);
    }

}
