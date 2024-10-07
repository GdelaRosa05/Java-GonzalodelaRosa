package unidad1;

public class EjemploMensajeInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definción de variables
		//Primero el tipo de dato y después el nombre (identificador)
		//Solo se pueden definir una vez dentro del mismo bloque de código
		int numHijos = 2;
		String nombre = "Paco";
		String apellidos;
		String mensaje;
		char escalera = 'A';
		float pi;
		double calculoInfinito;
		boolean github = true;
		
		//Esto es un comentario de linea
		/* 
		 * Esto es un comentario de mcuhas lineas 
		 * */
		
		//println linea nueva, print misma linea
		System.out.println("Mi nombre es " + nombre); 
		nombre = "Gonzalo";
		System.out.println("Mi nombre es " + nombre);
		nombre = nombre + " de la Rosa de la Concha";
		System.out.println("Mi nombre es " + nombre);
		//Para concatenar varias variables o valores se utiliza el operador "+"
		mensaje = nombre + " tiene " + numHijos + " hijos";
		
		System.out.println(mensaje);
		
		//Para asignar un valor a una variable utilizamos el operador =
		//A la izquierda va la variable y a la derecha el valor que se le da
		apellidos = "de la Rosa de la Concha";
		pi = 3.14159f;
		calculoInfinito = 43636366346.6346;
		
		System.out.println("Hola mundo");

	}

}
