

import ejemplotestjunit.entidades.Rectangulo;
import ejemplotestjunit.servicios.RectanguloServicio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    // 10. Declaro un objeto de tipo Service
    RectanguloServicio rs;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // 11. Aqui inicializo el objeto y abajo procedo a hacer el test
        rs = new RectanguloServicio();
    }
    
    @After
    public void tearDown() {
    }

    // 9. Hago el primer test que debe ser public y void para que no devuelva nada
    @Test
    public void deberiaInicializarConColor(){
        
        // Voy a probar que el color no sea nulo y se debe inicializar con cualquier valor
        assertNotNull(new Rectangulo(10, 10).getColor());    
    }
    
    // 12. Hago el segundo test ya con el objeto servicio inicializado arriba
    @Test
    public void deberiaCalcularArea(){
        // Voy a probar que el servicio que calcula el área devuelve los números coherentes
        // como calcularArea no esta creado, lo creo en RectanguloServicio 13...
        //100 es el numero esperado, el objservicio con los valores del area 10x10 y 
        // el ultimo numero (0) es delta que es una posible variación que podamos tener.
        assertEquals(100, rs.calcularArea(new Rectangulo(10, 10)), 0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4, 5)), 0);
        
        // para duplicar codigo --> ctrl + shift + flechita abajo   
    }
    
    // 14. Hago un test para probar el perímetro
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10, 10)), 0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20, 30)), 0);
    }
    
    // 16. Ultimo test para probar que active o desactive el triangulo
    @Test
    public void deberiaActivarODesactivar(){
        Rectangulo r = new Rectangulo(5, 5);
        assertTrue(r.isActivo());
        // ahora vamos a setearlo como falso
        r.setActivo(false);
        assertFalse(r.isActivo());
    }
}
