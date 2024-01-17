package ej;

public class Ej2 {

	public static void main(String[] args) {
		int filas = 5;
        int columnas = 5;
        int[][] arrayBidimensional = new int[filas][columnas];

        // Rellenar el array bidimensional
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                arrayBidimensional[fila][columna] = fila + columna;
            }
        }

        // Imprimir los valores del array bidimensional
        System.out.println("Los valores de la tabla son:");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(arrayBidimensional[fila][columna] + " ");
            }
            System.out.println(); // Agregar nueva línea después de cada fila
        }
	}

}