package unidad2;

public class ejercicio9 {

	public static void main(String[] args) {

		// Declaramos variables
		int dado1 = (int) (Math.random() * 6) + 1, dado2 = (int) (Math.random() * 6) + 1,
				dado3 = (int) (Math.random() * 6) + 1, dado4 = (int) (Math.random() * 6) + 1;

		// Mostramos resultados de jugadores
		System.out.println("Jugador 1:");
		System.out.println("Primer dado: " + dado1);
		System.out.println("Segundo dado: " + dado2);

		System.out.println("Jugador 2:");
		System.out.println("Primer dado: " + dado3);
		System.out.println("Segundo dado: " + dado4);

		if (dado1 == dado2 && dado2 == dado3 && dado3 == dado4) {
			System.out.println("Empate");
		} else if (dado1 == 6 && dado2 == 6) {
			System.out.println("Ha ganado el jugador 1 por pareja de 6");
		} else if (dado3 == 6 && dado4 == 6) {
			System.out.println("Ha ganado el jugador 2 por pareja de 6");
		} else if (dado1 == 5 && dado2 == 5) {
			System.out.println("Ha ganado el jugador 1 por pareja de 5");
		} else if (dado3 == 5 && dado4 == 5) {
			System.out.println("Ha ganado el jugador 2 por pareja de 5");
		} else if (dado1 == 4 && dado2 == 4) {
			System.out.println("Ha ganado el jugador 1 por pareja de 4");
		} else if (dado3 == 4 && dado4 == 4) {
			System.out.println("Ha ganado el jugador 2 por pareja de 4");
		} else if (dado1 == 3 && dado2 == 3) {
			System.out.println("Ha ganado el jugador 1 por pareja de 3");
		} else if (dado3 == 3 && dado4 == 3) {
			System.out.println("Ha ganado el jugador 2 por pareja de 3");
		} else if (dado1 == 2 && dado2 == 2) {
			System.out.println("Ha ganado el jugador 1 por pareja de 2");
		} else if (dado3 == 2 && dado4 == 2) {
			System.out.println("Ha ganado el jugador 2 por pareja de 2");
		} else if (dado1 == 1 && dado2 == 1) {
			System.out.println("Ha ganado el jugador 1 por pareja de 1");
		} else if (dado3 == 1 && dado4 == 1) {
			System.out.println("Ha ganado el jugador 2 por pareja de 1");
		} else if ((dado1 + dado2) > (dado3 + dado4)) {
			System.out.println("Ha ganado el jugador 1 por mayor suma");
		} else if ((dado3 + dado4) > (dado1 + dado2)) {
			System.out.println("Ha ganado el jugador 2 por mayor suma");
		}
	}

}
