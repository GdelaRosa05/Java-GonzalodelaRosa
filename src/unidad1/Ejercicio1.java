package unidad1;

public class Ejercicio1{
	
	public static void main(String[] args) {
	
		int num = 23;
		String direccion = "Calle perico";	
		System.out.println("Tu dirección es " + direccion + " número " + num);
		
		
		String nombre = "juan";
		String apellido = "cobo";
		
		nombre = nombre.concat(apellido);
		
		System.out.println(nombre);

	}
}

