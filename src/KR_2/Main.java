package KR_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Canteen canteen = new Canteen();

        System.out.print("Введите количество продуктов: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Продукт №" + (i + 1));
            System.out.print("Название: ");
            String productName = scanner.nextLine();
            System.out.print("Цена: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Количество(кг): ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product(productName, productPrice, productQuantity);
            canteen.addProduct(product);
        }

        System.out.print("Введите количество сотрудников: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Сотрудник №" + (i + 1));
            System.out.print("Имя: ");
            String employeeName = scanner.nextLine();
            System.out.print("Зарплата: ");
            double employeeSalary = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Тип сотрудника(повар/официант): ");
            String employeeType = scanner.nextLine();

            if (employeeType.equalsIgnoreCase("Повар")) {
                System.out.print("Специальность: ");
                String specialty = scanner.nextLine();

                Chef chef = new Chef(employeeName, employeeSalary, specialty);
                canteen.addEmployee(chef);
            } else if (employeeType.equalsIgnoreCase("Официант")) {
                Waiter waiter = new Waiter(employeeName, employeeSalary);
                canteen.addEmployee(waiter);
            }
        }


        Menu menu = new Menu();

        System.out.print("Введите количество блюд в меню: ");
        int numDishes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numDishes; i++) {
            System.out.println("Блюдо №" + (i + 1));
            System.out.print("Название: ");
            String dishName = scanner.nextLine();
            System.out.print("Цена: ");
            double dishPrice = scanner.nextDouble();
            scanner.nextLine();
            menu.addDish(dishName, dishPrice);
        }

        canteen.setMenu(menu);

        System.out.println("Информация о столовой:");
        canteen.displayProducts();
        canteen.displayEmployees();
        canteen.displayMenu();

        scanner.close();
    }
}
