package unidad2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

		// Declaramos todas las variables
		int edad = 0;
		String tipoPasajero = "";
		float millas = 0.0f;
		boolean temporadaAlta = false;
		boolean miembro = false;
		float precioBase = 0.0f;
		float descuento = 0.0f;

		// Creamos la entrada del teclado
		Scanner teclado = new Scanner(System.in);

		// Pedimos los datos por teclado
		System.out.println("Introduce tu edad: ");
		edad = teclado.nextInt();
		System.out.println("Introduce el tipo de pasajero (economico/ejecutivo/primera clase/premium): ");
		tipoPasajero = teclado.next();
		System.out.println("Introduce el número de millas acumuladas: ");
		millas = teclado.nextFloat();
		System.out.println("¿Es temporada alta? (true/false): ");
		temporadaAlta = teclado.nextBoolean();
		System.out.println("¿Eres miembro de un programa de lealtad? (true/false): ");
		miembro = teclado.nextBoolean();
		System.out.println("Introduce el precio base del boleto de avión: ");
		precioBase = teclado.nextFloat();

		// Establecemos las condiciones
		if (edad >= 18 || temporadaAlta == false) {
			descuento = (float) (precioBase * 0.1);
			precioBase = precioBase - descuento;
		}

		// Cerramos la entrada del teclado
		teclado.close();
	}

}
