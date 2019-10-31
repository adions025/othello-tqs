package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.Color;
import juego.Jugador;

class JugadorTest {

	@Test
	void testGetColorJugador() {
		Color color;
		Jugador jugador1 = new Jugador(Color.Negra);
		color = jugador1.getColor();
		assertEquals(Color.Negra, color);
		
		Jugador jugador2 = new Jugador(Color.Blanca);
		color = jugador2.getColor();
		assertEquals(Color.Blanca, color);
	}
	

}
