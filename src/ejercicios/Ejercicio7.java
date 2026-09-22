package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		System.out.println("Introduzca su nombre: ");
			Scanner sc = new Scanner(System.in);
			String nombre;
			nombre = sc.next();
		System.out.println("Introduzca direccion: ");
			String direccion;
			direccion=sc.next();
		System.out.println("Introduzca su telefono");
			int telefono;
			telefono=sc.nextInt();
		System.out.println("Nombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono);
		sc.close();
	}
}
