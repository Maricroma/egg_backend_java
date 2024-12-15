public class App {
    public static void main(String[] args) throws Exception {
        // Crear objetos Revista
        Revista revista1 = new Revista("National Geographic", 50, 5);
        Revista revista2 = new Revista("Time", 120, 3);
        Revista revista3 = new Revista("Vogue", 101, 0); // Sin ejemplares

        // Mostrar información de las revistas
        revista1.obtenerInformacion();
        revista2.obtenerInformacion();
        revista3.obtenerInformacion();

        // Probar prestar y devolver
        revista1.prestar();
        revista1.prestar();
        revista1.devolver(1); // Devolvemos el ejemplar con ID 1
        revista1.prestar();
        revista2.prestar();
        revista3.prestar(); // No debería poder prestar, ya que tiene 0 ejemplares

    }
}

