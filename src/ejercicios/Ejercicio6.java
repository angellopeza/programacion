package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		System.out.println("Introduce el primer numero: ");
			Scanner sc = new Scanner(System.in);
			int primer;
			primer =sc.nextInt();
			
		System.out.println("Introduce el segundo numero: ");
			int segun;
			segun =sc.nextInt();
		System.out.println("Suma: "+ (primer+segun) + " \nResta: "+(primer-segun) + " \nMultiplicacion: " +(primer*segun) + " \nDivision: "+(primer/segun));
			sc.close();
		
	}
}
