package ej;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga el número de fibonacci(n) que desee saber");
		n1 = sc.nextInt();

		System.out.println(calculoden(n1));
		sc.close();

	}

	public static int calculoden(int n) {
		int n2 = 0;
		int n3 = 1;
		int n2y3 = 1;

		for (int i = 1; i < n; i++) {

			n2y3 = n2 + n3;
			n2 = n3;
			n3 = n2y3;
		}
		return n2y3;

	}

}