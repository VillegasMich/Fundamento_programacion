package Recursion;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println(factorial(scan.nextInt()));
        System.out.println("Fibonacci: ");
        System.out.println(fibonacci(scan.nextInt()));

    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    public static int fibonacci(int limit) {
        if(limit == 1 || limit == 0){
            return 1;
        }
        else{
            return limit += fibonacci(limit-2) + fibonacci(limit-1);
        }
    }
}
