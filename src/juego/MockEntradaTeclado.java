package juego;


import java.util.ArrayList;
import java.util.Stack;


public class MockEntradaTeclado extends EntradaTeclado {
	
	
	ArrayList<Integer> coordenadas = new ArrayList<>();
	
	Stack<String> coordenadasError = new Stack<String>();

	int aux = 0;
	int aux2 = 0;
	
	public MockEntradaTeclado() {
		
		coordenadas.add(-1);
		coordenadas.add(-1);
		
		coordenadas.add(-2);
		coordenadas.add(80);
		
		coordenadas.add(6);
		coordenadas.add(5);
		
		coordenadas.add(4);
		coordenadas.add(6);
		
		coordenadas.add(3);
		coordenadas.add(4);
		
		coordenadas.add(4);
		coordenadas.add(3);
		
		coordenadas.add(3);
		coordenadas.add(3);
		
		coordenadas.add(6);
		coordenadas.add(4);
		coordenadas.add(5);
		coordenadas.add(6);
		coordenadas.add(6);
		coordenadas.add(6);
		coordenadas.add(5);
		coordenadas.add(3);
		coordenadas.add(3);
		coordenadas.add(5);
		coordenadas.add(3);
		coordenadas.add(6);
		coordenadas.add(2);
		coordenadas.add(4);
		coordenadas.add(7);
		coordenadas.add(6);
		coordenadas.add(5);
		coordenadas.add(7);
		coordenadas.add(5);
		coordenadas.add(8);
		coordenadas.add(8);
		coordenadas.add(6);
		coordenadas.add(1);
		coordenadas.add(4);
		coordenadas.add(6);
		coordenadas.add(8);
		coordenadas.add(4);
		coordenadas.add(7);
		coordenadas.add(4);
		coordenadas.add(8);
		coordenadas.add(2);
		coordenadas.add(5);
		coordenadas.add(1);
		coordenadas.add(3);
		coordenadas.add(1);
		coordenadas.add(2);
		coordenadas.add(1);
		coordenadas.add(5);
		coordenadas.add(1);
		coordenadas.add(6);
		coordenadas.add(7);
		coordenadas.add(5);
		coordenadas.add(8);
		coordenadas.add(5);
		coordenadas.add(8);
		coordenadas.add(4);
		coordenadas.add(2);
		coordenadas.add(3);
		coordenadas.add(3);
		coordenadas.add(2);
		coordenadas.add(7);
		coordenadas.add(4);
		coordenadas.add(6);
		coordenadas.add(3);
		coordenadas.add(7);
		coordenadas.add(3);
		coordenadas.add(3);
		coordenadas.add(8);
		coordenadas.add(3);
		coordenadas.add(1);
		coordenadas.add(8);
		coordenadas.add(2);
		coordenadas.add(8);
		coordenadas.add(3);
		coordenadas.add(2);
		coordenadas.add(1);
		coordenadas.add(1);
		coordenadas.add(1);
		coordenadas.add(5);
		coordenadas.add(2);
		coordenadas.add(8);
		coordenadas.add(1);
		coordenadas.add(3);
		coordenadas.add(7);
		coordenadas.add(7);
		coordenadas.add(2);
		coordenadas.add(7);
		coordenadas.add(1);
		coordenadas.add(6);
		coordenadas.add(1);
		coordenadas.add(5);
		coordenadas.add(1);
		coordenadas.add(4);
		coordenadas.add(1);
		coordenadas.add(4);
		coordenadas.add(2);
		coordenadas.add(8);
		coordenadas.add(7);
		coordenadas.add(6);
		coordenadas.add(2);
		coordenadas.add(2);
		coordenadas.add(6);
		coordenadas.add(6);
		coordenadas.add(7);
		coordenadas.add(2);
		coordenadas.add(2);
		coordenadas.add(7);
		coordenadas.add(7);
		coordenadas.add(8);
		coordenadas.add(8);
		coordenadas.add(7);
		coordenadas.add(8);
		coordenadas.add(2);
		coordenadas.add(8);
		coordenadas.add(2);
		coordenadas.add(7);
		coordenadas.add(1);
		coordenadas.add(7);
		coordenadas.add(1);
		coordenadas.add(8);
	}
	

	@Override
	public int coordenadasEnteras(Color color ){
		if (color == Color.Blanca) {

			aux2 = coordenadas.get(0);
			coordenadas.remove(0);
			System.err.println(aux2);
			return aux2;
			
		}
		else {
			aux = coordenadas.get(0);
			coordenadas.remove(0);
			System.err.println(aux);
			return aux;
		}

	}

}

	

