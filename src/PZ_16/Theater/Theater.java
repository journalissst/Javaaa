package PZ_16.Theater;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String name;
    private List<Employees> employees;
    private List<Performance> performances;
    private List<Tickets> tickets;

    public Theater(String name) {
        this.name = name;
        employees = new ArrayList<>();
        performances = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public void addEmployee(Employees employee) {
        employees.add(employee);
    }

    public void addSchedule(Performance performance) {
        performances.add(performance);
    }

    public void sellTicket(Visitors visitor, Performance performance, int row, int place, int hallNum) {
        Tickets ticket = new Tickets(visitor, performance, row, place, hallNum);
        tickets.add(ticket);
    }
}
