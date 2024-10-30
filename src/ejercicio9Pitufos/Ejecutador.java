package ejercicio9Pitufos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutador {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pitufos p;
		String nombre;
		System.out.println("Introduce los nombres de los pitufos");
		ArrayList<String> a1= new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a1.add(nombre=sc.nextLine());
		}
		
		for (String string : a1) {
			p= new Pitufos(string);	
			p.start();

		}
	}
}
