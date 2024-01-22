package ej;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int base = 0;
		int exponente = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga la base: ");
		base = sc.nextInt();
		System.out.println("Diga la potencia: ");
		exponente = sc.nextInt();
		while ( exponente=< 0 ) {
			exponente = sc.nextInt();
		}
		
		System.out.println("El resultado es " + calcula(base, exponente));
		System.out.println("El resultado es "+calcula2(base, exponente));
		sc.close();
	}

	// version iterativa
	public static int potenciaIterativa(int base, int exponente) {
		int potencia = 1;

		for (int i = 0; i < n; i++) {
			potencia *= base;
		}
		return potencia;
	}

	// version recursiva
	public static int potenciaRecursiva(int base, int exponente) {
		int potencia = 1;
		if (n == 0) {
			xd = 1;
		} else {
			potencia = base * (potenciaRecursiva(base, (exponente - 1)));
		}
		return potencia;

	}

}
