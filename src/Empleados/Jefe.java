package Empleados;

import java.util.ArrayList;
import java.util.Arrays;

public class Jefe extends Empleado {
    private String area;
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;
    private int carIdNumber;

    public Jefe(String name, String lastname, String mail, int id, int years, long phoneNumber, double salary, String area, Secretario secretario, ArrayList<Vendedor> vendedores, int carIdNumber) {
        super(name, lastname, mail, id, years, phoneNumber, salary);
        super.increaseSalary(20.0);
        this.area = area;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.carIdNumber = carIdNumber;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                ", years=" + years +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", area='" + area + '\'' +
                ", secretario=" + "si" +
                ", vendedores=" +  "si" +
                ", carIdNumber=" + carIdNumber +
                '}';
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void setCarIdNumber(int carIdNumber) {
        this.carIdNumber = carIdNumber;
    }

    public void addCustomer(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void quitCustomer(ArrayList<Integer> vendedores) {
        vendedores.remove(vendedores.size()-1);
    }

    public void newCar(int carIdNumber) {
        this.carIdNumber = carIdNumber;
    }
}
