package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.Color;
import juego.Jugador;

class JugadorTest {

	@Test
	void testGetColorJugador() {
		
		Jugador jugador1 = new Jugador(Color.Negra);
		jugador1.getColor();
		assertEquals(Color.Negra, Color.Negra);
		
		Jugador jugador2 = new Jugador(Color.Blanca);
		jugador2.getColor();
		assertEquals(Color.Blanca, Color.Blanca);
	}
	

}
