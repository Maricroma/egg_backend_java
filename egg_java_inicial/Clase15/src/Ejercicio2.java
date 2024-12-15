import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] calificaciones = new String[20];

        for (int i = 0; i < calificaciones.length; i++) {
            double calificacion = (Math.random() * 9) + 1;
            calificaciones[i] = String.format("%.2f", calificacion);
        }

        // Contar cuántas calificaciones hay en cada categoría
        int countDesaprobados = 0;
        int countAprobados = 0;
        int countExcelentes = 0;

        for (String calificacionStr : calificaciones) {
            calificacionStr = calificacionStr.replace(',', '.');
            double calificacion = Double.valueOf(calificacionStr);
        
            if (calificacion < 4) {
                countDesaprobados++;
            } else if (calificacion >= 4 && calificacion < 8) {
                countAprobados++;
            } else if (calificacion >= 8) {
                countExcelentes++;
            }
        }

        // Crear arreglos para cada categoría
        double[] desaprobados = new double[countDesaprobados];
        double[] aprobados = new double[countAprobados];
        double[] excelentes = new double[countExcelentes];

        // Llenar los nuevos arreglos
        countDesaprobados = 0;
        countAprobados = 0;
        countExcelentes = 0;

        // Calcular promedios
        double promedioTotal = 0;
        double promedioDesaprobados = 0;
        double promedioAprobados = 0;
        double promedioExcelentes = 0;

        for (String calificacionStr : calificaciones) {
            calificacionStr = calificacionStr.replace(',', '.');
            double calificacion = Double.parseDouble(calificacionStr);
            promedioTotal += calificacion;

            if (calificacion < 4) {
                desaprobados[countDesaprobados] = calificacion;
                countDesaprobados++;
                promedioDesaprobados += calificacion;
            } else if (calificacion >= 4 && calificacion < 8) {
                aprobados[countAprobados] = calificacion;
                countAprobados++;
                promedioAprobados += calificacion;
            } else if (calificacion >= 8) {
                excelentes[countExcelentes] = calificacion;
                countExcelentes++;
                promedioExcelentes += calificacion;
            }
        }

        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        System.out.println("Desaprobados: " + Arrays.toString(desaprobados));
        System.out.println("Aprobados: " + Arrays.toString(aprobados));
        System.out.println("Excelentes: " + Arrays.toString(excelentes));
        System.out.println("Promedio total: " + String.format("%.2f", (promedioTotal / calificaciones.length)));
        System.out.println("Promedio desaprobados: " + String.format("%.2f", (promedioDesaprobados / desaprobados.length)));
        System.out.println("Promedio aprobados: " + String.format("%.2f", (promedioAprobados / aprobados.length)));
        System.out.println("Promedio excelentes: " + String.format("%.2f", (promedioExcelentes / excelentes.length)));

    }
}
