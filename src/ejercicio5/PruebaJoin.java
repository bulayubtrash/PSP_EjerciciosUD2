package ejercicio5;

public class PruebaJoin {

	public static void main(String[] args) {
		HiloJoin h = new HiloJoin(1);
		HiloJoin h1 = new HiloJoin(2);
		HiloJoin h2 = new HiloJoin(3);
		HiloJoin h3 = new HiloJoin(4);
		HiloJoin h4 = new HiloJoin(5);

		try {
			h.start();
			h.join();

			h1.start();
			h1.join();

			h2.start();
			h2.join();

			h3.start();
			h3.join();

			h4.start();
			h4.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("todos los hilos creados");

	}
}
