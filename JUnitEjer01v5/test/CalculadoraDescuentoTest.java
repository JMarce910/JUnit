

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servicios.CalculadoraServicio;

/**
 *
 * @author Pc
 */
public class CalculadoraDescuentoTest {

    public CalculadoraDescuentoTest() {
    }

    CalculadoraServicio c1;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        c1 = new CalculadoraServicio();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaSerDiez() {

        assertEquals(0, c1.calculadoraDescuento(120.5, 0.10), 0);
        assertEquals(12.5, c1.calculadoraDescuento(120.5, 0.10), 0);
        assertEquals(25, c1.calculadoraDescuento(120.5, 0.10), 0);

    }

    @Test
    public void noDescuento() {

        assertEquals(0, c1.calculadoraDescuento(120.5, 0), 0);
    }

    @Test
    public void descuentoMaximo() {

        assertTrue(c1.calculadoraDescuento(120.5, 0.10) < 20);

    }
}
