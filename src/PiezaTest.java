import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiezaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFalsetoTrue() {
		Pieza p = new Pieza(false);
		p.girarPieza();
		assertEquals(p.isColor(), true);
	}
	
	@Test
	void testTruetoFalse() {
		Pieza p = new Pieza(true);
		p.girarPieza();
		assertEquals(p.isColor(), false);
	}

}
