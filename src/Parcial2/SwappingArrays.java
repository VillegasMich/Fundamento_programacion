package Parcial2;

public class SwappingArrays {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        //int[] numsI = new int[nums.length];
        //for(int i = 0; i < nums.length; i++) {
        //    numsI[numsI.length -1 -i] = nums[i];
        //}
        //for(int i = 0; i < nums.length; i++) {
        //    System.out.println(numsI[i]);
        //}


        Swapping(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int [] Swapping (int[] nums) {
        int[] array = new int[nums.length];
        int x = nums.length-1;
        int temp;
        for(int i = 0; i < (nums.length/2); i++) {
            temp = nums[i];
            array[i] = nums[x];
            array[x] = temp;
            x--;
        }
        return array;
    }
}


