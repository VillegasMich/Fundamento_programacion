package Arrays;

public class ArraysIntLoop {
    public static void main(String[] args) {
        int[] squareNumbers = new int[10];

        for(int i = 0; i < 10; i++) {
            int square = (i +1) * (i + 1);
            squareNumbers[i] = square;
           // System.out.println(squareNumbers[i]);
        }

        // For each VALUE in the Array.
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.println(square);
        }


    }
}
