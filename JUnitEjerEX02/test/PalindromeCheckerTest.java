

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servicios.PalindromeChecker;

/**
 *
 * @author Pc
 */
public class PalindromeCheckerTest {
    
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("radar")); // Verifica que la cadena "radar" sea un palíndromo, lo cual es cierto
        assertTrue(PalindromeChecker.isPalindrome("ojo")); // Verifica que la cadena "ojo" sea un palíndromo, lo cual es cierto
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama")); // Verifica si es capaz de manejar espacios y letras mayúsculas correctamente
        assertFalse(PalindromeChecker.isPalindrome("hola")); // Verifica que la cadena "hola" no sea un palíndromo, lo cual es cierto.
        assertFalse(PalindromeChecker.isPalindrome("mundo")); // Verifica que la cadena "mundo" no sea un palíndromo, lo cual es cierto
        assertFalse(PalindromeChecker.isPalindrome("Mockito es divertido")); // Verifica que la cadena "Mockito es divertido" no sea un palíndromo, lo cual es cierto.
    }
}
