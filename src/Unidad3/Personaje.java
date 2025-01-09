package Unidad3;

public class Personaje {
	// Variables miembro de la clase
	// Todos los objetos que creemos lo tendran
	// Las variables miembros de una clase pueden ser
	// public piblicas
	// private privadas
	// protected protegidas, solo las clases hijas pueden usarlas
	// Por defecto si no ponemos nada las variables son publicas

	public int fuerza;
	public int inteligencia;
	public int carisma;

	// Si las ponemos privadas no serán accesibles directamente desde el oobjeto
	public int puntosVida;
	private int puntosPoder;

	/*
	 * 
	 * Constructor principal vacio
	 * 
	 */

	public Personaje() {

		System.out.println("Generando el personaje...");

		// Utilizamos this para señalar que la variable es miembro de la clase
		// por si hhubiera otera variable con el mismo nombre
		this.fuerza = (int) (Math.random() * 20);
		this.inteligencia = (int) (Math.random() * 20);
		this.carisma = (int) (Math.random() * 20);
		this.puntosVida = (int) (Math.random() * 20);
		this.puntosPoder = (int) (Math.random() * 20);

	}

	// Funciones

	/**
	 * Esta función se ejecutaa una tirada de ataque que se calcula con un dado de
	 * 20 más la fuerza
	 * 
	 * @return
	 */

	public int tiradaAtaque() {
		// Ejecutamos la tirada de ataque
		return this.fuerza + (int) (Math.random() * 21);
	}

	// Las funciones al declararse deben definir si son publicas/privadas/protegidas
	// y el tipo de dato que devuelven
	// En este caso no quiero que devuelva nada asi que pongo void
	public void recibirDanio(int danio) {
		this.puntosVida = this.puntosVida - 5;

	}

}
