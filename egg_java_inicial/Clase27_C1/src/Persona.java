public class Persona {
    protected String nombre;
    protected Integer edad;
    protected Equipo equipo;

    

    public Persona() {
    }



    public Persona(String nombre, Integer edad, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Integer getEdad() {
        return edad;
    }



    public void setEdad(Integer edad) {
        this.edad = edad;
    }



    public Equipo getEquipo() {
        return equipo;
    }



    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }



    public String gritarGol() {
        return "La persona grita gol!";
    }


    @Override
    public String toString() {
        return String.format("""
            Nombre: %s
            Edad: %d
            Equipo: %s
            """, this.nombre, this.edad, (this.equipo != null ? this.equipo.getNombre() : "No asignado"));
    }
}
