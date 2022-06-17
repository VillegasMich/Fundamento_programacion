package ProyectEuler;

public class PowerDigitSum {
    public static void main(String[] args) {
        int sum = 0;
        int num = (int) Math.pow(2,1000);
        String nums = String.valueOf(num);
        System.out.println(nums);
        for(int i = 0; i < nums.length(); i++) {
            sum +=  nums.charAt(i);
        }
        System.out.println(sum);

    }
}
