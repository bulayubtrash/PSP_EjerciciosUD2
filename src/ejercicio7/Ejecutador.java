package ejercicio7;

import java.util.Scanner;

public class Ejecutador {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int base;
		int altura;
		Area a;
		for (int i = 0; i < 10; i++) {
			a=new Area(base=sc.nextInt(),altura=sc.nextInt());
			a.start();
			
		}
	}
}
