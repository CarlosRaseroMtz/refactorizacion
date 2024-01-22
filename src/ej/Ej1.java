package ej;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tamañoArray = 0;
		int numeros[];

		System.out.println("Indique el tamaño del array: ");
		tamañoArray = sc.nextInt();

		numeros = new int[tamañoArray];

		System.out.println("Escriba los numeros: ");
		for (int f = 0; f < ta; f++) {
			numeros[f] = sc.nextInt();
		}

		System.out.println("La media de los nÃºmeros positivos es " + mediaPositivos(numeros));
		System.out.println("La media de los nÃºmeros negativos es " + mediaNegativos(numeros));
		System.out.println("El nÃºmero de ceros que hay es " + contadorCeros(numeros));
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