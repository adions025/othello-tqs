package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.Juego;
import juego.Pieza;
import juego.Tablero;
import juego.Color;

class TableroTest {


	@Test
	void testConstructorTablero() {
	
		Tablero tablero = new Tablero();
				
		for (int i = 0; i < tablero.getTablero().length; i++) {
			for (int j = 0; j < tablero.getTablero().length; j++) {
				if((i == 3 & j == 3)||(i == 4 && j == 4)) {
					assertEquals(tablero.getTablero()[i][j].getColor(), Color.Blanca);
				} else {
					if((i == 3 & j == 4)||(i == 4 && j == 3)){
						assertEquals(tablero.getTablero()[i][j].getColor(), Color.Negra);
					} else {
						assertEquals(tablero.getTablero()[i][j], null);
					}
				}
			}
		}
	}
	
	
	@Test
	void testColocarPiezaTablero() {
		
		Tablero tablero = new Tablero();
		
		//esquinas
		assertTrue(tablero.colocarPieza(0, 0, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 0, Color.Negra));
		
		assertTrue(tablero.colocarPieza(0, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 7, Color.Negra));
		
		assertTrue(tablero.colocarPieza(7, 0, Color.Negra));
		assertFalse(tablero.colocarPieza(7, 0, Color.Blanca));
		
		assertTrue(tablero.colocarPieza(7, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(7, 7, Color.Negra));
		
		//laterales
		assertTrue(tablero.colocarPieza(0, 5, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 5, Color.Negra));
		
		assertTrue(tablero.colocarPieza(5, 0, Color.Negra));
		assertFalse(tablero.colocarPieza(5, 0, Color.Blanca));

		assertTrue(tablero.colocarPieza(7, 5, Color.Negra));
		assertFalse(tablero.colocarPieza(7, 5, Color.Blanca));
	
		assertTrue(tablero.colocarPieza(5, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(5, 7, Color.Negra));	
		
		//centros
		assertFalse(tablero.colocarPieza(3, 3, Color.Negra));
		assertFalse(tablero.colocarPieza(3, 4, Color.Negra));
		
		assertFalse(tablero.colocarPieza(3, 3, Color.Blanca));
		assertFalse(tablero.colocarPieza(3, 4, Color.Blanca));
		
		assertFalse(tablero.colocarPieza(4, 3, Color.Negra));
		assertFalse(tablero.colocarPieza(4, 4, Color.Negra));
		
		assertFalse(tablero.colocarPieza(4, 3, Color.Blanca));
		assertFalse(tablero.colocarPieza(4, 4, Color.Blanca));
		
	}
	
	@Test
	void testColocarPiezaTableroFueradePosicion() {
		
		Tablero tablero = new Tablero();
		
		//
		assertFalse(tablero.colocarPieza(0, -1, Color.Blanca));
		assertFalse(tablero.colocarPieza(-1, -1, Color.Blanca));
		assertFalse(tablero.colocarPieza(-1, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 8, Color.Blanca));
		assertFalse(tablero.colocarPieza(-1, 8, Color.Blanca));
		assertFalse(tablero.colocarPieza(8, 0, Color.Blanca));
		assertFalse(tablero.colocarPieza(7, -1, Color.Blanca));
		assertFalse(tablero.colocarPieza(8, -1, Color.Blanca));
		assertFalse(tablero.colocarPieza(7, 8, Color.Blanca));
		assertFalse(tablero.colocarPieza(8, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(8, 8, Color.Blanca));	
		
		
		assertFalse(tablero.colocarPieza(-5, 0, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, -3, Color.Blanca));
		assertFalse(tablero.colocarPieza(-2, -4, Color.Blanca));
		assertFalse(tablero.colocarPieza(-5, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(-0, 11, Color.Blanca));
		assertFalse(tablero.colocarPieza(-4, 9, Color.Blanca));
		assertFalse(tablero.colocarPieza(9, 0, Color.Blanca));
		assertFalse(tablero.colocarPieza(7, -2, Color.Blanca));
		assertFalse(tablero.colocarPieza(10, -3, Color.Blanca));
		assertFalse(tablero.colocarPieza(7, 10, Color.Blanca));
		assertFalse(tablero.colocarPieza(9, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(11, 13, Color.Blanca));
			
	}

}
