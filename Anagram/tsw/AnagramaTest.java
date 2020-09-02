import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTest {

	private String palavra1 = null, palavra2 = null;
	private InterfaceAnagrama a = new Anagrama();

	@Test
	public void testRoma() throws Exception {
		palavra1 = "Roma";
		palavra2 = "Amor";
		assertTrue(a.isAnagrama(palavra1, palavra2));
	}

	@Test
	public void testPedra() throws Exception {
		palavra1 = "Pedra";
		palavra2 = "Perda";
		assertTrue(a.isAnagrama(palavra1, palavra2));
	}
	
	@Test
	public void testOla() throws Exception {
		palavra1 = "Ola";
		palavra2 = "Alo";
		assertTrue(a.isAnagrama(palavra1, palavra2));
	}
	
	@Test
	public void testJacare() throws Exception {
		palavra1 = "Jacare";
		palavra2 = "Igreja";
		assertFalse(a.isAnagrama(palavra1, palavra2));
	}
	@Test
	public void testFalso() throws Exception {
		palavra1 = "Tres";
		palavra2 = "Dois";
		assertFalse(a.isAnagrama(palavra1, palavra2));
	}

	@Test(expected = SemPalavraException.class)
	public void testSemPalavraException() throws Exception {
		palavra1 = "";
		palavra2 = "";
		assertTrue(a.isAnagrama(palavra1, palavra2));
	}

	@Test(expected = TamanhoDiferenteException.class)
	public void testTamDiferenteException() throws Exception {
		palavra1 = "um";
		palavra2 = "dois";
		assertTrue(a.isAnagrama(palavra1, palavra2));
	}

}
