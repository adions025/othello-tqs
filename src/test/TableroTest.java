package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import juego.Tablero;
import juego.Color;
import juego.Direccion;

class TableroTest {

	//@Test
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
	void testColocarPiezasAlado() {
		//debe dejar colocar pieza solo si hay una pieza contraria alado
		Tablero tablero = new Tablero();
		System.out.println(tablero);

		//posiciones que deberia dejar colocar piezas
		//pieza negra
		assertTrue(tablero.wrapperPiezaJuntoApieza(2, 3));
		assertTrue(tablero.wrapperPiezaJuntoApieza(3, 2));
		assertTrue(tablero.wrapperPiezaJuntoApieza(4, 5));
		assertTrue(tablero.wrapperPiezaJuntoApieza(5, 4));
		
		//las esquinas tambien se puede colocar 
		assertTrue(tablero.wrapperPiezaJuntoApieza(2, 2));
		assertTrue(tablero.wrapperPiezaJuntoApieza(5, 5));
		
		//posiciones limites con el tablero
		//
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 1));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 2));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 3));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 4));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 5));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 6));
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 7));
		
		//
		assertFalse(tablero.wrapperPiezaJuntoApieza(1, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(2, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(3, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(4, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(5, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(6, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 0));
		
		//
		assertFalse(tablero.wrapperPiezaJuntoApieza(0, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(1, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(2, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(3, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(4, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(5, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(6, 7));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 7));
		
		//
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 0));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 1));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 2));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 3));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 4));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 5));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 6));
		assertFalse(tablero.wrapperPiezaJuntoApieza(7, 7));

	}

	@Test
	void testColocarPiezasDiferenteColor(){
		/*
			   	  1  2  3  4  5  6  7  8
			   1  -  -  -  -  -  -  -  -
			   2  -  -  -  -  -  -  -  -
			   3  -  -  -  -  -  -  -  -
			   4  -  - [B] B  N  -  -  -
			   5  -  -  -  N  B  -  -  -
			   6  -  -  -  -  -  -  -  -
			   7  -  -  -  -  -  -  -  -
			   8  -  -  -  -  -  -  -  -
		
		 * se deberia asegurar que la pieza que se coloca sea de
		 * color contrario en algun sentid, de esta manera poder
		 * girar la pieza intermedio, en el ejemplo mostrado es
		 * incorrecta la pieza [B]lanca. 
		 */
			
		Tablero tablero = new Tablero();
		//assertFalse(tablero.wrapperCheckColocarPieza(2, 2, Color.Negra));
		//
		assertFalse(tablero.wrapperCheckColocarPieza(2, 3, Color.Blanca, false));
		assertFalse(tablero.wrapperCheckColocarPieza(2, 2, Color.Blanca, false));
		assertFalse(tablero.wrapperCheckColocarPieza(3, 2, Color.Blanca, false));
		
		assertFalse(tablero.wrapperCheckColocarPieza(4, 5, Color.Blanca, false));
		assertFalse(tablero.wrapperCheckColocarPieza(5, 5, Color.Blanca, false));
		assertFalse(tablero.wrapperCheckColocarPieza(5, 4, Color.Blanca, false));
		
		//
		assertFalse(tablero.wrapperCheckColocarPieza(4, 2, Color.Negra, false));
		assertFalse(tablero.wrapperCheckColocarPieza(5, 2, Color.Negra, false));
		assertFalse(tablero.wrapperCheckColocarPieza(5, 3, Color.Negra, false));
		
		assertFalse(tablero.wrapperCheckColocarPieza(2, 4, Color.Negra, false));
		assertFalse(tablero.wrapperCheckColocarPieza(2, 5, Color.Negra, false));
		assertFalse(tablero.wrapperCheckColocarPieza(3, 5, Color.Negra, false));
		

		//
		assertTrue(tablero.wrapperCheckColocarPieza(2, 3, Color.Negra, false));
		assertTrue(tablero.wrapperCheckColocarPieza(3, 2, Color.Negra, false));
		assertTrue(tablero.wrapperCheckColocarPieza(4, 5, Color.Negra, false));
		assertTrue(tablero.wrapperCheckColocarPieza(5, 4, Color.Negra, false));
	
		//
		assertTrue(tablero.wrapperCheckColocarPieza(4, 2, Color.Blanca, false));
		assertTrue(tablero.wrapperCheckColocarPieza(5, 3, Color.Blanca, false));
		assertTrue(tablero.wrapperCheckColocarPieza(2, 4, Color.Blanca, false));
		assertTrue(tablero.wrapperCheckColocarPieza(3, 5, Color.Blanca, false));
		
		}
	
	@Test
	void testCheckLines() {

		Tablero tablero = new Tablero();
		//
		assertEquals(-1, tablero.wrapperCheckLines(2, 3, Color.Blanca, Direccion.abajo, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 3, Color.Blanca, Direccion.abajoIzquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 3, Color.Blanca, Direccion.izquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 3, Color.Blanca, Direccion.derecha, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 3, Color.Blanca, Direccion.abajoDerecha, false));
		
		assertEquals(-1, tablero.wrapperCheckLines(2, 2, Color.Blanca, Direccion.abajo, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 2, Color.Blanca, Direccion.abajoIzquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 2, Color.Blanca, Direccion.izquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 2, Color.Blanca, Direccion.derecha, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 2, Color.Blanca, Direccion.abajoDerecha, false));
		
		assertEquals(-1, tablero.wrapperCheckLines(2, 5, Color.Blanca, Direccion.abajo, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 5, Color.Blanca, Direccion.abajoIzquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 5, Color.Blanca, Direccion.izquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 5, Color.Blanca, Direccion.derecha, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 5, Color.Blanca, Direccion.abajoDerecha, false));
		
		assertEquals(-1, tablero.wrapperCheckLines(2, 1, Color.Blanca, Direccion.abajo, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 1, Color.Blanca, Direccion.abajoIzquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 1, Color.Blanca, Direccion.izquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 1, Color.Blanca, Direccion.derecha, false));
		assertEquals(-1, tablero.wrapperCheckLines(2, 1, Color.Blanca, Direccion.abajoDerecha, false));
		
		assertEquals(-1, tablero.wrapperCheckLines(4, 2, Color.Blanca, Direccion.abajo, false));
		assertEquals(-1, tablero.wrapperCheckLines(4, 2, Color.Blanca, Direccion.abajoIzquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(4, 2, Color.Blanca, Direccion.izquierda, false));
		assertEquals(-1, tablero.wrapperCheckLines(4, 2, Color.Blanca, Direccion.derecha, false));
		assertEquals(-1, tablero.wrapperCheckLines(4, 2, Color.Blanca, Direccion.abajoDerecha, false));
		
		assertEquals(-1, tablero.wrapperCheckLines(5, 2, Color.Negra, Direccion.arribaDerecha, false));
		
		
		
		//
		Tablero tableroTest = new Tablero(1);
		
		//
		assertEquals(1, tableroTest.wrapperCheckLines(2, 2, Color.Blanca, Direccion.arribaIzquierda, false));
		assertEquals(2, tableroTest.wrapperCheckLines(2, 3, Color.Blanca, Direccion.arriba, false));
		assertEquals(2, tableroTest.wrapperCheckLines(2, 4, Color.Blanca, Direccion.arribaDerecha, false));
		assertEquals(1, tableroTest.wrapperCheckLines(3, 2, Color.Blanca, Direccion.izquierda, false));
		assertEquals(-1, tableroTest.wrapperCheckLines(3, 4, Color.Blanca, Direccion.derecha, false));
		assertEquals(-1, tableroTest.wrapperCheckLines(4, 3, Color.Blanca, Direccion.abajo, false));
		assertEquals(2, tableroTest.wrapperCheckLines(4, 2, Color.Blanca, Direccion.abajoIzquierda, false));
		assertEquals(3, tableroTest.wrapperCheckLines(4, 4, Color.Blanca, Direccion.abajoDerecha, false));
		

		Tablero tableroTest2 = new Tablero(2);

		//
		assertEquals(1, tableroTest2.wrapperCheckLines(0, 1, Color.Negra, Direccion.derecha, false));
		assertEquals(6, tableroTest2.wrapperCheckLines(1, 1, Color.Negra, Direccion.abajoDerecha, false));
		assertEquals(5, tableroTest2.wrapperCheckLines(1, 0, Color.Negra, Direccion.abajo, false));
		
		//

	}
	
	
	@Test
	void testCheckLimites() {
		
		Tablero tablero = new Tablero();
		
		//
		assertFalse(tablero.wrappercheckLimites(0, -1));
		assertFalse(tablero.wrappercheckLimites(-1, -1));
		assertFalse(tablero.wrappercheckLimites(-1, 7));
		assertFalse(tablero.wrappercheckLimites(0, 8));
		assertFalse(tablero.wrappercheckLimites(-1, 8));
		assertFalse(tablero.wrappercheckLimites(8, 0));
		assertFalse(tablero.wrappercheckLimites(7, -1));
		assertFalse(tablero.wrappercheckLimites(8, -1));
		assertFalse(tablero.wrappercheckLimites(7, 8));
		assertFalse(tablero.wrappercheckLimites(8, 7));
		assertFalse(tablero.wrappercheckLimites(8, 8));	
		
		
		assertFalse(tablero.wrappercheckLimites(-5, 0));
		assertFalse(tablero.wrappercheckLimites(0, -3));
		assertFalse(tablero.wrappercheckLimites(-2, -4));
		assertFalse(tablero.wrappercheckLimites(-5, 7));
		assertFalse(tablero.wrappercheckLimites(-0, 11));
		assertFalse(tablero.wrappercheckLimites(-4, 9));
		assertFalse(tablero.wrappercheckLimites(9, 0));
		assertFalse(tablero.wrappercheckLimites(7, -2));
		assertFalse(tablero.wrappercheckLimites(10, -3));
		assertFalse(tablero.wrappercheckLimites(7, 10));
		assertFalse(tablero.wrappercheckLimites(9, 7));
		assertFalse(tablero.wrappercheckLimites(11, 13));
			
	}
	
	@Test
	void testCheckGirarLinias(){
		Tablero tablero = new Tablero(1);
		Tablero tableroresuleto = new Tablero(3);
		tablero.colocarPieza(3, 3, Color.Blanca);
				
		for(int i = 0; i < tablero.getTablero().length; i++){
			for(int j = 0; j < tablero.getTablero().length; j++) {
				if (tablero.getTablero()[i][j] == null){
					assertEquals(tableroresuleto.getTablero()[i][j], null);
				} else {
					assertEquals(tablero.getTablero()[i][j].getColor(), tableroresuleto.getTablero()[i][j].getColor());

				}
			}
		}

	}
	
}