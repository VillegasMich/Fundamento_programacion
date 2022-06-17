package Parcial3;

public class Gato extends Animal {
    public Gato(String tipo) {
        super(tipo);
    }

    public static void llenarTrickyGatos(Animal[][] tricky) {
        for(int i = 0; i < tricky.length; i++) {
            for(int j = 0; j < tricky.length; j++) {
                tricky[i][j] = new Gato("gato");
            }
        }
    }
}
