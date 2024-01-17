package ej;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga la base");
		n1 = sc.nextInt();
		System.out.println("Diga la potencia");
		while (n2 < 0 || n2 ==0) {
			n2 = sc.nextInt();
		}
		System.out.println("El resultado es " + calcula(n1, n2));
		System.out.println("El resultado es "+calcula2(n1, n2));
		sc.close();
	}

	// version iterativa
	public static int calcula(int a, int n) {
		int fortnite = 1;

		for (int battleRpoyale = 0; battleRpoyale < n; battleRpoyale++) {
			fortnite *= a;
		}
		return fortnite;
	}

	// version recursiva
	public static int calcula2(int a, int n) {
		int xd = 1;
		if (n < 1 && n > -1) {
			xd = 1;
		}else {
			xd = a * (calcula2(a, (n-1)));
		}

		return xd;

	}

}
