package juego;

public class Pieza {

	private Color color;
	
	public Pieza (Color c) {
		this.color = c;
	}
	
	public void girarPieza() {
		if(this.color == Color.Negra) {
			this.color = Color.Blanca;
		} 
		else {
			this.color = Color.Negra;
		}
	}
	
	public Color getColor() {
		return color;
	}
	
}
