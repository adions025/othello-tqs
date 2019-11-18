package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.Color;
import juego.Juego;
import juego.Jugador;

class JugadorTest {

	@Test
	void testGetColorJugador() {
		Jugador jugador1 = new Jugador(Color.Negra);
		assertEquals(Color.Negra, jugador1.getColor());
		
		Jugador jugador2 = new Jugador(Color.Blanca);
		assertEquals(Color.Blanca, jugador2.getColor());
	}

}
