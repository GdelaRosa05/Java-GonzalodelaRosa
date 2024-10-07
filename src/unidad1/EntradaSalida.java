package unidad1;

import java.util.Scanner;

public class EntradaSalida {

	public static void main(String[] args) {

		String nombre = "";
		int edad = 23;
		float sueldo = 0.0f;
		boolean esMayorEdad = true;
		char sexo;
		
		Scanner teclado = new Scanner(System.in);
		
		//Mensaje para leer el teclado
		System.out.println("¿Cuál es tu nombre? ");
		
		//Leemos el nombre del teclado
		nombre = teclado.next();
		
		System.out.println("¿Cuántos años tienes? ");
		
		//Leemos un entero que es la edad con nextInt
		edad = teclado.nextInt();
		esMayorEdad = (edad>=18);
		
		System.out.println("¿El alumno es mayor de edad? " + esMayorEdad);
		
		//Leemos un float con nextFloat
		System.out.println("¿Cuánto cobras al mes? ");
		sueldo = teclado.nextFloat();
		
		//Leemos el sexo
		System.out.println("Sexo(M/F): ");
		sexo = teclado.next().charAt(0);
		
		System.out.println("El nombre es " + nombre + ", tiene " + edad + " años, cobra " + sueldo + "€ \ny su sexo es " + sexo);
		
		int numero1 = 342;
		double numero2 = 346436666346634.5;
		
		numero1 = (int) numero2;
		
		System.out.println("El número 1 es: " + numero1);
		System.out.println("El número 2 es: " + numero2);
		
		System.out.println("El máximo valor entero es: " + Integer.MAX_VALUE);
		
		//Cerramos el teclado cuando ya no lo vayamos a utilizar
		teclado.close();
	}

}