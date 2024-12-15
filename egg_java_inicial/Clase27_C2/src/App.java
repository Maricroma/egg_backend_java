import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Crear una lista de edificios
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Agregar instancias de Polideportivos
        edificios.add(new Polideportivo(50, 20, 30, "Polideportivo Central", "Techado"));
        edificios.add(new Polideportivo(40, 15, 25, "Polideportivo Norte", "Abierto"));

        // Agregar instancias de Edificios de Oficinas
        edificios.add(new EdificioDeOficinas(30, 50, 20, 10, 4, 5));
        edificios.add(new EdificioDeOficinas(40, 60, 25, 15, 3, 8));

        // Variables para contar polideportivos techados y abiertos
        int techados = 0;
        int abiertos = 0;

        // Recorrer la lista de edificios
        for (Edificio edificio : edificios) {
            System.out.println("Edificio: " + edificio.getClass().getSimpleName());
            System.out.println("Superficie: " + edificio.calcularSuperficie() + " m²");
            System.out.println("Volumen: " + edificio.calcularVolumen() + " m³");

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                if (poli.getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas oficinas = (EdificioDeOficinas) edificio;
                System.out.println("Capacidad total de personas: " + oficinas.cantPersonas());
            }
            System.out.println();
        }

        // Mostrar cantidad de polideportivos techados y abiertos
        System.out.println("Cantidad de Polideportivos Techados: " + techados);
        System.out.println("Cantidad de Polideportivos Abiertos: " + abiertos);
    }
}
