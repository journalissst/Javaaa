package PZ_13.Materials;

class Pen extends WritingMaterials{
    private int countColor;
    private boolean auto;



    public Pen(){
        super();
    }
    public Pen(int countColor,boolean auto,String name, String color, double length, int price){
        super(name, color, length, price, true);
        this.countColor = countColor;
        this.auto = auto;
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void WriteMyName(){
        System.out.println("Саша\n");
    }

    public void display() {
        System.out.println("This is a "+ getClass().getName());
        super.display();
        System.out.println("Count color: " + getCountColor());
        System.out.println("Auto: " + isAuto());
    }
}