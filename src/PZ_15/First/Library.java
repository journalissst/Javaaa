package PZ_15.First;

public class Library extends Building {
    private int numberOfBooks;
    private boolean hasMeetingRooms;
    private boolean isOpenOnWeekends;

    public Library(String name, String address, int yearBuilt, String arhName, boolean itIsCulture,
                   int numberOfBooks, boolean hasMeetingRooms, boolean isOpenOnWeekends) {
        super(name, address, yearBuilt, arhName, itIsCulture);
        this.numberOfBooks = numberOfBooks;
        this.hasMeetingRooms = hasMeetingRooms;
        this.isOpenOnWeekends = isOpenOnWeekends;
    }

    @Override
    public void display() {
        System.out.println("This is a library.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Books: " + numberOfBooks
                + "\nHas Meeting Rooms: " + hasMeetingRooms + "\nOpen on Weekends: " + isOpenOnWeekends;
    }
}
