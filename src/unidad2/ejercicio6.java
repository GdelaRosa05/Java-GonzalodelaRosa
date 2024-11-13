package unidad2;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// Declaramos variables
		int num1 = 0, num2 = 0, result = 0, contador = 0;

		// Creamos una entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Pedimos por teclado que introduzcan los números
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el resultado: ");
		result = teclado.nextInt();

		// Ponemos las condiciones
		if ((num1 + num2) == result) {
			System.out.println("Se ha realizado la suma: " + num1 + " + " + num2 + " = " + result);
			contador++;
		}
		if ((num1 - num2) == result) {
			System.out.println("Se ha realizado la resta: " + num1 + " - " + num2 + " = " + result);
			contador++;
		}
		if ((num1 * num2) == result) {
			System.out.println("Se ha realizado la multiplicación: " + num1 + " x " + num2 + " = " + result);
			contador++;
		}
		if ((num1 / num2) == result) {
			System.out.println("Se ha realizado la división: " + num1 + " / " + num2 + " = " + result);
			contador++;
		}
		if ((num1 % num2) == result) {
			System.out.println("Se ha realizado el módulo: " + num1 + " % " + num2 + " = " + result);
			contador++;
		}
		if ((Math.sqrt(num1)) == result) {
			System.out.println("Se ha realizado la raíz cuadradada: " + num1 + " = " + result);
			contador++;
		}
		if ((Math.pow(num1, 2)) == result) {
			System.out.println("Se ha realizado la potencia: " + num1 + " ^2 " + " = " + result);
			contador++;
		}
		if (contador == 0) {
			System.out.println("Es una operación indefinida");
		}

		// Cerramos la entrada de teclado
		teclado.close();

	}
}
