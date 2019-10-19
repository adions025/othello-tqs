
public class Juego {

	private static Tablero tablero;
	private static Jugador[] jugadores;
	

	public Juego() {
		tablero = new Tablero();
		jugadores = new Jugador[2];
		jugadores[0] = new Jugador(true);
		jugadores[1] = new Jugador(false);
	}
	
	
	public static Tablero getTablero() {
		return tablero;
	}


	public static Jugador getJugadores(int jugador) {
		return jugadores[jugador];
	}
}
