package Parcial3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el valor qui quiere para la matriz cuadrada (nxn): ");
        int valor = scan.nextInt();
        Animal[][] tricky = new Animal[valor][valor];
        Gato.llenarTrickyGatos(tricky);
        imprimirTricky(tricky);
        Pato.ponerPatos(tricky);

        System.out.println("Fin del juego");
    }

    public static void imprimirTricky(Animal[][] tricky) {
        for(int i = 0; i < tricky.length; i++) {
            System.out.println("|");
            for(int j = 0; j < tricky.length; j++) {
                System.out.print(tricky[i][j].getTipo() + " ");
            }
        }
         System.out.println("|");
    }

    public static boolean verificarTricky(Animal[][] tricky) {
        for(int i = 0; i < tricky.length-2; i++) {
            for(int j = 0; j < tricky.length-2; j++) {
                if(tricky[i][j].getTipo().equals("pato") && tricky[i + 1][j].getTipo().equals("pato") && tricky[i+2][j].getTipo().equals("pato")) {
                    return true;
                }
                else if(tricky[i][j].getTipo().equals("pato") && tricky[i][j+1].getTipo().equals("pato") && tricky[i][j+2].getTipo().equals("pato")) {
                    return true;
                }
                else if (vreificarDiagonal(tricky)) {
                    return true;
                }
                else if (verificarDiagonalContraria(tricky)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean vreificarDiagonal(Animal[][] tricky) {
        int j = 0;
        int contPatos = 0;
        for (int i = 0; i < tricky.length; i++) {
            if(tricky[i][j].getTipo().equals("pato")) {
                contPatos++;
                j++;
            }
        }
        if (contPatos == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean verificarDiagonalContraria(Animal[][] tricky) {
        int j = 0;
        int contPatos = 0;
        for (int i = tricky.length -1; i >= 0; i--) {
            if(tricky[i][j].getTipo().equals("pato")) {
                contPatos++;
                j++;
            }
        }
        if (contPatos == 3) {
            return true;
        }
        else {
            return false;
        }
    }

}
