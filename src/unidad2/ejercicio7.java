package unidad2;

import java.time.LocalDate;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// Declaramos las variables
		int num = 0;
		int mesActual = LocalDate.now().getMonthValue();
		int diferenciaMes = 0;

		// Creamos la entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Pedimos por teclado un número
		System.out.println("Introduce un número de mes (1-12): ");
		num = teclado.nextInt();

		diferenciaMes = num - mesActual;

		System.out.println("Quedan " + Math.abs(diferenciaMes) + " mes/es para el mes actual.");

		// Cerramos la entrada de teclado
		teclado.close();

	}

}
