
public class Pieza {
	private boolean color;
	public Pieza (boolean color) {
		this.color = color;
	}
	
	public boolean isColor() {
		return color;
	}
	
	private void girarPieza() {
		if(this.color == false) {
			this.color = true;
		} else {
			this.color = false;
		}
	}
}
