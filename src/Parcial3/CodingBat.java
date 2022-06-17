package Parcial3;

public class CodingBat {
    public static void main(String[] args) {
        System.out.println(CodingBat.cantidadDeEspacios("Manuel Villegas"));
        System.out.println(CodingBat.cantidadDeEspaciosRECURSION("Hola a todos"));
        System.out.println(CodingBat.last2("axxxaaxx"));
        System.out.println(CodingBat.FromDecimalToBinary(15));
    }
    public static int cantidadDeEspacios(String str) {
        int cantEsp = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ') {
                cantEsp++;
            }
        }
        return cantEsp;
    }

    public static int cantidadDeEspaciosRECURSION(String str) {
        if(str.length() <= 0) {
            return 0;
        }
        else {
            if(str.charAt(0) == ' ') {
                return 1 + cantidadDeEspaciosRECURSION(str.substring(1));
            }
            else {
                return cantidadDeEspaciosRECURSION(str.substring(1));
            }
        }
    }

    public static int last2(String str) {
        if(str.length() < 4) {
            return 0;
        }
        else {
            String last = str.substring(str.length()-2);
            String first = str.substring(0,2);
            if(first.equals(last)) {
                return last2(str.substring(1)) + 1;
            }
            else {
                return last2(str.substring(1));
            }
        }
    }

    public static String FromDecimalToBinary(int n) {
        if(n == 1) {
            return "1";
        }
        else {
            return FromDecimalToBinary(n/2) + n%2;
        }
    }
}
