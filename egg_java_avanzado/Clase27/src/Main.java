import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Coffee", 4, "Chihuahua");
        Perro perro2 = new Perro("Coffee", 4, "Chihuahua");
        Perro perro3 = new Perro("Coffee", 4, "Chihuahua");

        System.out.println(perro1.equals(perro2));
        System.out.println(perro2.equals(perro3));

        System.out.println(perro1.comer());
        System.out.println(perro2.dormir());

        Gato gato1 = new Gato("Cariño", 1, "gris atigrado");
        Gato gato2 = new Gato("Mavetina", 3, "marrón atigrado");
        Gato gato3 = new Gato("Negra", 6, "negro");
        Gato gato4 = new Gato("Pancho", 1, "gris atigrado con blanco");
        Gato gato5 = new Gato("Flora", 5, "gris");
        Gato gato6 = new Gato("Leona", 2, "blanco con gris");
        Gato gato7 = new Gato("Mica", 1, "calico");

        System.out.println(gato1.comer());
        System.out.println(gato1.dormir());

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro1);
        animales.add(perro2);
        animales.add(perro3);
        animales.add(gato1);
        animales.add(gato2);
        animales.add(gato3);
        animales.add(gato4);
        animales.add(gato5);
        animales.add(gato6);
        animales.add(gato7);

        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println(((Perro) animal).ladrar());
            } else {
                System.out.println(((Gato) animal).maullar());
            }
        }
    }

}
