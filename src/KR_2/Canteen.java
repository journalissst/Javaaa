package KR_2;

import java.util.*;
public class Canteen {
    private List<Product> products;
    private List<Employee> employees;
    private Menu menu;

    public Canteen() {
        products = new ArrayList<>();
        employees = new ArrayList<>();
        menu = new Menu();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void displayProducts() {
        System.out.println("Продукт:");
        for (Product product : products) {
            product.display();
        }
    }

    public void displayEmployees() {
        System.out.println("Сотрудник:");
        for (Employee employee : employees) {
            employee.display();
        }
    }

    public void displayMenu() {
        menu.display();
    }
}
