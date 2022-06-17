import java.util.Scanner;
public class ReplacePuntos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nueva = "";
        String palabra = scan.next();
        String word = palabra.toUpperCase();
        //String nada ="";
        if(palabra.length() == 0) {
            nueva = ".";
        }
        else {
            for(int i = 1; i < palabra.length(); i++) {
                nueva += '.';
            }
        }
        System.out.println(word.charAt(0) + nueva);
    }

    public String doubleChar(String str) {
        String nueva = "";
        // nueva = str.toUpperCase();
        if(str.length() > 0) {
            nueva = str.substring(0,1).toUpperCase();
            for(int i = 1; i < str.length(); i++) {
                nueva += '.';
            }
        }

        else {
            nueva = ".";
        }
        return nueva;
    }
}








