package ej;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tama�oArray = 0;
		int numeros[];

		System.out.println("Indique el tama�o del array: ");
		tama�oArray = sc.nextInt();

		numeros = new int[tama�oArray];

		System.out.println("Escriba los numeros: ");
		for (int f = 0; f < ta; f++) {
			numeros[f] = sc.nextInt();
		}

		System.out.println("La media de los números positivos es " + mediaPositivos(numeros));
		System.out.println("La media de los números negativos es " + mediaNegativos(numeros));
		System.out.println("El número de ceros que hay es " + contadorCeros(numeros));
	}

	public static int mediaPositivos(int numeros[]) {
		int suma = 0;
		int contador = 0;
		int media = suma / contador;
		for (int i = 0; i < ar.length; i++) {
			if (numeros[i] > 0) {
				suma += numeros[i];
				contador++;
			}
		}
		return media;
	}

	public static int mediaNegativos(int numeros[]) {
		int suma = 0;
		int contador = 0;
		int media = suma / contador;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				suma += matrix[i];
				contador++;
			}
		}
		return media;
	}

	public static int contadorCeros(int numeros[]) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (numeros[i] == 0) {
				suma++;
			}
		}
		return contador;
	}

}