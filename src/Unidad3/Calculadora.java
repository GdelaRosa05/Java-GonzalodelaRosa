package Unidad3;

public class Calculadora {

	/**
	 * Función que suma 2 números La función es estática para poder llamar a la
	 * función sin tener que crear una clase
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int suma(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	/**
	 * La función recibe un String denúmeros y suma todas sus cifras
	 * 
	 * @param numeros
	 * @return Devuelve la suma de las cifras del String o 0 si hay elementos no
	 *         numéricos
	 */
	public static int suma(String numeros) {
		// Variable que almacenará la suma de todos los números
		int sumatorio = 0;

		// Vamos recorriendo todas las posiciones de la cadenas
		for (int i = 0; i < numeros.length(); i++) {
			// Guardamos el carácter de la posición i actual
			char numero = numeros.charAt(i);

			// Paso a entero el carácter actual de la cadena
			// El 0 vale 48 al restarlo nos da el valor numérico real del carácter
			int num = Character.valueOf(numero) - 48;

			// Si es un número no válido devolvemos 0
			if (num < 0 || num > 9) {
				return 0;
			} else {
				sumatorio += num;
			}
		}

		return sumatorio;
	}
}
