package KR_2;

import java.util.*;

public class Menu implements Displayable {
    private List<String> dishes;
    private Map<String, Double> prices;

    public Menu() {
        dishes = new ArrayList<>();
        prices = new HashMap<>();
    }

    public void addDish(String dish, double price) {
        dishes.add(dish);
        prices.put(dish, price);
    }

    public void display() {
        System.out.println("Меню:");
        for (String dish : dishes) {
            System.out.println(dish + " " + prices.get(dish));
        }
    }
}