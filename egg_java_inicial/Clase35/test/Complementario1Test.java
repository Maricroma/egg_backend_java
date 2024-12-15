import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Complementario1Test {
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
        ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
        System.setIn(in);

        Complementario1.main(new String[0]);

        String salida = outputStreamCaptor.toString().trim();
        assertEquals("Ingrese un número entero: No es par", salida);

    }

    @Test
    void testEsPar() {
        boolean esPar = Complementario1.esPar(7);
        assertEquals(false, esPar);
    }

    @Test
    void testSolicitarNumero() {
        ByteArrayInputStream in = new ByteArrayInputStream("7\n".getBytes());
        System.setIn(in);
        int num = Complementario1.solicitarNumero();
        assertEquals(7, num);
    }
}
