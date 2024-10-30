package ejercicio10;

public class Estaciones extends Thread {
	private String[] estaciones= {"Primavera","Verano","Invierno","Otoño"};

	private String estacion;
	
    public void run() {
        if (estacion.equalsIgnoreCase("invierno")) {
            System.out.println("Diciembre, enero, febrero");
        } else if (estacion.equalsIgnoreCase("primavera")) {
            System.out.println("Marzo, abril, mayo");
        } else if (estacion.equalsIgnoreCase("verano")) {
            System.out.println("Junio, julio, agosto");
        } else if (estacion.equalsIgnoreCase("otoño")) {
            System.out.println("Septiembre, octubre, noviembre");
        } else {
            System.out.println("Estación no reconocida: " + estacion);
        }
    }



	
	public Estaciones(String estacion) {
		super();
		this.estacion = estacion;
	}

	public String[] getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(String[] estaciones) {
		this.estaciones = estaciones;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}
	
	
	
	

}
