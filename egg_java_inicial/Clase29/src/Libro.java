public class Libro {
    private String titulo;
    private String autor;
    private int cantPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int cantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.prestado = false;
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

    public int getCantPaginas() {
        return cantPaginas;
    } 

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    } 

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String obtenerInformacion() {
        return """
                ----------------------------
                LIBRO
                Título: %s
                Autor: %s
                Cantidad de páginas: %d 
                Estado: %s
                ----------------------------
                """.formatted(titulo, autor, cantPaginas, (isPrestado()? "No disponible" : "Disponible"));
    }


}
