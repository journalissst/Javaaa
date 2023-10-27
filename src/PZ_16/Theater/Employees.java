package PZ_16.Theater;

public class Employees extends Person implements Employee, Displayable{
    private String zone;
    private double salary;

    public Employees(String name, String lastname, String zone, double salary) {
        super(name, lastname);
        this.zone = zone;
        this.salary = salary;
    }

    @Override
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String display() {
        return "\n" + "Работник: " + getFullName() + "\n" +
                "Работает в зоне: " + zone + "\n" +
                "Зарплата: " + salary + "\n";
    }
}
