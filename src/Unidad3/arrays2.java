package Unidad3;

public class arrays2 {

	public static void main(String[] args) {
		// Declaramos el array con 10 números
		int listaNumeros[] = new int[10];

		// Recorremos todas las posiiones del array y le vamos insertando números
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = (int) (Math.random() * 10.0) + 1;
			System.out.println("Número en posición " + i + ": " + listaNumeros[i]);
		}

		// Queremos sacar el número mayor y menor de todos los que hay en el array
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		// Recorremos todas las posiciones del array buscando máximo y mínimo
		for (int i = 0; i < listaNumeros.length; i++) {
			// Si el númerp actual es mayor que nuestro máximo hasta ahora
			// este número es el nuevo máximo
			if (listaNumeros[i] > maxNum) {
				maxNum = listaNumeros[i];
			}

			if (listaNumeros[i] < minNum) {
				minNum = listaNumeros[i];
			}

			// Comprobación de la cantidad de números que se repiten
			// Vamos a guardar el número actual
			int numABuscar = listaNumeros[i];
			int cantRep = 0;

			// Recorremos todas las posiciones del array buscando el número a buscar
			for (int j = 0; j < listaNumeros.length; j++) {
				// Si el número en la posición j del array es el número a buscar
				// es que hay un número igual al buscado e incremento la cantidad de repetidos
				if (listaNumeros[j] == numABuscar) {
					cantRep++;
				}
			}

			// Si hemos encontrado más de una repetición lo sacamos por pantalla
			if (cantRep > 1) {
				System.out.println("El número " + numABuscar + " se repite " + (cantRep - 1) + " veces");
			}
		}

		// Mostramos el máximo y el mínimo
		System.out.println("El máximo es: " + maxNum);
		System.out.println("El mínimo es: " + minNum);
	}

}
