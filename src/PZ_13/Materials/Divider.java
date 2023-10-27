package PZ_13.Materials;

class Divider extends WritingMaterials{
    private String dividerType;
    private boolean metal;


    public Divider(){
        super();
    }
    public Divider(String dividerType, boolean metal,boolean auto,String name, String color, double length, int price){
        super(name, color, length, price, true);
        this.dividerType = dividerType;
        this.metal = metal;
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public void draw_circle(){
        System.out.println("Нарисован круг\n");
    }
    public void display() {
        System.out.println("This is a "+ getClass().getName());
        super.display();
        System.out.println("My type: " + getDividerType());
        System.out.println("It is metal: " + isMetal());
    }
}
