package ejercicio4;

public class VariosHilos {

	public static void main(String[] args) {
		HiloC h;
		for (int i = 1; i <= 5; i++) {
			h = new HiloC(i);
			new Thread(h).start();
		}
		
		System.out.println("todos los hilos creados");

	}
}
