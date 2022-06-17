package Empleados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Secretario s1 = new Secretario("Manuel", "Villegas", "@", 123456, 20, 1145, 35, "Comida", 4865);
        Vendedor v1 = new Vendedor("Jueba", "Alfa", "@", 1345,34,1435,21,322,"Comida");
        ArrayList<Vendedor> vendedoresJ1 = new ArrayList<>();
        Jefe j1  = new Jefe("Pepe", "Alberto", "@", 324,56,12345,70, "Comida", s1, vendedoresJ1,2134);
        j1.addCustomer(v1);

        System.out.println(s1);
        System.out.println(v1);
        System.out.println(j1);
    }
}
