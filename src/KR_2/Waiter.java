package KR_2;

public class Waiter extends Employee {
    private int tablesServed;

    public Waiter(String name, double salary) {
        super(name, salary);
        this.tablesServed = 0;
    }

    public int getTablesServed() {
        return tablesServed;
    }

    public void serveTable() {
        tablesServed++;
    }

    public void display() {
        System.out.println("Официант: " + getName());
        System.out.println("Зарплата: " + getSalary());
    }
}