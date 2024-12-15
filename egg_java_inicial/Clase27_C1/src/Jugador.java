public class Jugador extends Persona {

    public Jugador() {
        super();
    }

    public Jugador(String nombre, Integer edad, Equipo equipo) {
        super(nombre, edad, equipo);
    }


    @Override
    public String gritarGol() {
        return this.nombre + " es un jugador y grita gol!";
    }


}
