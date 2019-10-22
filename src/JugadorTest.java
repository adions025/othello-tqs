import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void test() {
		
	}
	
	@Test
	void testConstructor() {
		
		Jugador jugador1 = new Jugador(true);
		boolean piezaNegra = jugador1.isColor();
		assertTrue(piezaNegra);
		
		Jugador jugador2 = new Jugador(false);
		boolean piezaBlanca = jugador2.isColor();
		assertFalse(piezaBlanca);
	}

}
