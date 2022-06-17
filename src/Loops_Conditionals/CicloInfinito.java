package Loops_Conditionals;

import java.util.Scanner;
public class CicloInfinito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acumulador = 0;
        while(true) {
            System.out.println("Insert number");
            int num = scan.nextInt();
            if(num > 0) {
                acumulador += num;
                System.out.println(acumulador);
            }
            else if(num < 0) {
                acumulador += num;
                System.out.println(acumulador);
            }
            else {
                break;
            }
        }
        System.out.println("End of program");
    }
}

