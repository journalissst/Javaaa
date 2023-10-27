package PZ_15.First;

public class ShoppingCenter extends Building{
    private int shopsCount;
    private int floorCount;
    private boolean Cinema;

    public ShoppingCenter(int shopsCount, int floorCount, boolean Cinema, String name,
                 String address, int builtYear, String arhName, boolean itIsCulture){
        super(name, address, builtYear, arhName, itIsCulture);
        this.shopsCount = shopsCount;
        this.floorCount = floorCount;
        this.Cinema = Cinema;
    }

    @Override
    public void display(){
        System.out.println("It is a ShoppingCenter");
    }

    public String toString(){
        return super.toString() + "Shops Count" + shopsCount + "\n" + "FloorCount" + floorCount + "\n" +
                "Cinema" + Cinema;
    }

}
