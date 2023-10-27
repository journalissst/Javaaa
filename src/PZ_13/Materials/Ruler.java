package PZ_13.Materials;

class Ruler extends WritingMaterials {
    private double length1;
    private boolean wood;


    public Ruler() {
        super();
    }

    public Ruler(int length1, boolean wood, String name, String color, double length, int price) {
        super(name, color, length, price, false);
        this.length1 = length;
        this.wood = wood;
    }

    public double getLength1() {
        return length1;
    }


    public void setLength1(double length) {
        this.length1 = length;
    }

    public boolean isWood(){
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public void measure(){
        System.out.println("Сейчас померяем длину\n");
    }

    public void display() {
        System.out.println("This is a "+ getClass().getName());
        super.display();
        System.out.println("My length: " + getLength1());
        System.out.println("It is wood: " + isWood());
    }
}
