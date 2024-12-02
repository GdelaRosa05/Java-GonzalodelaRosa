package Unidad3;

public class arrays {

	public static void main(String[] args) {
		// Definimos el array con []
		double listaAlturas[] = { 200, 185, 190, 220, 170, 180, 200, 234, 780, 10 }; // El tamaño del array es de 10
		String listaNombres[] = { "Juanjo1", "Juanjo2", "Juanjo3", "Juanjo4", "Juanjo5", "Juanjo6", "Juanjo7",
				"Juanjo8", "Juanjo9", "Juanjo10" };
		int cantidadJugadores = 14;

		// Generamos las alturas entre 150 y 230
		for (int i = 0; i < 10; i++) {
			// Rellenamos con alturas aleatorias
			double altura = 150 + (int) (Math.random() * 80.0);

			// Ponemos la altura generada dentro de la posición i del array
			listaAlturas[i] = altura;

			System.out.println("Altura del jugador " + (i + 1) + ": " + altura);
		}

		// Definimos el tamaño del array
		listaNombres = new String[cantidadJugadores];

		listaNombres[2] = "Juanjo";

		System.out.println("Nombre jugador 2: " + listaNombres[2] + " Altura jugador 2: " + listaAlturas[2]);
		System.out.printf("La altura es %.2f", listaAlturas[2]);

		// Sacar la media de las alturas de los jugadores
		double mediaAlturas = 0;
		int i = 0;

		// Con length podemos saber la cantidad de elementos que hay almacenados en este
		// array
		while (i < listaAlturas.length) {
			mediaAlturas += listaAlturas[i];
			i++;
		}
		System.out.println("La media de las alturas es " + (mediaAlturas / listaAlturas.length));
	}

}
