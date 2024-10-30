package ejercicio8;

public class Fichaje extends Thread{
	private String nombre;
	private double hora;
	
	public void run() {
		
		if(getHora()>9) {
			System.out.println(nombre+" LLegas tarde");
		}else {
			System.out.println(nombre+" Llegas a tiempo");
		}
		
	}

	public Fichaje(String nombre, double hora) {
		super();
		this.nombre = nombre;
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}
	
	
	

}
