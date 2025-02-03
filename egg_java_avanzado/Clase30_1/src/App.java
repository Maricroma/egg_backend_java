import enums.Color;
import enums.DiaSemana;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejercicio 1: Días de la semana
        DiaSemana[] dias = new DiaSemana[10];

        for (int i = 0; i < dias.length; i++) {
            dias[i] = DiaSemana.values()[(int) (Math.random() * DiaSemana.values().length)];
        }

        for (DiaSemana dia : dias) {
            System.out.println(dia + ": " + imprimirDiaLaboral(dia));
        }

        // Ejercicio 2: Colores
        String[] valoresHexadecimales = {"#FF0000", "#00FF00", "#FFFF00", "#123456", "#0000FF"};
        for (String valorHexadecimal : valoresHexadecimales) {
            Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);
            if (color != null) {
                System.out.println(valorHexadecimal + " es el color " + color);
            } else {
                System.out.println(valorHexadecimal + " No es un color primario");
            }
        }
    }

    public static String imprimirDiaLaboral(DiaSemana dia) {
        return dia.esDiaLaboral() ? "Día laboral" : "No es día laboral";
    }
}
