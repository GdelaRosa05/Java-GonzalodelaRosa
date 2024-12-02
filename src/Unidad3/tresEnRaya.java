package Unidad3;

import java.util.Scanner;

public class tresEnRaya {

	public static void main(String[] args) {
		char tablero[][] = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		String ganador = "";
		String jugada = "";

		int jugadaXposx = 0;
		int jugadaXposy = 0;
		int jugadaOposx = 0;
		int jugadaOposy = 0;

		int cantX = 0;
		int cantO = 0;

		// Creamos la entrada de teclado
		Scanner teclado = new Scanner(System.in);

		// Mientras no haya un ganador les vamos pidiendo que pongan fichas
		while (ganador.equals("")) {
			// Mostramos por pantalla el tablero
			for (int i = 0; i < tablero.length; i++) {
				// Dibujo cada fila del tablero
				for (int j = 0; j < tablero[i].length; j++) {
					System.out.print(tablero[i][j] + " ");
				}
				// Después de cada fila doy un enter
				System.out.println();
			}

			// TURNO JUGADOR X

			// Pregunto las coordenadas para la ficha X
			do {
				System.out.println("Jugador X: posición a poner tu ficha (xy): ");
				jugada = teclado.next();

				// Normalmente para convertir un número de String a int
				// se usa la función Integer.parseInt
				// Asignamos las posiciones a sus variables
				jugadaXposx = Character.getNumericValue(jugada.charAt(0));
				jugadaXposy = Character.getNumericValue(jugada.charAt(1));

			} while (jugadaXposy < 0 || jugadaXposy > 2 || jugadaXposx < 0 || jugadaXposx > 2
					|| tablero[jugadaXposx][jugadaXposy] != '_');

			// Posicionamos la ficha en su lugar
			tablero[jugadaXposx][jugadaXposy] = 'X';

			// TURNO JUGADOR O

			// Pregunto las coordenadas para la ficha X
			do {
				System.out.println("Jugador O: posición a poner tu ficha (xy): ");
				jugada = teclado.next();

				// Normalmente para convertir un número de String a int
				// se usa la función Integer.parseInt
				// Asignamos las posiciones a sus variables
				jugadaOposx = Character.getNumericValue(jugada.charAt(0));
				jugadaOposy = Character.getNumericValue(jugada.charAt(1));

			} while (jugadaOposy < 0 || jugadaOposy > 2 || jugadaOposx < 0 || jugadaOposx > 2
					|| tablero[jugadaOposx][jugadaOposy] != '_');

			// Posicionamos la ficha en su lugar
			tablero[jugadaOposx][jugadaOposy] = 'O';

			// Comprobación de quien ha ganado

			// Primero comprobamos las filas
			// Para cada fila
			for (int y = 0; y <= 2; y++) {
				// Reseteamos la cantidad de X encontradas para cada fila
				cantX = 0;
				for (int x = 0; x <= 2; x++) {
					if (tablero[x][y] == 'X') {
						cantX++;
					}
					// Si hay tres X ha ganado jugador X
					if (cantX == 3) {
						ganador = "Jugador X";
					}
				}
			}

			// Después comprobamos las columnas
			// Para cada columna
			for (int x = 0; x <= 2; x++) {
				// Reseteamos la cantidad de X encontradas para cada columna
				cantX = 0;
				for (int y = 0; y <= 2; y++) {
					if (tablero[x][y] == 'X') {
						cantX++;
					}
					// Si hay tres X ha ganado jugador X
					if (cantX == 3) {
						ganador = "Jugador X";
					}
				}
			}

			// Comprobamos las diagonales
			if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
				ganador = "Jugador X";
			}

			if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
				ganador = "Jugador X";
			}

			if (ganador == "") {
				// Primero comprobamos las filas
				// Para cada fila
				for (int y = 0; y <= 2; y++) {
					// Reseteamos la cantidad de O encontradas para cada fila
					cantO = 0;
					for (int x = 0; x <= 2; x++) {
						if (tablero[x][y] == 'O') {
							cantO++;
						}
						// Si hay tres X ha ganado jugador O
						if (cantO == 3) {
							ganador = "Jugador O";
						}
					}
				}

				// Después comprobamos las columnas
				// Para cada columna
				for (int x = 0; x <= 2; x++) {
					// Reseteamos la cantidad de O encontradas para cada columna
					cantO = 0;
					for (int y = 0; y <= 2; y++) {
						if (tablero[x][y] == 'O') {
							cantO++;
						}
						// Si hay tres O ha ganado jugador O
						if (cantO == 3) {
							ganador = "Jugador O";
						}
					}
				}

				// Comprobamos las diagonales
				if (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O') {
					ganador = "Jugador O";
				}

				if (tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O') {
					ganador = "Jugador O";
				}
			}

		}

		System.out.println("Has ganado, " + ganador);

		// Cerramos la entrada de teclado
		teclado.close();

	}

}
