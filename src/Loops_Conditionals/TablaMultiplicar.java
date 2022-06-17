package Loops_Conditionals;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int resultados = 0;
        for(int x = 1; x < 10; x++) {
            System.out.println("------" + x + "------");
            for(int y = 1; y < 10; y++) {
                resultados = x * y;
                System.out.println(resultados);
            }
        }
    }
}
