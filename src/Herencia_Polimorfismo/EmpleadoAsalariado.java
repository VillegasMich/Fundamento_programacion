package Herencia_Polimorfismo;

public class EmpleadoAsalariado extends Empleado{
    private Float salario;

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        String text = " nombre: " + this.getNombre();
        text+= " empresa: " + this.getEmpresa();
        text+= " salario: " + this.salario;
        return text;
    }
}
