package ProyectEuler;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int sumpow = 0;
        int powsum = 0;
        for(int i = 0; i <= 100; i++) {
            sumpow += (int) Math.pow(i,2);
        }
        System.out.println(sumpow);
        int num = 0;
        for(int i = 0; i <= 100; i++) {
            num += i;
        }
        powsum = (int) Math.pow(num,2);
        System.out.println(powsum);
        int sqrdiff = powsum - sumpow;
        System.out.println(sqrdiff);
    }
}
