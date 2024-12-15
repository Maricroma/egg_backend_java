public class Gato extends Animal {
    private String color;

    public Gato(String nombre, Integer edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String maullar() {
        return this.nombre + " está maullando.";
    }

    @Override
    public String comer() {
        return this.nombre + " está comiendo atún.";
    }

    @Override
    public String dormir() {
        return this.nombre + " está durmiendo encima del sofá.";
    }

}
