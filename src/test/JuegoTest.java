package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import juego.Color;
import juego.Juego;
import juego.Jugador;

class JuegoTest {
	
	@Test
	void testConstruct() {
		Juego othello = new Juego();
		Jugador jugador1;
		jugador1 = othello.getJugador(0);
		assertEquals(Color.Negra, jugador1.getColor());
		
		Jugador jugador2;
		jugador2 = othello.getJugador(1);
		assertEquals(Color.Blanca, jugador2.getColor());
	}
	
}
