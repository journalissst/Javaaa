package KR_2;

public class Chef extends Employee {
    private String specialty;

    public Chef(String name, double salary, String specialty) {
        super(name, salary);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void display() {
        System.out.println("Повар: " + getName());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Специальность: " + specialty);
    }
}