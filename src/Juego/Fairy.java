package Juego;

public class Fairy extends Character {

    public Fairy(String name, int atk, int life) {
        super(name, atk, life);
    }

    @Override
    public String toString() {
        return "Fairy --> " +
                "name = " + name +
                ", atk = " + atk +
                ", life = " + life;
    }

    @Override
    public void attack(Character character) {
        character.life -= this.atk*2;
    }
}
