package ej;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga el numero de fibonacci(n) que desee saber");
		numero = sc.nextInt();
		System.out.println(calculoden(n1));
		sc.close();

	}

	public static int fibonacci(int n) {
		int fibonacci = 1;
		int sucesion = 1;
		if (n == 0 || n == 1) {
			return 1;
		}else{
			sucesion = (fibonacci(n - 1)) + (fibonacci(n -2));
			return sucesion;
		}	
	}