package PZ_15.First;

public class Main {
    public static void main(String[] args) {
        HighRiseBuilding bj = new HighRiseBuilding("Burj Khalifa ",
                "Sheikh Mohammed bin Rashid Blvd - Downtown Dubai - Dubai - ОАЭ",
                2010, "Эдриан Смит", true, 830, 163, false);
        System.out.println(bj.toString());
        bj.display();
        bj.hasMeetingRooms();
        bj.isOpenOnWeekends();
        bj.setOperatingHours("All day");

        House ct = new House(4,
                125, true, "Cute Home", "Arbat 204", 1930, "Big Boy", false);
        System.out.println(ct.toString());
        ct.display();
        ct.isHaveGarden();
        ct.setRoomsCount(5);
        ct.calculateSquare();
    }
}
