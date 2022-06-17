package Juego;

import java.util.ArrayList;

public class Character {
    protected String name;
    protected int atk;
    protected int life;

    public Character(String name, int atk, int life) {
        this.name = name;
        this.atk = atk;
        this.life = life;
    }

    @Override
    public String toString() {
        return "Character --> " +
                "name = " + name +
                ", atk = " + atk +
                ", life = " + life;
    }

    public static void showCharactersInfo(ArrayList<Character> characters) {
        for(Character character: characters) {
            System.out.println(character);
        }
    }

    public void attack(Character character) {
        character.life -= this.atk;
    }
}
