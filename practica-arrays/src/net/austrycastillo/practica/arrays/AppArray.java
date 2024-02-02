package net.austrycastillo.practica.arrays;

public class AppArray {

	public static void main(String[] args) {
		// arrays unidimensional
//		int[] notas; // int notas[]; declarando un arreglo
//		notas = new int[6];// inicializada
//		notas[0] = 10;
//		notas[1] = 5;
//		notas[2] = 2;
//		notas[3] = 8;
//		notas[4] = 1;
//		notas[5] = 9;
//		// System.out.println(notas[2]);
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println(notas[i]);
//		}

		String nombres[] = { "Ana", "Luis", "Juan", "Austry" };
		System.out.println(nombres.length);
		System.out.println(nombres[2]);
		for (String n : nombres) {
			System.out.println(n);
		}
	}

}
