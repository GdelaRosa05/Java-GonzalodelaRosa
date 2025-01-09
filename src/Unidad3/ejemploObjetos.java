package Unidad3;

public class ejemploObjetos {

	public static void main(String[] args) {

		/*
		 * Hemos creado una clase denominada Personaje Las variables de una clase se
		 * denominan objetos Para crear un objto utilizamos la palabra reservada new La
		 * clase es el fichero java donde decalramos las variables y funciones que los
		 * objetos pueden utilizar Un objeto es como una varianle de esa clase que puede
		 * guardar datos y ejecutar las funciones
		 */

		// Creamos un arma
		// Para utilizar un objeto primero hay que crearlo
		// Se utiliza la palabra reserva new para indicar que lo creamos
		// Cuando lo creamos realmente se llama a una función de la clase arma
		// que se denomina constructor
		Arma arcoGelido = new Arma();

		// arcoGelido.nombre = "Frozen";

		// Creamos un personaje con new y el nombre de la clase
		Personaje aragorn = new Personaje();

		// Para acceder a las variables miembro de la clase se utiliza el .
		aragorn.fuerza = 13;

		System.out.println("El personaje tiene " + aragorn.inteligencia + " puntos de inteligencia");
		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");

		aragorn.recibirDanio(2);

		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");

		System.out.println("Tirada de ataque aragorn: " + aragorn.tiradaAtaque());

		System.out.println("Descripción del arma: " + arcoGelido.getDescripcion());

		arcoGelido.setDescripcion("Congela los higadillos");

		System.out.println("Descripción del arma: " + arcoGelido.getDescripcion());

		System.out.println("Datos del arma " + arcoGelido);
	}

}
