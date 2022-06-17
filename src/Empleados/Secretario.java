package Empleados;

public class Secretario extends Empleado {
    private String department;
    private int faxNumber;

    public Secretario(String name, String lastname, String mail, int id, int years, long phoneNumber, double salary, String department, int faxNumber) {
        super(name, lastname, mail, id, years, phoneNumber,salary);
        super.increaseSalary(5.0);
        this.department = department;
        this.faxNumber = faxNumber;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                ", years=" + years +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", faxNumber=" + faxNumber +
                '}';
    }
}
