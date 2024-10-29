package ejercicio7;

public class Area extends Thread {
	private int base;
	private int altura;
	
	public void run() {
		System.out.println("El area de este triangulo es "+(base*altura)/2);
	}
	public Area(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

}
