import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromoTest {

	InterfacePalindromo palin = new Palindromo();

	@Test
	public void testAna() throws Exception {
		String texto = "Ana";
		assertTrue(palin.isPalindromo(texto));
	}
	
	@Test
	public void testArara() throws Exception {
		String texto = "Arara";
		assertTrue(palin.isPalindromo(texto));
	}
	
	@Test
	public void testAmeOPoema() throws Exception {
		String texto = "Ame o poema";
		assertTrue(palin.isPalindromo(texto));
	}
	
	@Test
	public void testRoma() throws Exception {
		String texto = "Roma";
		assertFalse(palin.isPalindromo(texto));
	}

	@Test
	public void testAmor() throws Exception {
		String texto = "Amor";
		assertFalse(palin.isPalindromo(texto));
	}

	@Test(expected = TextoNuloException.class)
	public void testNulo() throws Exception {
		assertTrue(palin.isPalindromo(null));
	}
}
