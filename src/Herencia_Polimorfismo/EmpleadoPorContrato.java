package Herencia_Polimorfismo;

public class EmpleadoPorContrato extends Empleado {

    public String toString() {
        String text = "Empleado por contrato: \n " + " nombre: " + this.getNombre();
        text += " empresa: " + this.getEmpresa();
        return text;
    }
}
