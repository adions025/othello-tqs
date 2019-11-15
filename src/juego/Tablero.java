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
	
	public Tablero(int numTablero) {
		
		if (numTablero == 1) {
			this.tablero = new Pieza[8][8];
			this.tablero[0][3] = new Pieza(Color.Blanca);
			this.tablero[1][3] = new Pieza(Color.Negra);
			this.tablero[2][3] = new Pieza(Color.Negra);
			//this.tablero[3][3] = new Pieza(Color.Blanca);//objetivo
			this.tablero[4][3] = new Pieza(Color.Negra);
			this.tablero[5][3] = new Pieza(Color.Negra);
			this.tablero[6][3] = new Pieza(Color.Negra);
			this.tablero[7][3] = new Pieza(Color.Negra);
			
			this.tablero[3][4] = new Pieza(Color.Negra);
			this.tablero[3][5] = new Pieza(Color.Negra);
			this.tablero[3][6] = new Pieza(Color.Negra);
			this.tablero[3][7] = new Pieza(Color.Negra);
			
			this.tablero[3][2] = new Pieza(Color.Negra);
			this.tablero[3][1] = new Pieza(Color.Blanca);
			
			this.tablero[4][2] = new Pieza(Color.Negra);
			this.tablero[5][1] = new Pieza(Color.Negra);
			this.tablero[6][0] = new Pieza(Color.Blanca);
			
			this.tablero[4][4] = new Pieza(Color.Negra);
			this.tablero[5][5] = new Pieza(Color.Negra);
			this.tablero[6][6] = new Pieza(Color.Negra);
			this.tablero[7][7] = new Pieza(Color.Blanca);
			
			this.tablero[2][2] = new Pieza(Color.Negra);
			this.tablero[1][1] = new Pieza(Color.Blanca);
			
			this.tablero[2][4] = new Pieza(Color.Negra);
			this.tablero[1][5] = new Pieza(Color.Negra);
			this.tablero[0][6] = new Pieza(Color.Blanca);
		}
		
		if (numTablero == 2) {
			this.tablero = new Pieza[8][8];
			this.tablero[0][1] = new Pieza(Color.Blanca);
			this.tablero[0][2] = new Pieza(Color.Negra);
			
			this.tablero[1][0] = new Pieza(Color.Blanca);
			this.tablero[2][0] = new Pieza(Color.Blanca);
			this.tablero[3][0] = new Pieza(Color.Blanca);
			this.tablero[4][0] = new Pieza(Color.Blanca);
			this.tablero[5][0] = new Pieza(Color.Blanca);
			this.tablero[6][0] = new Pieza(Color.Negra);
			
			this.tablero[1][1] = new Pieza(Color.Blanca);
			this.tablero[2][2] = new Pieza(Color.Blanca);
			this.tablero[3][3] = new Pieza(Color.Blanca);
			this.tablero[4][4] = new Pieza(Color.Blanca);
			this.tablero[5][5] = new Pieza(Color.Blanca);
			this.tablero[6][6] = new Pieza(Color.Blanca);
			this.tablero[7][7] = new Pieza(Color.Negra);
		}
		if (numTablero == 3) {
			this.tablero = new Pieza[8][8];
			this.tablero[0][3] = new Pieza(Color.Blanca);
			this.tablero[1][3] = new Pieza(Color.Blanca);
			
			this.tablero[2][3] = new Pieza(Color.Blanca);
			this.tablero[3][3] = new Pieza(Color.Blanca);//objetivo
			
			this.tablero[4][3] = new Pieza(Color.Negra);
			this.tablero[5][3] = new Pieza(Color.Negra);
			this.tablero[6][3] = new Pieza(Color.Negra);
			this.tablero[7][3] = new Pieza(Color.Negra);
			
			this.tablero[3][4] = new Pieza(Color.Negra);
			this.tablero[3][5] = new Pieza(Color.Negra);
			this.tablero[3][6] = new Pieza(Color.Negra);
			this.tablero[3][7] = new Pieza(Color.Negra);
			
			this.tablero[3][2] = new Pieza(Color.Blanca);
			this.tablero[3][1] = new Pieza(Color.Blanca);
			
			this.tablero[4][2] = new Pieza(Color.Blanca);
			this.tablero[5][1] = new Pieza(Color.Blanca);
			this.tablero[6][0] = new Pieza(Color.Blanca);
			
			this.tablero[4][4] = new Pieza(Color.Blanca);
			this.tablero[5][5] = new Pieza(Color.Blanca);
			this.tablero[6][6] = new Pieza(Color.Blanca);
			this.tablero[7][7] = new Pieza(Color.Blanca);
			
			this.tablero[2][2] = new Pieza(Color.Blanca);
			this.tablero[1][1] = new Pieza(Color.Blanca);
			
			this.tablero[2][4] = new Pieza(Color.Blanca);
			this.tablero[1][5] = new Pieza(Color.Blanca);
			this.tablero[0][6] = new Pieza(Color.Blanca);
		}

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
		boolean girar = true;
		
		if (checkColocarPieza(fila, columna, color, !girar) == true){
			this.tablero[fila][columna] = new Pieza(color);
			return checkColocarPieza(fila, columna, color, girar);
			
		}
		else {
			return false;
			
		}
		
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
		
		return piezasJuntas;
	}
	
	public boolean wrapperPiezaJuntoApieza(int fila, int columna) {
		return piezaJuntoApieza(fila, columna);
	}
	
	
	private boolean checkColocarPieza(int fila, int columna, Color color,
			boolean girar) {	
		boolean blnFlag = false;
		boolean piezaJuntas = piezaJuntoApieza(fila, columna);
		
		if(piezaJuntas == true && checkLimites(fila, columna) == true) {
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
				System.out.println(casilla);
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
			System.out.println("RETURN -1: " + dir + ". RANGO. row:" + fila + 
					" col:"+columna);
			return -1;
		}
		
		if (this.tablero[fila][columna].getColor() == color) {
			return 0;
		}
		
		int check = checkLines(fila + row, columna + col, color, dir, girar);
		System.out.println("hereAAA" +check);
		if (check<0) {
			System.out.println("RETURN2 -1: " + dir + ". RANGO. row:" + fila + 
					" col:"+columna);
			return -1;
		}
		if (girar == true) {
			this.tablero[fila][columna].girarPieza();
		}
		
		System.out.println("here" +check);
		return check+1;
		
	}
	
	public int wrapperCheckLines(int fila, int columna, Color color, Direccion 
			dir, boolean girar) {
		return checkLines(fila, columna, color, dir, girar);
		
	}
	
	private boolean checkLimites(int fila, int columna) {
		return fila >= 0 && fila <= 7 && columna >= 0 && columna <= 7;
	}
	
	public boolean wrappercheckLimites(int fila, int columna) {
		return checkLimites(fila, columna);
	}
	
	
		
}