package Arrays;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Arreglo[Fila][Columna]
        int[][] matriz = new int[4][4];
        llenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("*" + sumaDiagonalPrimaria(matriz) + "*");
        System.out.println("*" + sumaDiagonalSecundaria(matriz) + "*");
    }

    public static void llenarMatriz(int[][] matriz) {
        System.out.println("Ingrese los datos requeridos: ");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++ ) {
                matriz[i][j] = scan.nextInt();
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++ ) {
                System.out.println("> " + matriz[i][j] + " <");
            }
        }
    }
    public static int sumaDiagonalPrimaria(int[][] matriz) {
        int resultado = 0;
        int j = 0;
        for(int i = 0; i < matriz.length; i++) {
            resultado += matriz[i][j];
            j++;
        }
        return resultado;
    }
    public static int sumaDiagonalSecundaria(int[][] matriz) {
        int resultado = 0;
        int j = 0;
        for (int i = matriz.length - 1; i >= 0; i--) {
            resultado += matriz[i][j];
            j++;
        }
        return resultado;
    }
}
