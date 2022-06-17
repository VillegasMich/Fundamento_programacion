package Herencia_Polimorfismo;

public class Gato extends Animal {
    public Gato(){}

    public Gato(String nombre) {
        this.setNombre(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Miau... Miau");
    }
}
