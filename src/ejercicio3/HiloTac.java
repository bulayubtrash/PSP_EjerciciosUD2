package ejercicio3;

public class HiloTac extends Thread {

	public void run() {
		while (true) {
			System.out.println("TAC");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
