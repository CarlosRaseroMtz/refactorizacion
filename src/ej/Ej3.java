package ej;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base:");
        int base = scanner.nextInt();

        System.out.println("Ingrese la potencia:");
        int exponente = obtenerExponenteValido(scanner);

        System.out.println("El resultado es (versión iterativa): " + calcularPotenciaIterativa(base, exponente));
      
        scanner.close();
    }

    private static int obtenerExponenteValido(Scanner scanner) {
        int exponente = 0;
        while (exponente <= 0) {
            System.out.println("El exponente debe ser mayor que 0. Ingrese nuevamente:");
            exponente = scanner.nextInt();
        }
        return exponente;
    }

    // versión iterativa
    public static int calcularPotenciaIterativa(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    // versión recursiva
    public static int calcularPotenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * calcularPotenciaRecursiva(base, exponente - 1);
    }

}
