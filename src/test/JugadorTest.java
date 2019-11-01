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
		jugador1.getColor();
		assertEquals(Color.Negra, Color.Negra);
		
		Jugador jugador2 = new Jugador(Color.Blanca);
		jugador2.getColor();
		assertEquals(Color.Blanca, Color.Blanca);
	}
	
	@Test
	void testColocarPieza() {
		Juego othello = new Juego();
		
		assertTrue(othello.getJugador(1).ponerPieza(0, 0));
		assertFalse(othello.getJugador(2).ponerPieza(0, 0));
		assertTrue(othello.getJugador(2).ponerPieza(0,7));
		assertFalse(othello.getJugador(1).ponerPieza(0, 7));
		assertTrue(othello.getJugador(2).ponerPieza(7,0));
		assertFalse(othello.getJugador(1).ponerPieza(7, 0));
		assertTrue(othello.getJugador(1).ponerPieza(7,7));
		assertFalse(othello.getJugador(2).ponerPieza(7, 7));
		
		assertTrue(othello.getJugador(1).ponerPieza(0, 5));
		assertFalse(othello.getJugador(2).ponerPieza(0, 5));
		assertTrue(othello.getJugador(2).ponerPieza(5,0));
		assertFalse(othello.getJugador(1).ponerPieza(5, 0));
		assertTrue(othello.getJugador(2).ponerPieza(7,5));
		assertFalse(othello.getJugador(1).ponerPieza(7, 5));
		assertTrue(othello.getJugador(1).ponerPieza(5,7));
		assertFalse(othello.getJugador(2).ponerPieza(5, 7));
		
		assertFalse(othello.getJugador(1).ponerPieza(-1, 0));		
		assertFalse(othello.getJugador(1).ponerPieza(0, -1));		
		assertFalse(othello.getJugador(1).ponerPieza(-1, -1));		
		assertFalse(othello.getJugador(1).ponerPieza(-1, 7));		
		assertFalse(othello.getJugador(1).ponerPieza(0, 8));		
		assertFalse(othello.getJugador(1).ponerPieza(-1, 8));		
		assertFalse(othello.getJugador(1).ponerPieza(8, 0));		
		assertFalse(othello.getJugador(1).ponerPieza(7, -1));		
		assertFalse(othello.getJugador(1).ponerPieza(8, -1));		
		assertFalse(othello.getJugador(1).ponerPieza(7, 8));		
		assertFalse(othello.getJugador(1).ponerPieza(8, 7));		
		assertFalse(othello.getJugador(1).ponerPieza(8, 8));
		
		assertFalse(othello.getJugador(1).ponerPieza(-5, 0));		
		assertFalse(othello.getJugador(1).ponerPieza(0, -3));		
		assertFalse(othello.getJugador(1).ponerPieza(-2, -4));		
		assertFalse(othello.getJugador(1).ponerPieza(-5, 7));		
		assertFalse(othello.getJugador(1).ponerPieza(0, 11));		
		assertFalse(othello.getJugador(1).ponerPieza(-4, 9));		
		assertFalse(othello.getJugador(1).ponerPieza(9, 0));		
		assertFalse(othello.getJugador(1).ponerPieza(7, -2));		
		assertFalse(othello.getJugador(1).ponerPieza(10, -3));		
		assertFalse(othello.getJugador(1).ponerPieza(7, 10));		
		assertFalse(othello.getJugador(1).ponerPieza(9, 7));		
		assertFalse(othello.getJugador(1).ponerPieza(11, 13));
		
		assertFalse(othello.getJugador(1).ponerPieza(3, 3));		
		assertFalse(othello.getJugador(1).ponerPieza(3, 4));		
		assertFalse(othello.getJugador(1).ponerPieza(4, 3));		
		assertFalse(othello.getJugador(1).ponerPieza(4, 4));
		
		assertTrue(othello.getJugador(1).ponerPieza(2, 3));
		assertFalse(othello.getJugador(2).ponerPieza(2, 3));
		assertTrue(othello.getJugador(2).ponerPieza(6,5));
		assertFalse(othello.getJugador(1).ponerPieza(6, 5));
	}

}
