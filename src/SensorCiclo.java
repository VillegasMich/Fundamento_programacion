import java.util.Scanner;
public class SensorCiclo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SensorLuz sl1 = new SensorLuz(18, 40);
        String tarea;

        do {
            System.out.println("Ingrese -duplicar- -asignarint- -salir-");
            tarea = scan.next();

            while(!tarea.equals("salir")) {

                if(tarea.equals("duplicar")) {
                    System.out.println(sl1.getIntensidad());
                    sl1.duplicarIntensidad();
                    System.out.println(sl1.getIntensidad());
                }
                else if(tarea.equals("asignarint")) {
                    System.out.println("Asigne un valor a la intensidad");
                    int i = scan.nextInt();
                    sl1.setIntensidad(i);
                }
                System.out.println("Ingrese -duplicar- -asignarint- -salir-");
                tarea = scan.next();
            }
            break;
        } while (!(tarea.equals("duplicar") || tarea.equals("asignarint") || tarea.equals("salir")));
    }
}

class SensorLuz {
    private int intensidadMin;
    private int intensidadMax;
    private int intensidad;

    public SensorLuz(int min, int max) {
        this.intensidadMin = min;
        this.intensidadMax = max;
        this.intensidad = min;
    }
    public void setIntensidad(int i) {
        if(i >= this.intensidadMin && i <= this.intensidadMax) {
            this.intensidad = i;
        }
    }
    public int getIntensidad() {
        return this.intensidad;
    }
    public int duplicarIntensidad() {
        if((this.intensidad * 2) >= this.intensidadMin && (this.intensidad * 2) <= this.intensidadMax) {
            return (this.intensidad = this.intensidad * 2);
        }
        else {
            return this.intensidad;
        }
    }
}