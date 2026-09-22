package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		System.out.println("Introduzca el radio: ");
			Scanner sc = new Scanner(System.in);
			double radio;
			radio=sc.nextDouble();
	
			double longitud = ((2*Math.PI)*radio);
			double area = (Math.PI*(radio*radio));
			
		System.out.println("La longitud de la circunferencia es: " + longitud + " y el area es: " + area);
			sc.close();
	}
}
