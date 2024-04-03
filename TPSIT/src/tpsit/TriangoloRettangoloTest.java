package tpsit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangoloRettangoloTest {
	TriangoloRettangolo ret = new TriangoloRettangolo(3, 4);
	@Test
	void testarea() {
		assertEquals(6, ret.calcolaArea(),"Regolar area calcolation");
	}
	@Test
	void testipo() {
		assertEquals(5, ret.calcolaIpo(),"Regolar ipo calcolation");
	}
	@Test
	void testperi() {
		assertEquals(12, ret.calcolaPerimetro(),"Regolar perimeter calcolation");
	}
}
