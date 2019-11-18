package juego;

public class Othello{
	
	private static Juego othello = new Juego(); 
	static int jugadorActual = 0;
	private static int x;
	private static int y;
	static EntradaTeclado input = new EntradaTeclado();
	private boolean check = true;
	private static boolean jugadasPosibles = true;
	
	public static void main(String[] args) {
		jugar();

	}
	public Othello() {
		
	}

	public static void jugar() {
		System.out.println("------------Juego Othello------------#");
		
		int blancas = othello.getTablero().getBlancasTotal();
		int negras = othello.getTablero().getNegrasTotal();
		Color color;
		//System.out.println("Piezas negras: "+negras+" Piezas blancas: "+blancas);
		System.out.println("");
		System.out.println(othello.getTablero());
		Jugador jugActual;
		
		while (othello.getTablero().isFull() == false) {
			jugActual = othello.getJugador(jugadorActual);
			color = jugActual.getColor().equals(Color.Negra) 
					? Color.Negra : Color.Blanca;
			
			System.out.println("Turno del Jugador: "+(jugadorActual+1) +
					" ("+color+")");
			System.out.println("Fila:");

			x = input.coordenadasEnteras(color);
			while(x==-1) {
				System.out.println("Fila:");
				x = input.coordenadasEnteras(color);
			}
			
			System.out.println("Columna:");

			y = input.coordenadasEnteras(color);
			while(y==-1) {
				System.out.println("Columna:");
				y = input.coordenadasEnteras(color);
			}

			boolean pieza = othello.getTablero().colocarPieza(x-1, y-1, color);
			
			while(pieza == false) {
				System.out.println("No se puede colocar en esa posicion!");
				x = input.coordenadasEnteras(color);
				while(x==-1) {
					System.out.println("Fila:");
					x = input.coordenadasEnteras(color);
				}
				
				System.out.print("Columna: ");
				y = input.coordenadasEnteras(color);
				while(y==-1) {
					System.out.println("Columna:");
					y = input.coordenadasEnteras(color);
				}
				pieza = othello.getTablero().colocarPieza(x-1, y-1, color);
			}
			
			pasarTurno();
			blancas = othello.getTablero().getBlancasTotal();
			negras = othello.getTablero().getNegrasTotal();
			System.out.println("Piezas negras: "+negras+" -  Piezas blancas: "
			+blancas);
			System.out.println("");
			System.out.println(othello.getTablero());
		}
		
		if (blancas < negras) {System.out.println("ganan negras");}
		else if (negras < blancas) { System.out.println("ganan blancas");}
		else {
			System.out.println("empate");
		}
	}
	
	public static void setInput(EntradaTeclado input) {
		Othello.input = input;
	}

	private static void pasarTurno() {
		jugadorActual += 1;
		if (jugadorActual > 1) { jugadorActual = 0; }
	}
	
//	public int pasarTurno(int jugadorActual) {
//		
//		for (int i = 0; i < othello.getTablero().getTablero().length; i++) {
//			for (int j = 0; j < othello.getTablero().getTablero().length; j++) {
//				if(othello.getTablero().getTablero()[i][j]==null) {
//					if(othello.getTablero().wrapperCheckColocarPieza(i, j, 
//							othello.getJugador(jugadorActual).getColor(), false)) {
//						jugadorActual += 1;
//						if (jugadorActual > 1) { jugadorActual = 0; }
//						check = true;
//					}
//				}
//			}
//		}
//		
//		if (check == false) {
//			jugadasPosibles = false;
//		}
//		
//		if (check == true) {
//		check = false;
//		}
//		
//		return jugadorActual;
//	}
	
}