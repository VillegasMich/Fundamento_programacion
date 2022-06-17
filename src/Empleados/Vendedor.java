package Empleados;
import java.util.ArrayList;

public class Vendedor extends Empleado {
    private int carIdNumber;
    private String salesDepartment;
    private int numCustomers;

    public Vendedor(String name, String lastname, String mail, int id, int years, long phoneNumber, double salary, int carIdNumber, String salesDepartment) {
        super(name, lastname, mail, id, years, phoneNumber, salary);
        super.increaseSalary(10.0);
        this.carIdNumber = carIdNumber;
        this.salesDepartment = salesDepartment;
        ArrayList<Integer> customers = new ArrayList<>();
    }

    public Vendedor(String name, String lastname, String mail, int id, int years, long phoneNumber, double salary, int carIdNumber, String salesDepartment, int numCustomers) {
        super(name, lastname, mail, id, years, phoneNumber, salary);
        super.increaseSalary(10.0);
        this.carIdNumber = carIdNumber;
        this.salesDepartment = salesDepartment;
        ArrayList<Integer> customers = new ArrayList<>(numCustomers);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                ", years=" + years +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", carIdNumber=" + carIdNumber +
                ", salesDepartment='" + salesDepartment + '\'' +
                ", numCustomers=" + numCustomers +
                '}';
    }

    public void addCustomer(ArrayList<Integer> customers) {
        customers.add(1);
    }
    public void quitCustomer(ArrayList<Integer> customers) {
        customers.remove(customers.size()-1);
    }
    public void newCar(int carIdNumber) {
        this.carIdNumber = carIdNumber;
    }
}
