package unidad2;

import java.util.Scanner;

public class ejemploCondicionales4 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa en java que lea dos números y una operación la operación
		 * podrá ser suma, resta, multiplicació, división y potencia se corresponderá a
		 * los carácterees +, -, *, /, ^^
		 */

		// Creamos entrada de teclado
		Scanner teclado = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		double resultado = 0;
		char operacion = ' ';

		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el operador (+, -, *, /, ^): ");
		operacion = teclado.next().charAt(0);

		switch (operacion) {
		case '+': {
			resultado = num1 + num2;
			// El break hace que no ejecute el siguiente case
			// Si no hay break, pasa directamente al siguiente aunque se cumpla el caso
			break;
		}
		case '-': {
			resultado = num1 - num2;
			break;
		}
		case '*': {
			resultado = num1 * num2;
			break;
		}
		case '/': {
			resultado = (double) num1 / num2;
			break;
		}
		case '^': {
			resultado = Math.pow(num1, num2);
			break;
		}
		default: {
			System.out.println("El operador no es válido");
			// El return finaliza la función principal, en este caso el main
			return;
		}
		}

		// Sacamos por pantalla el resultado
		System.out.println("El resultado es " + resultado);

		// Vamos a generar una nota aleatoria y que saque por pantalla si es un
		// insuficiente, un suficiente...
		int nota = (int) (Math.random() * 11 + 1);
		String notaFinal = "";

		System.out.println("Tu nota es un " + nota);

		switch (nota) {
		case 1:
		case 2:
		case 3:
		case 4: {
			notaFinal = "Insuficiente";
			break;
		}
		case 5:
		case 6: {
			notaFinal = "Suficiente";
			break;
		}
		case 7:
		case 8: {
			notaFinal = "Notable";
			break;
		}
		case 9:
		case 10: {
			notaFinal = "Sobresaliente";
		}
		}

		System.out.println("Tienes un " + notaFinal);

		// Cerramos entrada de teclado
		teclado.close();
	}

}
