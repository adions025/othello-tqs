package juego;

public class Tablero {
	private Pieza [][] tablero;
	
	public Tablero() {
		this.tablero = new Pieza[8][8];
		this.tablero[3][3] = new Pieza(Color.Blanca);
		this.tablero[3][4] = new Pieza(Color.Negra);
		this.tablero[4][3] = new Pieza(Color.Negra);
		this.tablero[4][4] = new Pieza(Color.Blanca);
	}
	

	public String toString() 
	{
		String frame = "   1  2  3  4  5  6  7  8\n";
		for (int i = 0; i < tablero.length; i++) {
			frame += ""+(i+1);
			for (int j = 0; j < tablero.length; j++) {
				if (this.tablero[i][j] == null) {
					frame += "  -";
				} 
				else {
					switch (this.tablero[i][j].getColor()) {
					case Negra: frame += " N"; break;
					case Blanca: frame += " B"; break;	
					default:
						frame += "?";
					}

				}
			}
			frame += "\n";
		}
		
		return frame;
	}
	
	
	public Pieza[][] getTablero() {
		return this.tablero;
	}
	
	public boolean colocarPieza(int fila, int columna, Color color) {
		
		this.tablero[fila][columna] = new Pieza(color);
		return true;
	}
		
}
