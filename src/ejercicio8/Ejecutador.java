package ejercicio8;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejecutador {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=sc.nextLine();
		LocalTime hora = LocalTime.now().truncatedTo(ChronoUnit.MINUTES); // Trunca a minutos
        double horaD = hora.getHour() + hora.getMinute() / 60.0;
        Fichaje f= new Fichaje(nombre, horaD);
        f.start();
	}

}
