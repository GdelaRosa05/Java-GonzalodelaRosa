package unidad1;

public class Operadores {

	public static void main(String[] args) {
		
		int numAlumnosDAW = 56;
		int numAlumnosASIR = 32;
		int numAlumnosCETI = 19;
		int numAlumnosFPB = 19;
		int numAlumnosSMR = 70;
		
		//Para sumar "+"
		int sumaAlumnos = numAlumnosDAW + numAlumnosASIR;
		
		//Para incrementar el valor le sumamos a el mismo lo que toque
		sumaAlumnos = sumaAlumnos + numAlumnosFPB + numAlumnosCETI;
		
		//El operador += incrementa el valor de la variable situada a la izquierda por el valor que esté a la derecha
		sumaAlumnos += numAlumnosSMR;
		
		System.out.println("Los alumnos de informática totales son: " + sumaAlumnos);
		
		sumaAlumnos = sumaAlumnos - 1;
		//Esta instrucción es igual a la anterior
		sumaAlumnos -= 1;
		//Esta instrucción es igual a la anterior
		sumaAlumnos--;
		//++ incrementa en 1 una variable numérica
		sumaAlumnos++;
		
	}

}
