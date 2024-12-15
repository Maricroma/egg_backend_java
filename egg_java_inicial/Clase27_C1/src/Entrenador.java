public class Entrenador extends Persona {

    public Entrenador() {
        super();
    }

    public Entrenador(String nombre, Integer edad, Equipo equipo) {
        super(nombre, edad, equipo);
    }

    @Override
    public String gritarGol() {
        return this.nombre + " es un entrenador y grita gol!";
    }

}
