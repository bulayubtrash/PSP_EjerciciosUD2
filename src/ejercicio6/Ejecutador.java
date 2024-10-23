package ejercicio6;

public class Ejecutador {
	public static void main(String[] args) {
		Pares p= new Pares();
		Impares i= new Impares();
		
		p.start();
		new Thread(i).start();
	}

}
