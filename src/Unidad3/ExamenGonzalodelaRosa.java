package Unidad3;

import java.util.Scanner;

public class ExamenGonzalodelaRosa {

	public static void main(String[] args) {
		// Declaramos las variables
		String[] nombre;
		String[] plataforma;
		String[] categoria;
		double[] precio;
		int[] stock;
		int[] puntuacion;
		int cantidadVideojuegos = 0;
		int[] videojuegos;
		double mediaPrecio = 0.0;
		double mayorPrecio = Integer.MIN_VALUE;
		double menorPrecio = Integer.MAX_VALUE;
		String nombreMayorPrecio = "";
		String nombreMenorPrecio = "";
		String[] sinStock;
		int contador = 0;

		// Creamos una entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Pedimos que introduzca la cantidad de videojuegos
		System.out.println("Introduce la cantidad de videojuegos: ");
		cantidadVideojuegos = teclado.nextInt();

		// Le damos a los arrays la cantidad de videojuegos como longitud
		videojuegos = new int[cantidadVideojuegos];
		puntuacion = new int[cantidadVideojuegos];
		stock = new int[cantidadVideojuegos];
		precio = new double[cantidadVideojuegos];
		nombre = new String[cantidadVideojuegos];
		categoria = new String[cantidadVideojuegos];
		plataforma = new String[cantidadVideojuegos];

		// Hacemos un bucle for para pedir cada dato de cada videojuego
		for (int i = 0; i < videojuegos.length; i++) {

			System.out.println("Introduce el nombre del videojuego " + (i + 1));
			nombre[i] = teclado.next();

			System.out.println("Introduce el precio de el videojuego " + (i + 1));
			precio[i] = teclado.nextDouble();
			mediaPrecio += precio[i];

			// Según se leen los datos se comprobará que los valores de categoría y
			// plataforma están dentro de los valores posibles entre paréntesis, sino se le
			// seguirá
			// pidiendo dicho dato hasta que introduzca un valor correcto.

			do {
				System.out.println(
						"Introduce la plataforma del videojuego (switch, xbox, playstation, pc) " + " " + (i + 1));
				plataforma[i] = teclado.next();
			} while (!plataforma[i].equalsIgnoreCase("switch") && !plataforma[i].equalsIgnoreCase("xbox")
					&& !plataforma[i].equalsIgnoreCase("playstation") && !plataforma[i].equalsIgnoreCase("pc"));

			do {
				System.out.println("Introduce la categoría del videojuego (aventura, plataformas, terror, shooter) "
						+ "" + (i + 1));
				categoria[i] = teclado.next();
			} while (!categoria[i].equalsIgnoreCase("aventura") && !categoria[i].equalsIgnoreCase("plataformas")
					&& !categoria[i].equalsIgnoreCase("terror") && !categoria[i].equalsIgnoreCase("shooter"));

			do {
				System.out.println("Introduce la puntuación del videojuego " + (i + 1));
				puntuacion[i] = teclado.nextInt();
			} while (puntuacion[i] < 1 || puntuacion[i] > 10);

			System.out.println("Introduce el stock del videojuego " + (i + 1));
			stock[i] = teclado.nextInt();

			// La media de precio y el nombre del videojuego más caro y más barato.
			if (precio[i] > mayorPrecio) {
				mayorPrecio = precio[i];
				nombreMayorPrecio = nombre[i];
			}

			if (precio[i] < menorPrecio) {
				menorPrecio = precio[i];
				nombreMenorPrecio = nombre[i];
			}

			// Mostrar el nombre de los juegos de switch que sean de categoría aventura o
			// aquellos cuya puntuación sea superior a 9 y cuesten mas de 39 euros
			if ((plataforma[i].equalsIgnoreCase("switch") && categoria[i].equalsIgnoreCase("aventura"))
					|| (puntuacion[i] > 9 && precio[i] > 39)) {
				System.out.println(nombre[i]
						+ " es un juego de Switch de categoría aventura o tiene una puntuación superior a 9 y cuesta más de 39€");
			}

			// Mostrará el Stock total de los juegos de playstation
			if (plataforma[i].equalsIgnoreCase("playstation")) {
				System.out.println("El juego de PS4 " + nombre[i] + " tiene un stock de " + stock[i] + " unidades");
			}

			// Cuando el nombre un producto empieze por z y tenga stock inferior a 10 y
			// puntuación superior a 6, guardará su nombre en un array y mostrará al final
			// la lista
			// de productos sin stock a pedir de nuevo.
			if (nombre[i].charAt(0) == 'z' && stock[i] < 10 && puntuacion[i] > 6) {
				contador++;
				sinStock = new String[contador];
				sinStock[i] = nombre[i];
				System.out.println("El " + sinStock[i] + " está sin stock");
			}

		}

		// Mostramos por pantalla la media de precios y el mayor y menor precio
		mediaPrecio = mediaPrecio / precio.length;
		System.out.println("La media de precios de los videojuegos es de " + mediaPrecio + "€");
		System.out.println("El videojuego más caro es " + nombreMayorPrecio + ", que vale " + mayorPrecio);
		System.out.println("El videojuego más barato es " + nombreMenorPrecio + ", que vale " + menorPrecio);

		// Cerramos la entrada de teclado
		teclado.close();
	}

}
