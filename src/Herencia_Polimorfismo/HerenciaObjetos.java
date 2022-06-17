package Herencia_Polimorfismo;

public class HerenciaObjetos {
    public static void main(String[] args) {
        /*
        EmpleadoAsalariado ea1 = new EmpleadoAsalariado();
        Persona p1 = new Persona();
        System.out.println(ea1 instanceof Persona);
        System.out.println(ea1 instanceof Empleado);
        System.out.println(ea1 instanceof EmpleadoAsalariado);
        System.out.println(ea1 instanceof Object);
        System.out.println(p1 instanceof Empleado);
        System.out.println(p1 instanceof EmpleadoAsalariado);
        System.out.println(p1 instanceof Object);
        // Instanceof (palabra reservada) podemos verificar si un objeto es instancia de algúna clase en particular.
        // Funciona de hijos a padre.

        Persona p2 = new Empleado();
        System.out.println(p2.toString());
        // Tipo actual y declarado.
        */

        Gato g1 = new Gato("Hernan");
        Gato g2 = new Gato("Maria");
        Perro p1 = new Perro("Juan");
        Perro p2 = new Perro("Daniel");

        Animal[] animales = {g1,g2,p1,p2};
        sonidos(animales);
    }
    public static void sonidos (Animal[] animales) {
        for (Animal animal: animales) {
            System.out.println(animal.getNombre() + " Tiene sonido: ");
            animal.sonido();
        }
    }
}
