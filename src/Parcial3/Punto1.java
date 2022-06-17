package Parcial3;

public class Punto1 {
    public static void main(String[] args) {
        //System.out.println(sum(3));
        String str = "Holaaaaaaaas";
        String newStr = str.replaceAll("a" , "");
        System.out.println(newStr);

        String num = "1";
        String dos = "2";
        int resp = Integer.parseInt(num + dos);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n += sum(n-1);
        }
    }

}
