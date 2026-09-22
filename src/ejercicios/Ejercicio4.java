package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("Introduzca la nota de la asignatura 1: ");
			Scanner sc = new Scanner(System.in);
			int asig1;
			asig1 = sc.nextInt();
		System.out.println("Introduzca la nota de la asignatura 2: ");
			int asig2;
			asig2 = sc.nextInt();
			double media = asig1 + asig2;
		System.out.println("Su media aritmetica es: " + (media/2));	
			sc.close();
	}
}
