package ejercicio2;

public class HiloC extends Thread{
	private int c;
	
	public void run() {
		for (int i = 1; i <= 5; i++) {		
			System.out.println("Hilo "+c+" linea "+i);			
		}
	}

	public HiloC(int c) {
		super();
		this.c = c;
		System.out.println("creando hilo "+c);
	}

	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	
}
