package ejercicio10;

import java.util.Scanner;

public class Ejecutador {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce una estacion");
		String estacion=sc.nextLine();
		Estaciones e= new Estaciones(estacion);
		e.start();
	}

}
