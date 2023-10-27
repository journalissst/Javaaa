package PZ_13.Materials;

class WritingMaterials {
    private String name;
    private String color;
    private double length;
    private int price;
    private boolean draw;


    public WritingMaterials() {
        this.name = name;
        this.color = color;
        this.length = 0.0;
        this.price = 0;
        this.draw = false;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.color = "No color";
        this.length = 0.0;
        this.price = 0;
        this.draw = false;
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.name = "No Name";
        this.color = "No Color";
        this.length = length;
        this.price = price;
        this.draw = draw;
    }

    public WritingMaterials(String name, String color, double length, int price, boolean draw) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.price = price;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void display() {
        System.out.println("Назавание: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Длина: " + length);
        System.out.println("Цена: " + price);
        System.out.println("Умеет рисовать: " + (draw ? "Да" : "Нет" + "\n"));
    }

    public void replace_rod(String newRod) {
        this.color = newRod;
    }

    public void priceUp(int price_up) {
        this.price = price + price_up;
    }

    public void priceDown(int price_down) {
        this.price = price - price_down;
    }

    public void drawe() {
        if (draw) {
            System.out.println(this.name + " провёл линий: 1 Их цвет - " + this.color + "\n");
        } else {
            System.out.println(this.name + " не может ничего нарисовать" + "\n");
        }
    }

    public void drawe(int n) {
        if (draw) {
            System.out.println(this.name + " провёл линий:"+n + "Их цвет - " + this.color + "\n");
        } else {
            System.out.println(this.name + " не может ничего нарисовать" + "\n");
        }
    }

    public void drawe(String color) {
        if (draw) {
            System.out.println(this.name + " провёл линий: 1 Их цвет - " + this.color + "\n");
        } else {
            System.out.println(this.name + " не может ничего нарисовать" + "\n");
        }
    }

    public void drawe(String color, int n) {
        if (draw) {
            System.out.println(this.name + " провёл линий:"+ n + "Их цвет - " + this.color + "\n");
        } else {
            System.out.println(this.name + " не может ничего нарисовать" + "\n");
        }
    }
}
