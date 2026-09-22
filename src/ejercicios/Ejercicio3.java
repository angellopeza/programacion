package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("Introduzca su año de nacimiento: ");
			Scanner sc = new Scanner(System.in);
			int nacimiento;
			nacimiento=sc.nextInt();
		System.out.println("Introduzca su año actual: ");
			int actual;
			actual=sc.nextInt();
		System.out.println("Usted tiene: " + (actual - nacimiento) + " años de edad.");
		sc.close();
	}
}
