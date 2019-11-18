package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import juego.EntradaTeclado;
import juego.MockEntradaTeclado;
import juego.Othello;

class EntradaTecladoTest {
	
	@Test
	void testMockCoordenadas(){
		
		Othello othello = new Othello();
		EntradaTeclado input = new MockEntradaTeclado();
		
		othello.setInput(input);
		
		othello.jugar();
		
	}

}
