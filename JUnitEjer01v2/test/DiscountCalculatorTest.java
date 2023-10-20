

import entidad.DiscountCalculator;
import org.junit.Before;
import org.junit.BeforeClass;
import servicios.DiscountCalculatorServices;


public class DiscountCalculatorTest {
    // La hacemos static para que mantenga el valor

    static DiscountCalculatorServices DCS;

    @BeforeClass
    public static void setUp() {
        DCS = new DiscountCalculatorServices();
    }

    @Before
    public void crear() {

        DiscountCalculator calculadora = DCS.crearCalculadora();
    }
}
