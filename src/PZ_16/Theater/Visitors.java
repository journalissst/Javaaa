package PZ_16.Theater;

import java.util.ArrayList;
import java.util.List;

public class Visitors extends Person {
    private List<Tickets> tickets;

    public Visitors(String name, String lastname) {
        super(name, lastname);
        tickets = new ArrayList<>();
    }

    public void addTicket(Tickets ticket) {
        tickets.add(ticket);
    }

    public String getTickets() {
        return "Билетов у " + getFullName() + " " +  tickets.size() + "\n";
    }
}
