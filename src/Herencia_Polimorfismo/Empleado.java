package Herencia_Polimorfismo;

public class Empleado extends Persona{
    private String empresa;

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }
    public String toString() {
        String text = " nombre: " + this.getNombre();
        text+= " empresa: " + this.empresa;
        return text;
    }
}
