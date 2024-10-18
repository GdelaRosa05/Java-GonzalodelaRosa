package unidad1;

public class ejemploComparadores {

	public static void main(String[] args) {
		
		int edad = 16;
		String nombre = "Gonzalo";
		float nota = 4.6f;
		int numModSup = 7;
		boolean traeBebida = true;
		boolean llevaZapatillas = false;
		int numAcomp = 2;
		//El valor inicial para entrar es falso, que por defeecto nadie puede entrar
		boolean puedeEntrarGrad = false;
		boolean gradoAprobado = false;
		
		float renta = 19000;
		int numFamiliares = 5;
		boolean empadOtraProvincia = true;
		String victima = "Si";
		boolean beca = false;
		
		
		//El alumno puede entrar en el acto de graduación final de fp si y solo si:
		//es mayor de edad
		//ha aprobado 8 módulos o más
		//viene con bebida
		//no trae zapatillas deportivas
		//trae menos de 3 acompañantes
		
		//El operador > es cierto si el número de la izquierda es mayor que el de la derecha
		//Estrictamente, si son iguales es falso
		System.out.println("¿Es mayor que 18? " + (edad>18));
		System.out.println("¿Es mayor que 18? " + (edad>=18));
		
		System.out.println("¿El alumno está suspenso? "+ (nota<=5));
		
		
		//Combinamos todas las condiciones con el operador lógico "&&"
		puedeEntrarGrad = edad>=18 && numModSup>=8 && traeBebida==true && llevaZapatillas!=true && numAcomp<3;
		
		//Aprueba el módulo si es mayor de 17años, y además cumple una de las siguientes condiciones,
		//La nota media es mayor de 4.5 o tiene más de 6 módulos aprobados o más
		gradoAprobado = edad>17 && (nota>4.5 || numModSup>=6);
		
		//El alumno consigue la beca de transporte si cumple que su renta familiar es inferior a 20.000€
		//la familia tiene entre 3 y 6 personas, y no está empadronado en otra provincia o cumple que es víctima de
		//terrorismo o maltrato.
		
		//Nota1: El operador ! (no) niega (resultado contrario) la condición le sigue
		//Nota2: Para comparar cadenas String utilizamos la función equals(cadena)
		//Nota3: Con equalsIgnoreCase da igual letras en mayúsculas o minúsculas
		beca = renta<20000 && (numFamiliares>=3 && numFamiliares<=6) && (empadOtraProvincia==false || victima.equals("Si"));
		
		
		
		System.out.println("¿El aulmno puede entrar en la graduación? "+ puedeEntrarGrad);
		System.out.println("¿Ha aprobado el grado? "+ gradoAprobado	);
		System.out.println("¿Tiene beca? "+ beca);
	}

}
