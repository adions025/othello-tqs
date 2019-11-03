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
					case Negra: frame += "  N"; break;
					case Blanca: frame += "  B"; break;	
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
		boolean colocarflag;
		
		if (fila <0 || fila>7 || columna<0 || columna>7) {
			colocarflag = false;
		}
		
		else if ((this.tablero[fila][columna] != null ))  {
			colocarflag = false;	
		}
		
		else if ((piezaJuntoApieza(fila, columna) == false)) {
			System.out.println("No se puede colocar una pieza no junta");
			colocarflag = false;
		}
		
		else {
			colocarflag = true;
			this.tablero[fila][columna] = new Pieza(color);
		}
	
		return colocarflag;
	}
	
	
	private boolean piezaJuntoApieza(int fila, int columna) {
		boolean piezasJuntas = false;
		
		if (fila-1 >= 0 && tablero[fila-1][columna] != null) {
			piezasJuntas = true;
		}
		
		if (fila+1 <= 7 && tablero[fila+1][columna] != null) {
			piezasJuntas = true;
		}
		
		if (columna-1 >= 0 && tablero[fila][columna-1] != null) {
			piezasJuntas = true;
		}
		
		if (columna+1 <= 7 && tablero[fila][columna+1] != null) {
			piezasJuntas = true;
		}
		
		return piezasJuntas;
	}
	
	public boolean wrapperPiezaJuntoApieza(int fila, int columna) {
		return piezaJuntoApieza(fila, columna);
	}
	
		
}
