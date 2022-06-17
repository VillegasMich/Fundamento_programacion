package Recursion;

public class SumaRecursion {
    public static void main(String[] args) {
        System.out.println(sumaRecusrsion(5)); // deberia dar 15
    }

    public static int sumaRecusrsion(int n) {
        if(n==0) {
            return 0;
        }
        else {
            return n += sumaRecusrsion(n-1);
        }
    }
}
