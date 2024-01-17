package ej;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 5;
		int[][] ARRAYBIDI = new int[a][b];

		// recorremos todo el array bidimensional
		for (int xyz = 0; xyz < a; xyz++) {
			for (int abc = 0; abc < b; abc++) {
				ARRAYBIDI[xyz][abc] = xyz + abc;
			}
		}

		System.out.println("Los valores de la tabla son:");
		for (int variableQueSeRecorre = 0; variableQueSeRecorre < a; variableQueSeRecorre++) {
			for (int variableQueSeRecorre2 = 0; variableQueSeRecorre2 < b; variableQueSeRecorre2++) {
				System.out.print(ARRAYBIDI[variableQueSeRecorre][variableQueSeRecorre2] + " ");
			}
		}

	}

}