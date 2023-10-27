package PZ_15.First;

import PZ_15.Second.SocialHouse;

public class HighRiseBuilding extends Building implements SocialHouse {
    private float height;
    private int floorCount;
    private boolean inNewYork;

    public HighRiseBuilding(String name, String address, int yearBuilt, String arhName, boolean itIsCulture,
                            float height, int floorCount, boolean inNewYork) {
        super(name, address, yearBuilt, arhName, itIsCulture);
        this.height = height;
        this.floorCount = floorCount;
        this.inNewYork = inNewYork;
    }

    @Override
    public void display() {
        System.out.println("This is a HighRiseBuilding");
    }

    @Override
    public String toString() {
        return super.toString() + "\nHeight: " + height
                + "\nFloor Count: " + floorCount + "\nIn New York: " + inNewYork;
    }

    @Override
    public void setOperatingHours(String operatingHours) {

    }

    @Override
    public boolean hasMeetingRooms() {
        return false;
    }

    @Override
    public boolean isOpenOnWeekends() {
        return false;
    }
}

