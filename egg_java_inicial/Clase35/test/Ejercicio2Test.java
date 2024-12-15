import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);
    }

    @Test
    void testMain() {
        Ejercicio2.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        assertEquals("Me llamo Cristina y tengo 30 años.\r\n", salida);
    }

    @Test
    void testCrearMensaje() {
        String mensaje = Ejercicio2.crearMensaje("Cristina", 30);
        assertEquals("Me llamo Cristina y tengo 30 años.", mensaje);
    }
}
