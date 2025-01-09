package Unidad3;

import java.util.Scanner;

public class ExamenBuclesEjemplo {

	public static final int CAT_MTB = 1;
	public static final int CAT_DESC = 2;
	public static final int CAT_CAR = 3;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String modelo = "";
		String marca = "";
		double precio = 0.0;
		int categoria = 0;
		int stock = 0;
		int puntTec = 0;
		int numBicis = 0;

		double mediaPrecio = 0;
		double maxPrecio = Integer.MIN_VALUE;
		double minPrecio = Integer.MAX_VALUE;
		String modeloMax = "";
		String modeloMin = "";
		int sumaStock = 0;
		String[] ListaModelosCond;
		String[] ListaModelosStock;

		// Preguntamos al usuario cuántas bicicletas leemos
		System.out.println("Cuántas bicicletas vamos a leer: ");
		numBicis = teclado.nextInt();

		ListaModelosCond = new String[numBicis];
		ListaModelosStock = new String[numBicis];

		for (int i = 0; i < numBicis; i++) {
			System.out.println("Introduce el modelo de la bicicleta " + (i + 1));
			modelo = teclado.nextLine();

			do {
				System.out.println("Introduce la marca de la bicicleta " + (i + 1));
				marca = teclado.nextLine();
			} while (!marca.equalsIgnoreCase("orbea") || !marca.equalsIgnoreCase("decathlon")
					|| !marca.equalsIgnoreCase("decathlon"));

			System.out.println("Introduce el precio de la bicicleta " + (i + 1));
			precio = teclado.nextDouble();

			do {
				System.out.println(
						"Introduce la categoria de la bicicleta " + (i + 1) + " (1-MTB/2-Descenso/3-Carretera)");
				categoria = teclado.nextInt();
			} while (categoria < 1 || categoria > 3);

			System.out.println("Introduce el stock de la bicicleta " + (i + 1));
			stock = teclado.nextInt();

			do {
				System.out.println("Introduce la puntuación técnica de la bicicleta " + (i + 1) + " (Entre 1 y 10)");
				puntTec = teclado.nextInt();
			} while (puntTec < 1 || puntTec > 10);

			// Para calcular la media vamos sumando todos los precios de las bicis
			mediaPrecio += precio;

			// Para calcular el precio máximo vamos comparando todos los precios de las
			// bicicletas
			// y si es mayor que nuestro máximo pasará a ser el nuevo máximo
			if (precio > maxPrecio) {
				maxPrecio = precio;
				modeloMax = modelo;
			}

			if (precio < minPrecio) {
				minPrecio = precio;
				modeloMin = modelo;
			}

			if (categoria == CAT_CAR && (puntTec > 9 || precio < 190)) {
				ListaModelosCond[i] = modelo;
			}

			if (categoria == CAT_DESC) {
				sumaStock += stock;
			}

			if (stock == 0 && puntTec > 6) {
				ListaModelosStock[i] = modelo;
			}
		}

		// Una vez hemos acabado el bucle tenemos todos los precios sumados
		// Lo dividimos entre la canitdad de bicis para sacar la media
		mediaPrecio = mediaPrecio / numBicis;

		for (int i = 0; i < ListaModelosCond.length; i++) {
			if (ListaModelosCond[i] != null) {
				System.out.println(ListaModelosCond[i]);
			}
		}

		teclado.close();
	}

}
