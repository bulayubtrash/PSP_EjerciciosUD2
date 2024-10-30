package ejercicio9;


public class Intervalo extends Thread {
	private int n1;
	private int n2;
	public void run() {
		
		for (int i = n1; i <= n2; i++) {
			System.out.println(n1);
			n1++;
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public Intervalo(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	

}
