package juego;

public class Jugador {
	
	private Color color;
	
	
	public Jugador(Color c) {
		this.color = c;
		
	}

	public Color getColor() {
		return color;
	}

	public Boolean ponerPieza(int fila, int columna) {
		if((Juego.getTablero().getTablero()[fila][columna] == null) || 
				(fila < 0 || fila > 7) || (columna < 0 || columna > 7)) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
