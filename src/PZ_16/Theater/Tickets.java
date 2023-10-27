package PZ_16.Theater;

public class Tickets extends Performance implements Reservable, Displayable{
    private int row;
    private int place;
    private int hallNum;
    private Visitors visitor;
    private boolean reserved;

    public Tickets(Visitors visitor, Performance performance, int row, int place, int hallNum) {
        super(performance.getName(), performance.getTime(), performance.getDate());
        this.row = row;
        this.place = place;
        this.hallNum = hallNum;
        this.visitor = visitor;
    }

    public Visitors getVisitor() {
        return visitor;
    }

    public int getRow() {
        return row;
    }

    public int getPlace() {
        return place;
    }

    public int getHallNum() {
        return hallNum;
    }

    @Override
    public boolean isReserved() {
        return reserved;
    }

    @Override
    public void reserve() {
        reserved = true;
    }

    @Override
    public void unreserve() {
        reserved = false;
    }

    @Override
    public String display() {
        String reservationStatus = reserved ? "Зарезервирован" : "Доступен";
        return "Ряд: " + row + "\n" +
                "Место: " + place + "\n" +
                "Номер зала: " + hallNum + "\n" +
                "Представление: " + getName() + "\n" +
                "Дата: " + getDate() + "\n" +
                "Время: " + getTime() + "\n" +
                "Посетитель: " + visitor.getFullName() + "\n" +
                "Статус: " + reservationStatus;
    }
}
