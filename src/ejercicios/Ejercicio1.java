package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Introduce tu numero de usuario: ");
			Scanner sc = new Scanner(System.in);
			int usuario;
			usuario = sc.nextInt();
		System.out.println("Su numero de usuario es " + usuario);
			sc.close();
			
	}
	
}