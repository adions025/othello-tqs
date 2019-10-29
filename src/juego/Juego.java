package juego;

public class Juego {

	private static Tablero tablero;
	private static Jugador[] jugadores;
	

	public Juego() {
		this.tablero = new Tablero();
		this.jugadores = new Jugador[2];
		this.jugadores[0] = new Jugador(Color.Negra);
		this.jugadores[1] = new Jugador(Color.Blanca);
	}
	
	
	public static Tablero getTablero() {
		return tablero;
	}


	public static Jugador getJugador(int jugador) {
		return jugadores[jugador];
	}
}
