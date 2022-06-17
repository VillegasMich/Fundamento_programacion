package Parcial3;

import java.util.Scanner;

public class Pato extends Animal {
    public Pato(String tipo) {
        super(tipo);
    }

    public static void ponerPatos(Animal[][] tricky) {
        Scanner scan = new Scanner(System.in);

        while (!Main.verificarTricky(tricky)) {
            System.out.println("Ingrese las coordenadas donde quiere ubicar un pato: ");
            System.out.print("posicion en x = ");
            int coordenadaX = scan.nextInt();
            System.out.print("posicion en y = ");
            int coordenadaY = scan.nextInt();
            tricky[coordenadaY][coordenadaX] = new Pato("pato");
            System.out.println("Un pato fue ubicado en la posicion " + coordenadaX + "," + coordenadaY);
            System.out.println("¿Existe un tricky? " + Main.verificarTricky(tricky));
            Main.imprimirTricky(tricky);
        }
        System.out.println("¡FELICIDADES!");
    }
}
