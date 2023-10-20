


import org.junit.Test;
import static org.junit.Assert.*;
import static servicios.PasswordValidator.pwValid;

/**
 *
 * @author Pc
 */
public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {

        // Contraseñas válidas
        assertTrue(pwValid("StrongP@ssword1"));
        assertTrue(pwValid("Secur3P@ss!"));

        // Contraseñas inválidas
        assertFalse(pwValid("weak"));
        assertFalse(pwValid("no_special_chars"));
        assertFalse(pwValid("NoNumberOrSpecialChar"));
    }
}
