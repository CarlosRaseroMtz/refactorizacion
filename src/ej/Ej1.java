package ej;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int ta = 0;
		int arr[];

		System.out.println("Diga el tamaño");
		ta = s.nextInt();

		arr = new int[ta];

		System.out.println("Escriba los números");
		for (int f = 0; f < ta; f++) {
			arr[f] = s.nextInt();
		}
		
		System.out.println("La media de los números positivos es "+mePo(arr));
		System.out.println("La media de los números negativos es "+meNe(arr));
		System.out.println("El número de ceros que hay es "+count0(arr));
	}

	public static int mePo(int ar[]) {
		int res = 0;
		int x = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				res += ar[i];
				x++;
			}
		}
		return res / x;
	}

	public static int meNe(int matrix[]) {
		int answer = 0;
		int contador = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i] < 0) {
				answer += matrix[i];
				contador++;
			}
		}
		return answer / contador;
	}

	public static int count0(int array[]) {
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				res++;
			}
		}
		return res;
	}

}