package KR_2;

public class Product implements Displayable{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void display() {
        System.out.println("Продукт: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Количество: " + quantity);
    }
}
