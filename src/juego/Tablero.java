package juego;
/*
 * 
 * @author Adonis Gonzalez
 * @author Jonatan Luzon
 * 
 * Test i Qualitat del Software
 * 
 */

public class Tablero {
	protected Pieza [][] tablero;
	private int blancasTotal; 
	private int negrasTotal; 
	
	/*
	 * constrcutor tablero
	 */
	public Tablero() {		
		this.tablero = new Pieza[8][8];
		this.tablero[3][3] = new Pieza(Color.Blanca);
		this.tablero[3][4] = new Pieza(Color.Negra);
		this.tablero[4][3] = new Pieza(Color.Negra);
		this.tablero[4][4] = new Pieza(Color.Blanca);
	}
	
	/*
	 * return: la representancion de teablero
	 * y las piezas en su posicion correspondiente
	 * 
	 */
	@Override
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
	
	/*
	 * coloca la pieza en el tablero
	 */
	public boolean colocarPieza(int fila, int columna, Color color) {
		boolean girar = true;
		boolean blnPiezaColocada = false;
		
		if (checkColocarPieza(fila, columna, color, !girar) == true){
			this.tablero[fila][columna] = new Pieza(color);
			blnPiezaColocada = checkColocarPieza(fila, columna, color, girar);
			updateScore();
			return blnPiezaColocada;
			
		}
		else {
			return blnPiezaColocada;
			
		}
		
		
	}
	
	/*
	 * asegura antes de colocar una pieza que exista otra junto a 
	 * las coordenadas dadaas
	 */
	private boolean piezaJuntoApieza(int fila, int columna) {
		boolean piezasJuntas = false;
		
		if (checkLimites(fila, columna) == true ) {
			
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
			
			if (fila+1 <= 7 &&columna+1 <= 7 && tablero[fila+1][columna+1] != null) {
				piezasJuntas = true;
			}
			
			if (fila-1 >= 0 &&columna-1 >= 0 && tablero[fila-1][columna-1] != null) {
				piezasJuntas = true;
			}
			
			if (fila+1 <=7 &&columna-1 >= 0 && tablero[fila+1][columna-1] != null) {
				piezasJuntas = true;
			}
			
			if (fila-1 >= 0 &&columna+1 <= 7 && tablero[fila-1][columna+1] != null) {
				piezasJuntas = true;
			}
		}
		return piezasJuntas;
	}
	
	public boolean wrapperPiezaJuntoApieza(int fila, int columna) {
		return piezaJuntoApieza(fila, columna);
	}
	
	/*
	 *esta funcion se encarga de colocar la pieza y de girar 
	 *el resto de piezas que correspondan.
	 */
	private boolean checkColocarPieza(int fila, int columna, Color color,
			boolean girar) {	
		boolean blnFlag = false;
		boolean piezaJuntas = piezaJuntoApieza(fila, columna);
		
		if(piezaJuntas == true /*&& checkLimites(fila, columna) == true*/) {
			//Arriba
			if(checkLimites(fila-1, columna)==true
					&& this.tablero[fila-1][columna] != null){
				if(this.tablero[fila-1][columna].getColor() != color)  {
					blnFlag = true;
				}
			}
			//Abajo	
		    if(checkLimites(fila+1, columna)==true
		    		&& this.tablero[fila+1][columna] != null ) {
				if(this.tablero[fila+1][columna].getColor() != color)  {
					blnFlag = true;
				}
		    }
			//Izquierda
		    if(checkLimites(fila, columna-1) == true
		    	&& this.tablero[fila][columna-1] != null) {
		 
				if(this.tablero[fila][columna-1].getColor() != color)  {
					blnFlag = true;
				}
		    }
		    //Derecha
		    if(checkLimites(fila, columna+1)==true
		       && this.tablero[fila][columna+1] != null) {
				if(this.tablero[fila][columna+1].getColor() != color)  {
					blnFlag = true;
				}
			}
		    //AbajoIzquierda
		    if(checkLimites(fila+1, columna-1)==true
		    	&& this.tablero[fila+1][columna-1] != null){
		    	
				if(this.tablero[fila+1][columna-1].getColor() != color)  {
					blnFlag = true;
				}
			}
		    //AbajoDerecha
		    if(checkLimites(fila+1, columna+1)==true
		    		&& this.tablero[fila+1][columna+1] != null) {
				if(this.tablero[fila+1][columna+1].getColor() != color)  {
					blnFlag = true;
				}
			}
		    //ArribaIzquierda
		    if(checkLimites(fila-1, columna-1)==true
		    		&& this.tablero[fila-1][columna-1] != null) {
				if(this.tablero[fila-1][columna-1].getColor() != color)  {
					blnFlag = true;
				}
			}
		    //ArribaDerecha
		    if(checkLimites(fila-1, columna+1)==true
		    		&& this.tablero[fila-1][columna+1] != null) {
				if(this.tablero[fila-1][columna+1].getColor() != color)  {
					blnFlag = true;
				}
			}
		}
		
		if (blnFlag) {
			int casillas [] = new int[8];
			casillas[0] = checkLines(fila-1, columna, color, 
					Direccion.arriba, girar);
			casillas[1] = checkLines(fila+1, columna, color, 
					Direccion.abajo, girar);
			casillas[2] = checkLines(fila, columna-1, color, 
					Direccion.izquierda, girar);
			casillas[3] = checkLines(fila, columna+1, color, 
					Direccion.derecha, girar);
			casillas[4] = checkLines(fila-1, columna-1, color, 
					Direccion.arribaIzquierda, girar);
			casillas[5] = checkLines(fila-1, columna+1, color, 
					Direccion.arribaDerecha, girar);
			casillas[6] = checkLines(fila+1, columna-1, color, 
					Direccion.abajoIzquierda, girar);
			casillas[7] = checkLines(fila+1, columna+1, color, 
					Direccion.abajoDerecha, girar);
			
			int check = 0;
			for (int casilla : casillas) {
				if (casilla >0) {
					
					check =+ casilla;
				}
			}
			if (check <= 0) {
				blnFlag = false;
			}
			else {
				blnFlag = true;
			}
		}

		return blnFlag;
	}
	
