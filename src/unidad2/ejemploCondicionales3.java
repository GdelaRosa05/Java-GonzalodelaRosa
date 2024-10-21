package unidad2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejemploCondicionales3 {

	public static void main(String[] args) {
		// Vamos a comprobar si un alumno se ha sacado el carnet de conducir
		// Para ello leerá de teclado los siguientes datos:
		// edad, numFallosExamen, tasaPagada, fechaExamenTeorico, numGolpes, jamon
		// El programa deberá de comprobar si tiene derecho a carnet
		// Para ello, deberá teber más de 18 años y menos de 4 fallos en el examen y la
		// tasa pagada
		// En caso de cumplirlo se le pedirá la fecha del examen práctico y los golpes
		// Si la fecha es anterior a la actual o tiene menos de 2 golpes, también
		// aprueba
		// En todo caso también tiene el carnet si ha regalado un jamón

		// Declaramos las variables
		int edad = 0;
		int numFallosExamen = 0;
		boolean tasaPagada = false;
		String sTasaPagada = "";
		boolean tieneCarnet = false;
		LocalDate fechaExamenTeorico;
		String sFechaExamenTeorico = "";
		int numGolpes = 0;
		boolean jamon = false;

		// Creamos la entrada del teclado
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Has sobornado al examinador con jamón?(true/false)");
		jamon = teclado.nextBoolean();

		if (jamon) {
			tieneCarnet = true;
		} else {
			System.out.println("Introduce tu edad");
			edad = teclado.nextInt();
			System.out.println("Introduce el número de fallos");
			numFallosExamen = teclado.nextInt();
			System.out.println("¿Ha pagado la tasa?(Si/No)");

			// Leemos como String si hemos pagado la tasa
			sTasaPagada = teclado.next();
			// Operador ternario si la condición es cierta, asigna el valor que viene
			// después de la ?
			// Si es falsa asigna el valor del final
			tasaPagada = sTasaPagada.equalsIgnoreCase("Si") ? true : false;

			if (edad >= 18 && numFallosExamen < 4 && tasaPagada) {
				// Para leer la fecha hay que leerla como un String
				// pero puede tener muchísimos formatos
				System.out.println("Introduce la fecha del examen (dd/mm/yyyy)");
				sFechaExamenTeorico = teclado.next();

				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				// El parse cambia el String de tipo de dato a fecha
				// Utilizamos el formato que hemos definido antes
				fechaExamenTeorico = LocalDate.parse(sFechaExamenTeorico, formateador);

				System.out.println("Introduce el número de golpes");
				numGolpes = teclado.nextInt();

				// Fecha actual
				LocalDate hoy = LocalDate.now();

				// Última comprobación menos de dos golpes y fecha anterior a la actual
				if (numGolpes < 2 || fechaExamenTeorico.isBefore(hoy)) {
					tieneCarnet = true;
				}
			}
		}

		// Si tiene el carnet le sacamos un mensaje por pantalla
		if (tieneCarnet) {
			System.out.println("Felicidades, puedes pasar a recoger el carnet en un plazo aproximado de 4 a 20 años");
		} else {
			System.out.println("Inténtalo de nuevo");
		}

		teclado.close();

	}

}
