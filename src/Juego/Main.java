package Juego;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Wizard w1 = new Wizard("Gandalf", 1500, 3000);
        Wizard w2 = new Wizard("Ultron", 750, 2000);
        Elf e1 = new Elf("Steereon", 3200, 500);
        Elf e2 = new Elf("Weedle", 2000, 2000);
        Fairy f1 = new Fairy("juliette", 1000, 700);
        Fairy f2 = new Fairy("Ugus", 400, 2300);

        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(w1);
        characters.add(w2);
        characters.add(e1);
        characters.add(e2);
        characters.add(f1);
        characters.add(f2);

        System.out.println("-------------- Before War ----------------");
        Character.showCharactersInfo(characters);
        System.out.println("-------------- After War -----------------");
        war(characters);
        Character.showCharactersInfo(characters);
    }

    public static void war(ArrayList<Character> characters) {
        characters.get(0).attack(characters.get(characters.size()-1));
        characters.get(characters.size()-1).attack(characters.get(0));
    }
}
