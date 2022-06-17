package Empleados;

public class Empleado {
    protected String name;
    protected String lastname;
    protected String mail;
    protected int id;
    protected int years;
    protected long phoneNumber;
    protected double salary;

    public Empleado(String name, String lastname, String mail, int id, int years, long phoneNumber, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.id = id;
        this.years = years;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                ", years=" + years +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }

    public void increaseSalary(double increase) {
        this.salary *= (increase /100);
    }
}
