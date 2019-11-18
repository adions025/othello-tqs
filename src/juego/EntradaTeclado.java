package juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaTeclado {

	Scanner input = new Scanner(System.in);
	
	
	public EntradaTeclado() {
		
	}
	
	/*
	 * gestiona la entrada de coordenadas por teclado
	 * del usuario.
	 */
	public int coordenadasEnteras(Color color) {
		try {
			int cin = input.nextInt();
			return cin;
		} catch (InputMismatchException ime) {
			 System.out.println("Solo se puede introducir enteros");
			 input.next();
			 return -1;
		}
	}

}


