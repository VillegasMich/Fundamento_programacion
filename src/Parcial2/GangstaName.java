package Parcial2;

import java.util.Scanner;
public class GangstaName
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        String name = console.nextLine();

        String fInicial = name.substring(0,1);
        fInicial = fInicial.toUpperCase();
        String last = name.substring(name.indexOf(" ") + 1, name.length() );
        last = last.toUpperCase();
        String first = name.substring(0, name.indexOf(" "));

        System.out.println("Your gangsta name is \"" + fInicial + ". Eafit " + last + " " + first + "-tense\"");
    }
}
