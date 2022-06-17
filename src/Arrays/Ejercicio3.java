package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Ejercicio3.invertirArreglo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void invertirArreglo(int[] arr) {
        int j = arr.length -1;
        int temp = 0;
        for(int i = 0; i < (arr.length/2); i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
