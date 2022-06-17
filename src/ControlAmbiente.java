import java.util.Scanner;
public class ControlAmbiente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SensorActuador sa1 = new SensorActuador(5,1,10);
        for(int i = 1; i < 5; i++) {
            int num = scan.nextInt();
            if(i == 1 || i == 2) {
                sa1.disminuirTemperatura(num);
            }
            else {
                sa1.aumentarTemperatura(num);
            }
        }
        System.out.println(sa1.getTemperatura());
    }
}

class SensorActuador {
    private int temperatura;
    private int minTemp;
    private int maxTemp;

    public SensorActuador(int temp, int min, int max) {
        this.temperatura = temp;
        this.maxTemp = max;
        this.minTemp = min;

    }
    public int getTemperatura() {
        return this.temperatura;
    }
    public void disminuirTemperatura(int i) {
        if(this.temperatura - i >= this.minTemp) {
            this.temperatura -= i;
        }
        else {
            System.out.println("No se puede realizar el proceso");
        }
    }
    public void aumentarTemperatura(int i) {
        if(this.temperatura + i <= this.maxTemp) {
            this.temperatura += i;
        }
        else {
            System.out.println("No se puede realizar el proceso");
        }
    }
}
