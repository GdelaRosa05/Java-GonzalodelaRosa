package unidad1;

public class Operadores {

	public static void main(String[] args) {
		
		int numAlumnosDAW = 56;
		int numAlumnosASIR = 32;
		int numAlumnosCETI = 19;
		int numAlumnosFPB = 19;
		int numAlumnosSMR = 70;
		float mediaAlumnos;
		int num1=4;
		int num2=3;
		
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
		++sumaAlumnos;
		
		//El operador "++" si se pone a la izquierda, tendrá preferencia y será lo primero
		//que se ejecute, si se pone a la derecha de la variable se ejecutará después del resto
		//de operadores o funciones.
		System.out.println("Los alumnos de informática actuales son: " + ++sumaAlumnos);
		
		//La  media es la suma de todos los alumnos entre la cantidad de grados
		mediaAlumnos = sumaAlumnos/5;
		
		System.out.println("La media de alumnos de informática actuales son: " + sumaAlumnos);

		System.out.println("El resto de dividir es:  " + 31%7);
		
		//Si hay una cadena de texto con el operador + convierte todo a cadenas
		System.out.println("El resultado es " + (num1++) + num2);
		//Si las operaciones aritméticas las ponemos entre paréntesis primero se realiza la suma
		//En este caso el incremento ++ de num1 se hace al final, no se muestra por pantalla
		System.out.println("El resultado es " + ((num1++) + num2));
		System.out.println("El resultado es " + ((++num1) + num2));
	}

}
