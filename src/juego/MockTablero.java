package juego;

public class MockTablero extends Tablero{
	
	public MockTablero(int numTablero) {
		if (numTablero == 1) {
			this.tablero = new Pieza[8][8];
			this.tablero[0][3] = new Pieza(Color.Blanca);
			this.tablero[1][3] = new Pieza(Color.Negra);
			this.tablero[2][3] = new Pieza(Color.Negra);
			//this.tablero[3][3] = new Pieza(Color.Blanca);//objetivo
			this.tablero[4][3] = new Pieza(Color.Negra);
			this.tablero[5][3] = new Pieza(Color.Negra);
			this.tablero[6][3] = new Pieza(Color.Negra);
			this.tablero[7][3] = new Pieza(Color.Negra);
			
			this.tablero[3][4] = new Pieza(Color.Negra);
			this.tablero[3][5] = new Pieza(Color.Negra);
			this.tablero[3][6] = new Pieza(Color.Negra);
			this.tablero[3][7] = new Pieza(Color.Negra);
			
			this.tablero[3][2] = new Pieza(Color.Negra);
			this.tablero[3][1] = new Pieza(Color.Blanca);
			
			this.tablero[4][2] = new Pieza(Color.Negra);
			this.tablero[5][1] = new Pieza(Color.Negra);
			this.tablero[6][0] = new Pieza(Color.Blanca);
			
			this.tablero[4][4] = new Pieza(Color.Negra);
			this.tablero[5][5] = new Pieza(Color.Negra);
			this.tablero[6][6] = new Pieza(Color.Negra);
			this.tablero[7][7] = new Pieza(Color.Blanca);
			
			this.tablero[2][2] = new Pieza(Color.Negra);
			this.tablero[1][1] = new Pieza(Color.Blanca);
			
			this.tablero[2][4] = new Pieza(Color.Negra);
			this.tablero[1][5] = new Pieza(Color.Negra);
			this.tablero[0][6] = new Pieza(Color.Blanca);
		}
		
		if (numTablero == 2) {
			this.tablero = new Pieza[8][8];
			this.tablero[0][1] = new Pieza(Color.Blanca);
			this.tablero[0][2] = new Pieza(Color.Negra);
			
			this.tablero[1][0] = new Pieza(Color.Blanca);
			this.tablero[2][0] = new Pieza(Color.Blanca);
			this.tablero[3][0] = new Pieza(Color.Blanca);
			this.tablero[4][0] = new Pieza(Color.Blanca);
			this.tablero[5][0] = new Pieza(Color.Blanca);
			this.tablero[6][0] = new Pieza(Color.Negra);
			
			this.tablero[1][1] = new Pieza(Color.Blanca);
			this.tablero[2][2] = new Pieza(Color.Blanca);
			this.tablero[3][3] = new Pieza(Color.Blanca);
			this.tablero[4][4] = new Pieza(Color.Blanca);
			this.tablero[5][5] = new Pieza(Color.Blanca);
			this.tablero[6][6] = new Pieza(Color.Blanca);
			this.tablero[7][7] = new Pieza(Color.Negra);
		}
		if (numTablero == 3) {
			this.tablero = new Pieza[8][8];
			this.tablero[0][3] = new Pieza(Color.Blanca);
			this.tablero[1][3] = new Pieza(Color.Blanca);
			
			this.tablero[2][3] = new Pieza(Color.Blanca);
			this.tablero[3][3] = new Pieza(Color.Blanca);//objetivo
			
			this.tablero[4][3] = new Pieza(Color.Negra);
			this.tablero[5][3] = new Pieza(Color.Negra);
			this.tablero[6][3] = new Pieza(Color.Negra);
			this.tablero[7][3] = new Pieza(Color.Negra);
			
			this.tablero[3][4] = new Pieza(Color.Negra);
			this.tablero[3][5] = new Pieza(Color.Negra);
			this.tablero[3][6] = new Pieza(Color.Negra);
			this.tablero[3][7] = new Pieza(Color.Negra);
			
			this.tablero[3][2] = new Pieza(Color.Blanca);
			this.tablero[3][1] = new Pieza(Color.Blanca);
			
			this.tablero[4][2] = new Pieza(Color.Blanca);
			this.tablero[5][1] = new Pieza(Color.Blanca);
			this.tablero[6][0] = new Pieza(Color.Blanca);
			
			this.tablero[4][4] = new Pieza(Color.Blanca);
			this.tablero[5][5] = new Pieza(Color.Blanca);
			this.tablero[6][6] = new Pieza(Color.Blanca);
			this.tablero[7][7] = new Pieza(Color.Blanca);
			
			this.tablero[2][2] = new Pieza(Color.Blanca);
			this.tablero[1][1] = new Pieza(Color.Blanca);
			
			this.tablero[2][4] = new Pieza(Color.Blanca);
			this.tablero[1][5] = new Pieza(Color.Blanca);
			this.tablero[0][6] = new Pieza(Color.Blanca);
		}
	}

}
