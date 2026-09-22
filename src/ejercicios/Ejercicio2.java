package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("introduce tu edad: ");
		Scanner sc = new Scanner(System.in);
			int edad;
		edad = sc.nextInt();
		System.out.println("Tu edad el año que viene será: " + (edad = edad+1) );
		sc.close();
	}
	
}
