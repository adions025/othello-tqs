package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import juego.Color;
import juego.Juego;
import juego.Jugador;

class JuegoTest {
	
	@Test
	void testConstrygetJugador() {
		Juego othello = new Juego();
		Jugador jugador1;
		jugador1 = Juego.getJugador(0);
		assertEquals(Color.Negra, jugador1.getColor());
		
	}
}