	public boolean wrapperCheckColocarPieza(int fila, int columna, Color color,
			boolean girar){
		return checkColocarPieza(fila, columna, color, girar);
	}
	
	/*
	 * funcion recursiva encargada de comprobar si al final de alguna de las 
	 * lineas que salen de la pieza (horizontal, vertical y las dos diagonales) 
	 * se encontraba una pieza del mismo color que la colocada.
	 * 
	 * @return un int con el numero de posiciones hasta la pieza.
	 */
	private int checkLines(int fila, int columna, Color color, Direccion dir, 
			boolean girar) {
		int row = 0;
		int col = 0;
		switch(dir) {
		case arriba:
			row = -1;
			break;
		case abajo:
			row = 1;
			break;
		case izquierda:
			col = -1;
			break;
		case derecha:
			col = 1;
			break;
		case arribaIzquierda:
			row = -1;
			col = -1;
			break;
		case arribaDerecha:
			row = -1;
			col = +1;
			break;
		case abajoIzquierda:
			row = +1;
			col = -1;
			break;
		case abajoDerecha:
			row = +1;
			col = +1;
			break;
		}
		
		if (!checkLimites(fila, columna) || this.tablero[fila][columna] == null) {
			return -1;
		}
		
		if (this.tablero[fila][columna].getColor() == color) {
			return 0;
		}
		
		int check = checkLines(fila + row, columna + col, color, dir, girar);
		if (check<0) {
			return -1;
		}
		if (girar == true) {
			this.tablero[fila][columna].girarPieza();
		}
		
		return check+1;
		
	}
	
	public int wrapperCheckLines(int fila, int columna, Color color, Direccion 
			dir, boolean girar) {
		return checkLines(fila, columna, color, dir, girar);
		
	}
	
	/*
	 * funcion se encarga de asegurar que la pieza sera introducida dentro 
	 * de los limites del Tablero, en el caso del Othello en un Tablero.
	 */
	private boolean checkLimites(int fila, int columna) {
		return fila >= 0 && fila <= 7 && columna >= 0 && columna <= 7;
	}
	
	public boolean wrappercheckLimites(int fila, int columna) {
		return checkLimites(fila, columna);
	}
	
	/*
	 * Se encarga de actualizar la puntuacion. 
	 * Recorre el tablero contando las piezas blancas y negras que hay.
	 */
	public void updateScore(){
		negrasTotal = 0;
		blancasTotal = 0;
		for (int i = 0; i<this.tablero.length; i++) {
			for (int j = 0; j<this.tablero.length; j++) {
				
				if (this.tablero[i][j] !=null) {
					if (this.tablero[i][j].getColor()== Color.Negra){
					negrasTotal = negrasTotal+1;
	
					}
					if (this.tablero[i][j].getColor()== Color.Blanca){
						blancasTotal = blancasTotal+1;
					}
			  }
			}
		}
			
	}
	
	public int getBlancasTotal() {
		return blancasTotal;
	}


	public int getNegrasTotal() {
		return negrasTotal;
	}

	public boolean isFull() {
		return this.blancasTotal + this.negrasTotal == 64;
	}
			
}