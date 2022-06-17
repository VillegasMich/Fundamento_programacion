package Recursion;

public class Main {
    public static void main(String[] args) {
        Nat tres = new Nat(new Nat(new Nat(null)));
        numString(tres);
    }

    public static int whatNumber(Nat num) {
        if(num == null) {
            return 0;
        }
        else {
            return whatNumber(num.anterior) +1;
        }
    }
    public static void numString(Nat num) {
        System.out.println(whatNumber(num));
    }
}

class Nat {
    public Nat anterior;

    public Nat(Nat anterior) {
        this.anterior = anterior;
    }

}
