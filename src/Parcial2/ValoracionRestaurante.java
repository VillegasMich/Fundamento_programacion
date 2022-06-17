package Parcial2;

import java.util.Scanner;
public class ValoracionRestaurante {
    public static void main(String[] args) {
        int[] cliente1 = new int[4];
        int[] cliente2 = new int[4];
        int[] cliente3 = new int[4];
        int[] cliente4 = new int[4];
        int[] cliente5 = new int[4];
        System.out.println("Ingrese las valoraciones respectivamente");
        System.out.println("1 es pésimo y 10 es excelente o inmejorable");
        Restaurante.setValores(cliente1);
        System.out.println("las valoraciones del cliente # 1 son: ");
        Restaurante.imprimirValores(cliente1);
        Restaurante.setValores(cliente2);
        System.out.println("las valoraciones del cliente # 2 son: ");
        Restaurante.imprimirValores(cliente2);
        Restaurante.setValores(cliente3);
        System.out.println("las valoraciones del cliente # 3 son: ");
        Restaurante.imprimirValores(cliente3);
        Restaurante.setValores(cliente4);
        System.out.println("las valoraciones del cliente # 4 son: ");
        Restaurante.imprimirValores(cliente4);
        Restaurante.setValores(cliente5);
        System.out.println("las valoraciones del cliente # 5 son: ");
        Restaurante.imprimirValores(cliente5);
        Restaurante.conocerPromedios(cliente1,cliente2,cliente3,cliente4,cliente5);
        Restaurante.mejorPromedio(cliente1,cliente2,cliente3,cliente4,cliente5);
        Restaurante.peorPromedio(cliente1,cliente2,cliente3,cliente4,cliente5);
    }
}
class Restaurante {
    private int atencion;
    private int calidadcomida;
    private int precios;
    private int ambiente;
    public static void setValores(int[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Atención, 2. Calidad de la comida, 3. justicia de precios, 4. Ambiente");
        for(int i = 0; i < arr.length; i++) {
            int valor = scan.nextInt();
            if(valor > 10 || valor < 1) {
                System.out.println("Valor fuera de los limites (1 - 10), Instaturado como 0");
            }
            else {
                arr[i] = valor;
            }
        }
    }
    public static void imprimirValores(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void conocerPromedios(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5 ) {
        int promedioAtencion = (arr1[0] + arr2[0] + arr3[0] + arr4[0] + arr5[0]) / 5;
        System.out.println("El promedio de atención es: " + promedioAtencion);
        int promedioCalidad = (arr1[1] + arr2[1] + arr3[1] + arr4[1] + arr5[1]) / 5;
        System.out.println("El promedio de calidad es: " + promedioCalidad);
        int promedioPrecios = (arr1[2] + arr2[2] + arr3[2] + arr4[2] + arr5[2]) / 5;
        System.out.println("El promedio de la justicia de los precios es: " + promedioPrecios);
        int promedioAmbiente = (arr1[3] + arr2[3] + arr3[3] + arr4[3] + arr5[3]) / 5;
        System.out.println("El promedio del ambiente es: " + promedioAmbiente);
    }
    public static void mejorPromedio(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5) {
        int mejorProm = 0;
        int promedioAtencion = (arr1[0] + arr2[0] + arr3[0] + arr4[0] + arr5[0]) / 5;
        int promedioCalidad = (arr1[1] + arr2[1] + arr3[1] + arr4[1] + arr5[1]) / 5;
        int promedioPrecios = (arr1[2] + arr2[2] + arr3[2] + arr4[2] + arr5[2]) / 5;
        int promedioAmbiente = (arr1[3] + arr2[3] + arr3[3] + arr4[3] + arr5[3]) / 5;
        int[] prom = new int[4];
        prom[0] = promedioAtencion;
        prom[1] = promedioCalidad;
        prom[2] = promedioPrecios;
        prom[3] = promedioAmbiente;
        for(int i = 0; i < prom.length; i++) {
            if(prom[i] > mejorProm) {
                mejorProm = prom[i];
            }
        }
        System.out.println("El mejor promedio fue: " + mejorProm);
    }
    public static void peorPromedio(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5) {
        int promedioAtencion = (arr1[0] + arr2[0] + arr3[0] + arr4[0] + arr5[0]) / 5;
        int promedioCalidad = (arr1[1] + arr2[1] + arr3[1] + arr4[1] + arr5[1]) / 5;
        int promedioPrecios = (arr1[2] + arr2[2] + arr3[2] + arr4[2] + arr5[2]) / 5;
        int promedioAmbiente = (arr1[3] + arr2[3] + arr3[3] + arr4[3] + arr5[3]) / 5;
        int[] prom = new int[4];
        prom[0] = promedioAtencion;
        prom[1] = promedioCalidad;
        prom[2] = promedioPrecios;
        prom[3] = promedioAmbiente;
        int peorProm = prom[0];
        for(int i = 0; i < prom.length; i++) {
            if(prom[i] < peorProm) {
                peorProm = prom[i];
            }
        }
        System.out.println("El peor promedio fue: " + peorProm);
    }
}

