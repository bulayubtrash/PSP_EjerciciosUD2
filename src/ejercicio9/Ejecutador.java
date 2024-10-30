package ejercicio9;

import java.util.Scanner;

public class Ejecutador {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce 2 numers");
		int n1= sc.nextInt();
		int n2=sc.nextInt();
		Intervalo i= new Intervalo(n1, n2);
		
		i.start();
	}

}
