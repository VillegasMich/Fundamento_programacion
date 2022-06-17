package Parcial2;

public class Prueba2 {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];

           for (int i = 0; i < list1.length; i++)
               {
                  list1[i] = 2 * i + 1;
                  list2[i] = 2 * i + 1;
               }

           int[] list3 = list2;
           list2[2]++;

           for(int i = 0; i < list3.length; i++) {
               System.out.println(list3[i]);
           }
         // This is a function that prints an array of ints
         //printIntArray(list3);
    }
}
