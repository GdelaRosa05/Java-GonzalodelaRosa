package unidad1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos la entrada del teclado
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos las variables
		int a, b, c;
		double resultado1, resultado2;
		
		//Pedimos al usuario que de los valores de a, b y c
		System.out.println("Dale un valor a la a: ");
		a = teclado.nextInt();
		System.out.println("Dale un valor a la b: ");
		b = teclado.nextInt();
		System.out.println("Dale un valor a la c: ");
		c = teclado.nextInt();
		
		resultado1 = ((b*(-1))+(Math.sqrt((b*b)-4*a*c)))/(2*a);
		resultado2 = ((b*(-1))-(Math.sqrt((b*b)-4*a*c)))/(2*a);
		
		System.out.println("El resultado de la ecuación de segundo grado es " + resultado1 + ", " + resultado2);
		
		//Cerramos la entrada del teclado
		teclado.close();
	}

}
