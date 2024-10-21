package unidad2;

import java.util.Scanner;

public class ejemploCondicionales1 {

	public static void main(String[] args) {
		// Leemos de teclado la edad de una persona y le decimos si es mayor de edad
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		// Leemos un entero
		int edad = teclado.nextInt();

		// Con la sentencia if se evalúa una condición
		// Si la condición es cierta entre en el bloque de código y lo ejecuta
		if (edad >= 18) {
			System.out.println("Puedes entrar a la discoteca");
		} else { // Si la condición del if es falsa entra en el bloque de código del else
			System.out.println("No puedes entrar a la discoteca");
		}

		teclado.close();
	}

}
