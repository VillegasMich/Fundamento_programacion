package ProyectEuler;

public class SumOdd1000 {
    public static void main(String[] args) {
        int sumodd = 0;
        for(int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumodd += i;
            }
        }
        System.out.println(sumodd);
    }
}
