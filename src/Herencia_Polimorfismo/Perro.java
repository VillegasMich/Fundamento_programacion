package Herencia_Polimorfismo;

public class Perro extends Animal {
    public Perro(){}

    public Perro(String nombre) {
        this.setNombre(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Guau... Guau");
    }
}
