import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    private InputStream standarIn = System.in;
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);
        System.setIn(standarIn);
    }

    @Test
    void testMain() {
        // Simular entradas para el método main
        ByteArrayInputStream in = new ByteArrayInputStream("Cristina\n30\n".getBytes());
        System.setIn(in);

        // Ejecutar el método main
        Ejercicio3.main(new String[0]);

        // Capturar y normalizar la salida
        String salida = outputStreamCaptor.toString().replace("\r\n", "\n").trim();

        // Salida esperada
        String salidaEsperada = "Ingrese su nombre: Ingrese su edad: Me llamo Cristina y tengo 30 años.\r\n".trim();

        // Verificar la salida
        assertEquals(salidaEsperada, salida);
    }

    @Test
    void testPedirNombre() {
        ByteArrayInputStream in = new ByteArrayInputStream("Cristina".getBytes());
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        String nombre = Ejercicio3.pedirNombre(sc);
        assertEquals("Cristina", nombre);
        sc.close();
    }

    @Test
    void testPedirEdad() {
        ByteArrayInputStream in = new ByteArrayInputStream("30\n".getBytes());
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int edad = Ejercicio3.pedirEdad(sc);
        assertEquals(30, edad);
        sc.close();
    }

    @Test
    void testCrearMensaje() {
        String mensaje = Ejercicio2.crearMensaje("Cristina", 30);
        assertEquals("Me llamo Cristina y tengo 30 años.", mensaje);
    }
}
