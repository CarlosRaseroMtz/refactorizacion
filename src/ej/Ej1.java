package ej;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int tamaño = 0;
        int array[];

        System.out.println("Diga el tamaño");
        tamaño = s.nextInt();

        array = new int[tamaño];

        System.out.println("Escriba los números");
        for (int f = 0; f < tamaño; f++) {
            array[f] = s.nextInt();
        }

        System.out.println("La media de los números positivos es " + mediaPositiva(array));
        System.out.println("La media de los números negativos es " + mediaNegativa(array));
        System.out.println("El número de ceros que hay es " + count0(array));
    }

    public static int mediaPositiva(int ar[]) {
        int resta = 0;
        int x = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0) {
                resta += ar[i];
                x++;
            }
        }
        return resta / x;
    }

    public static int mediaNegativa(int matrix[]) {
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
