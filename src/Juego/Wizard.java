package Juego;

public class Wizard extends Character {

    public Wizard(String name, int atk, int life) {
        super(name, atk, life);
    }

    @Override
    public String toString() {
        return "Wizard --> " +
                "name = " + name +
                ", atk = " + atk +
                ", life = " + life;
    }
}
