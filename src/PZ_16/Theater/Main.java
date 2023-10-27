package PZ_16.Theater;

public class Main {
    public static  void main(String[] args){
        Performance rj = new Performance("Ромео и Джульетта", "16:30", "13-12-2023");
        Performance s = new Performance("Собака на сене", "19:00", "10-10-2023");
        Performance gr = new Performance("Горе от ума", "14:00", "20-11-2023");
        Performance gam  = new Performance("Гамлет", "18:00", "05-01-2024");

        Theater tr = new Theater("Самый крутой театр");
        tr.addSchedule(rj);
        tr.addSchedule(s);
        tr.addSchedule(gr);
        tr.addSchedule(gam);

        Employees v = new Employees("Вася", "Кек", "Охрана", 14200);
        Employees m = new Employees("Марине", "Васькина", "Касса", 20000);
        Employees sb = new Employees("Сабина", "Жук", "Гардероб", 19000);
        Employees mg = new Employees("Мага", "Хабиб", "Буфет", 100000);
        tr.addEmployee(v);
        tr.addEmployee(m);
        tr.addEmployee(sb);
        tr.addEmployee(mg);
        System.out.println(mg.display());

        Visitors v1 = new Visitors("Александр", "Пушкинов");Visitors v2 = new Visitors("Иван", "Иванов");
        Visitors v3 = new Visitors("Екатерина", "Смирнова");Visitors v4 = new Visitors("Андрей", "Кузнецов");
        Visitors v5 = new Visitors("Ольга", "Петрова");Visitors v6 = new Visitors("Сергей", "Соколов");
        Visitors v7 = new Visitors("Мария", "Козлова");Visitors v8 = new Visitors("Дмитрий", "Морозов");
        Visitors v9 = new Visitors("Анна", "Новикова");Visitors v10 = new Visitors("Павел", "Федоров");
        Visitors v11 = new Visitors("Елена", "Семенова");Visitors v12 = new Visitors("Николай", "Григорьев");
        Visitors v13 = new Visitors("Олеся", "Волкова");Visitors v14 = new Visitors("Геннадий", "Горин");
        Visitors v15 = new Visitors("Татьяна", "Лебедева");




        Actors act1 = new Actors("Ахрип", "Мухтаров", "Сцена", 20000, 1.5);
        Actors act2 = new Actors("Игорь", "Петров", "Сцена", 25000, 1.7);
        Actors act3 = new Actors("Надежда", "Сидорова", "Сцена", 18000, 1.6);
        Actors act4 = new Actors("Андрей", "Козлов", "Сцена", 30000, 1.8);
        Actors act5 = new Actors("Екатерина", "Иванова", "Сцена", 22000, 1.65);
        System.out.println(act3.display());


        Tickets tk1 = new Tickets(v7, rj, 5, 12, 1);
        Tickets tk2 = new Tickets(v12, gam, 3, 1, 2);
        Tickets tk3 = new Tickets(v2, gr, 5, 1, 1);
        Tickets tk4 = new Tickets(v3, s, 2, 5, 2);
        Tickets tk5 = new Tickets(v7, s, 8, 2, 1);
        Tickets tk6 = new Tickets(v4, rj, 1, 11, 1);
        Tickets tk7 = new Tickets(v10, gam, 4, 3, 1);
        Tickets tk8 = new Tickets(v9, rj, 12, 2, 2);
        tr.sellTicket(v7, rj, 5, 12, 1);
        tr.sellTicket(v12, gam, 3, 1, 2);
        tr.sellTicket(v2, gr, 5, 1, 1);
        tr.sellTicket(v3, s, 2, 5, 2);
        tr.sellTicket(v7, s, 8, 2, 1);
        tr.sellTicket(v4, rj, 1, 11, 1);
        tr.sellTicket(v10, gam, 4, 3, 1);
        tr.sellTicket(v9, rj, 12, 2, 2);

        v3.addTicket(tk4);
        v7.addTicket(tk5);
        v7.addTicket(tk1);
        System.out.println(v7.getTickets());
        tk4.reserve();
        System.out.println(tk4.display());

    }
}
