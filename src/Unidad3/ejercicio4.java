package Unidad3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Declaramos las variables
		String texto = "";
		char letras = ' ';
		int numPalabras = 0;

		// Creamos la entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Pedimos por teclado el texto
		System.out.println("Introduce una frase o una palabra: ");
		texto = teclado.nextLine();

		for (int i = 0; i < texto.length(); i++) {
			letras = texto.charAt(i);
			if (letras == ' ') {
				numPalabras++;

				if (i + 1 < texto.length() && texto.charAt(i + 1) == ' ') {
					System.out.println("No pongas más de un espacio.");
					teclado.close();
					return;
				}

				char letraAnterior = Character.toLowerCase(texto.charAt(i - 1));
				char letraPosterior = Character.toLowerCase(texto.charAt(i + 1));
				if (letraAnterior == 'a' || letraAnterior == 'e' || letraAnterior == 'i' || letraAnterior == 'o'
						|| letraAnterior == 'u') {
					System.out.println("letraAnterior");
				}

				if (letraPosterior == 'a' || letraPosterior == 'e' || letraPosterior == 'i' || letraPosterior == 'o'
						|| letraPosterior == 'u') {
					System.out.println("letraPosterior");
				}
			}
		}

		if (texto.charAt(texto.length() - 1) == ' ') {
			numPalabras--;
		}

		if (texto.charAt(0) == ' ') {
			numPalabras--;
		}

		char primeraLetra = Character.toLowerCase(texto.charAt(0));
		if (primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i' || primeraLetra == 'o'
				|| primeraLetra == 'u') {
			System.out.println("primeraLetra");
		}

		if (texto == "") {
			System.out.println("Escribe algo.");
			teclado.close();
			return;
		}

		System.out.println("Hay " + (++numPalabras) + " palabra/s.");

		// Cerramos la entrada de teclado
		teclado.close();
	}

}
