package unidad2;

public class ejemploCondicionales2 {

	public static void main(String[] args) {
		// Escribe un programa que lea una nota y nos diga si es un
		// insuficiente, suficiente, bien, notable, sobresaliente o matrícula
		double nota = (Math.random() * 10); // Math.random() devuelve double

		System.out.println("Tu nota es " + nota);

		// Si ha sacado menos de un 5 ha suspendido
		if (nota < 5) { // Si no ponemos llaves se ejecutará la primera línea del código si se cumple la
						// condición
			System.out.println("Has suspendido");
			System.out.println("Lo siento mucho"); // Si hay más líneas de código, se ejecutarán aunque no se cumpla
		} else {
			// Si estamos dentro implica que la nota es mayor o igual a 5
			// Si además es menor de 6 implica que es un insuficiente
			if (nota < 6) {
				System.out.println("Tienes un suficiente");
			} else if (nota < 7) {
				System.out.println("Tienes un bien");
			} else if (nota < 9) {
				System.out.println("Tienes un notable");
			} else if (nota < 10) {
				System.out.println("Tienes un sobresaliente");
			} else {
				System.out.println("Tienes una matrícula");
			}
		}

	}

}
