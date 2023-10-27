package PZ_13.Aniamals;

class Bird extends Animal{
    private String area;
    private boolean winterFly;

    public Bird(){
        super();
    }

    public Bird(String area, boolean winterFly, String type, String name, int age, double weight, boolean isSwim, boolean isWalk) {
        super(type, name, age, weight, isSwim, isWalk, true);
        this.area = area;
        this.winterFly = winterFly;
    }
    public void chir(){
        System.out.println("Chick-chiric\n");
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void display() {
        System.out.println("I am a "+getClass().getName());
        super.display();
        System.out.println("Area: " + getArea());
        System.out.println("Can fly in winter: " + isWinterFly());
    }
}