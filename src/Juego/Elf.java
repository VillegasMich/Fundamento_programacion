package Juego;

public class Elf extends Character {

    public Elf(String name, int atk, int life) {
        super(name, atk, life);
    }

    @Override
    public String toString() {
        return "Elf --> " +
                "name = " + name +
                ", atk = " + atk +
                ", life = " + life;
    }
}
