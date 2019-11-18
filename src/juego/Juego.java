package juego;

public class Juego {

	private  Tablero tablero;
	private Jugador[] jugadores;

	public Juego() {
		this.tablero = new Tablero();
		this.jugadores = new Jugador[2];
		this.jugadores[0] = new Jugador(Color.Negra);
		this.jugadores[1] = new Jugador(Color.Blanca);
	}
	
	
	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}


	public Jugador getJugador(int jugador) {
		return jugadores[jugador];
	}
	
	
}
