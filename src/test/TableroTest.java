package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.Juego;
import juego.Pieza;
import juego.Tablero;
import juego.Color;

class TableroTest {

	//@Test
	void testContructorTablero() {
		Juego juego = new Juego();
		
		Tablero tablero;
		tablero = juego.getTablero();
		
		String tableroEsperado = ""
				+ "   1  2  3  4  5  6  7  8\n" + 
				"1  -  -  -  -  -  -  -  -\n" + 
				"2  -  -  -  -  -  -  -  -\n" + 
				"3  -  -  -  -  -  -  -  -\n" + 
				"4  -  -  -  -  -  -  -  -\n" + 
				"5  -  -  -  -  -  -  -  -\n" + 
				"6  -  -  -  -  -  -  -  -\n" + 
				"7  -  -  -  -  -  -  -  -\n" + 
				"8  -  -  -  -  -  -  -  -";
		
		assertEquals(tableroEsperado, tablero);
		
	}
	
	//@Test
	void testTableroInicializado() {
		Juego juego = new Juego();
		
		Tablero tablero;
		tablero = juego.getTablero();
		
		String tableroEsperado = ""
				+ "   1  2  3  4  5  6  7  8\n" + 
				"1  -  -  -  -  -  -  -  -\n" + 
				"2  -  -  -  -  -  -  -  -\n" + 
				"3  -  -  -  -  -  -  -  -\n" + 
				"4  -  -  -  B  N  -  -  -\n" + 
				"5  -  -  -  N  B  -  -  -\n" + 
				"6  -  -  -  -  -  -  -  -\n" + 
				"7  -  -  -  -  -  -  -  -\n" + 
				"8  -  -  -  -  -  -  -  -";
		
		assertEquals(tableroEsperado, tablero);
		
	}
	
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
		
		//
		assertTrue(tablero.colocarPieza(0, 0, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 0, Color.Negra));
		
		assertTrue(tablero.colocarPieza(0, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 7, Color.Negra));
		
		assertTrue(tablero.colocarPieza(7, 0, Color.Negra));
		assertFalse(tablero.colocarPieza(7, 0, Color.Blanca));
		
		assertTrue(tablero.colocarPieza(7, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(7, 7, Color.Negra));
		
		//
		assertTrue(tablero.colocarPieza(0, 5, Color.Blanca));
		assertFalse(tablero.colocarPieza(0, 5, Color.Negra));
		
		assertTrue(tablero.colocarPieza(5, 0, Color.Negra));
		assertFalse(tablero.colocarPieza(5, 0, Color.Blanca));

		assertTrue(tablero.colocarPieza(7, 5, Color.Negra));
		assertFalse(tablero.colocarPieza(7, 5, Color.Blanca));
	
		assertTrue(tablero.colocarPieza(5, 7, Color.Blanca));
		assertFalse(tablero.colocarPieza(5, 7, Color.Negra));		
		
	}
	
	@Test
	void testColocarPiezaTableroFueradePosicion() {
		Tablero tablero = new Tablero();
		System.out.println(tablero);
		//
		assertFalse(tablero.colocarPieza(-1, 0, Color.Blanca));
		
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
		
		
	}

}
