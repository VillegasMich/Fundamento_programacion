package Loops_Conditionals;

import java.util.Scanner;
public class SumaRestaCuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese -suma- -resta- -cuadrado- o en su defecto -salir-");
        String palabra = scan.next();

        while(!palabra.equals("salir")) {

            switch (palabra) {

                case "suma":
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    int resultado = num1 + num2;
                    System.out.println(resultado);
                    break;

                case "resta":
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;

                case "cuadrado":
                    num1 = scan.nextInt();
                    resultado = num1 * num1;
                    System.out.println(resultado);
                    break;
            }
            System.out.println("Ingrese -suma- -resta- -cuadrado- o en su defecto -salir-");
            palabra = scan.next();
        }
    }
}
