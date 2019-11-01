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
		
		System.out.print(tablero);
		
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

}
