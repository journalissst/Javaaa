package PZ_15.First;

import PZ_15.Second.LivingHouse;

public class House extends Building implements LivingHouse {
    private int roomsCount;
    private float square;
    private boolean isHaveGarden;

    public House(int roomsCount, float square, boolean isHaveGarden, String name,
                 String address, int builtYear, String arhName, boolean itIsCulture){
        super(name, address, builtYear, arhName, itIsCulture);
        this.roomsCount = roomsCount;
        this.square = square;
        this.isHaveGarden = isHaveGarden;
    }

    @Override
    public void display(){
        System.out.println("It is a House");
    }

    public String toString(){
        return super.toString() + "Rooms Count" + roomsCount + "\n" + "Square" + square + "\n" +
                "Garden" + isHaveGarden;
    }

    @Override
    public void setRoomsCount(int roomsCount) {

    }

    @Override
    public boolean isHaveGarden() {
        return false;
    }
}
