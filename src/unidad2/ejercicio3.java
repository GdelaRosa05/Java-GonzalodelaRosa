package unidad2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Creamos la entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Declaramos variables de los 3 números
		int num1 = 0, num2 = 0, num3 = 0;

		// Pedimos los 3 números por consola
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3 = teclado.nextInt();

		// Hacemos la condición para que los ordene de mayor
		if (num3 < num2 && num3 < num1) {
			System.out.println("El número más pequeño de los tres es el " + num3);
		} else if (num2 < num3 && num2 < num1) {
			System.out.println("El número más pequeño de los tres es el " + num2);
		} else if (num1 < num2 && num1 < num3) {
			System.out.println("El número más pequeño de los tres es el " + num1);
		}

		// Cerramos la entrada del teclado
		teclado.close();

	}

}
