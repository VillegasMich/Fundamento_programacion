package Herencia_Polimorfismo;

public abstract class Animal {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void sonido();
}
