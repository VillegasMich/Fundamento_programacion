package Parcial2;

public class SumaPosicionesPares {
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 7;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 9;

        int count = 0;
        //No deberia empezar desde 0???
        for(int i = 1; i < nums.length; i+=2) {
            count += nums[i];
        }
        System.out.println(count);
    }
}
