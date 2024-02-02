package net.austrycastillo.practica.arrays;

import java.util.Scanner;

public class PracticaArray {

	public static void main(String[] args) {
		/*
		 * desarrollar un algoritmo que solicite la cantidad de alumnos en un curso
		 * luego solicite edad de cada alumno mostrar la suma de todas las edades y su
		 * media
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica la cantidad de alumnos");
		int tam = sc.nextInt();// tamaño de mi arreglo
		int edades[] = new int[tam];
		int suma = 0;
		// solicitamos las edades para nuestro array
		for (int i = 0; i < tam; i++) {
			System.out.println("Ingresa la edad del alumno " + (i + 1));
			edades[i] = sc.nextInt();
		}
		// forech
		for (int n : edades) {
			suma += n;
		}
		System.out.println("La suma es : " + suma);
		System.out.println("La media es: " + (suma / tam));
	}

}
