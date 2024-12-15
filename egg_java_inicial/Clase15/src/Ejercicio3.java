public class Ejercicio3 {
    public static void main(String[] args) {
        int valor = 0, valorSig = 1, cont=2;

        System.out.println("SERIE FIBONACCI:\nPosición 0: " + valor + "\nPosición 1: " + valorSig);

        while (cont <= 8) {
            int valorAMostrar = valor + valorSig;
            System.out.println("Posición " + cont + ": " + valorAMostrar);
            valor = valorSig;
            valorSig = valorAMostrar;
            cont++;
        }

    }
}
