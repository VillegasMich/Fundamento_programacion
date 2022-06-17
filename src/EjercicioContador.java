import java.util.Scanner;
public class EjercicioContador {
    public static void main(String[] args) {
        Propiedad propiedad1 = new Propiedad("nueva");
        for (int i = 0; i < 3; i++) {
            propiedad1.aumentarVisitas();
        }
        propiedad1.setCondicion();
        for (int i = 0; i < 3; i++) {
            propiedad1.aumentarVisitas();
        }
        System.out.println(propiedad1.getVisitas());
    }
}

class Propiedad {
    private String condicion;
    private int visitas;

    public Propiedad(String c) {
        this.condicion = c;
        this.visitas = 0;
    }
    public String getCondicion() {
        return this.condicion;
    }

    public void setCondicion() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese -nueva- o -usada- por favor:");
            this.condicion = scan.next();
        } while(!(this.condicion.equals("nueva") || this.condicion.equals("usada")));

    }

    public int getVisitas() {
        return this.visitas;
    }

    public void aumentarVisitas() {
        if(this.condicion.equals("nueva")) {
            visitas += 2;
        }
        else {
            visitas++;
        }
    }
}