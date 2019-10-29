package juego;

public class Tablero {
	private Pieza [][] tablero;
	
	public Tablero() {
		this.tablero = new Pieza[8][8];
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

				}
			}
			frame += "\n";
		}
		
		return frame;
	}
	
}
