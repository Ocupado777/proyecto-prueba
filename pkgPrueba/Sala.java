package pkgPrueba;

public class Sala {
	private int numero;
	private boolean[][] asientos;
	
	
	public Sala(int numero, int filas, int columnas) {
		this.numero = numero;
	    this.asientos = new boolean[filas][columnas];
	    
	}
	
	public boolean[][] getAsientos() { return asientos; }
	public int getNumero() { return numero; 
	
	}
	
	public boolean reservarAsiento(int fila, int columna) {
		if (!asientos[fila][columna]) {
			asientos[fila][columna] = true;
			return true;
			
		
		}
	        return false;
	    }
	
	}
