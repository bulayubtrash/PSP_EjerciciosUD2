package ejercicio9Pitufos;

public class Pitufos extends Thread {

	private String nombre;

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(nombre + " come un " + i + "º pan con queso");
		}

		System.out.println(nombre+" termino");
	}

	public Pitufos(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
