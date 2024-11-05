package unidad2;

import java.util.Scanner;

public class ejercicio3_1 {

	public static void main(String[] args) {
		// Creamos la entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Declaramos variables de los 3 números
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int result1 = 0, result2 = 0;

		// Pedimos los 3 números por consola
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3 = teclado.nextInt();
		System.out.println("Introduce el cuarto número: ");
		num4 = teclado.nextInt();

		// Hacemos la condición para que los ordene de mayor
		if (num1 > num2 && num2 > num3 && num2 > num4) {
			System.out.println("Los dos números más grandes son el " + num1 + " y el " + num2);

			result1 = num1;
			result2 = num2;
		} else if (num2 > num1 && num1 > num3 && num1 > num4) {
			System.out.println("Los dos números más grandes son el " + num2 + " y el " + num1);

			result1 = num2;
			result2 = num1;
		} else if (num1 > num3 && num3 > num2 && num3 > num4) {
			System.out.println("Los dos números más grandes son el " + num1 + " y el " + num3);

			result1 = num1;
			result2 = num3;
		} else if (num3 > num1 && num1 > num2 && num1 > num4) {
			System.out.println("Los dos números más grandes son el " + num3 + " y el " + num1);

			result1 = num3;
			result2 = num1;
		} else if (num1 > num4 && num4 > num2 && num4 > num3) {
			System.out.println("Los dos números más grandes son el " + num1 + " y el " + num4);

			result1 = num1;
			result2 = num4;
		} else if (num4 > num1 && num1 > num2 && num1 > num3) {
			System.out.println("Los dos números más grandes son el " + num4 + " y el " + num1);

			result1 = num4;
			result2 = num1;
		} else if (num2 > num3 && num3 > num1 && num3 > num4) {
			System.out.println("Los dos números más grandes son el " + num2 + " y el " + num3);

			result1 = num2;
			result2 = num3;
		} else if (num3 > num2 && num2 > num1 && num2 > num4) {
			System.out.println("Los dos números más grandes son el " + num3 + " y el " + num2);

			result1 = num3;
			result2 = num2;
		} else if (num2 > num4 && num4 > num3 && num4 > num1) {
			System.out.println("Los dos números más grandes son el " + num2 + " y el " + num4);

			result1 = num2;
			result2 = num4;
		} else if (num4 > num2 && num2 > num3 && num2 > num1) {
			System.out.println("Los dos números más grandes son el " + num4 + " y el " + num2);

			result1 = num4;
			result2 = num2;
		} else if (num3 > num4 && num4 > num2 && num4 > num1) {
			System.out.println("Los dos números más grandes son el " + num3 + " y el " + num4);

			result1 = num3;
			result2 = num4;
		} else if (num4 > num3 && num3 > num2 && num3 > num1) {
			System.out.println("Los dos números más grandes son el " + num4 + " y el " + num3);

			result1 = num4;
			result2 = num3;
		}

		if (result2 % 2 == 0) {
			System.out.println("El número " + result2 + "es par");
		} else {
			System.out.println("El número " + result2 + "es impar");
		}

		if (result2 % 2 == 0) {
			System.out.println("El número " + result2 + " es par");
		} else {
			System.out.println("El número " + result2 + " es impar");
		}

		// Cerramos la entrada del teclado
		teclado.close();

	}

}
