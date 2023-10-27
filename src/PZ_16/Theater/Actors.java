package PZ_16.Theater;

public class Actors extends Employees implements Displayable{
    private double experience;

    public Actors(String name, String lastname, String zone, double salary, double experience) {
        super(name, lastname, zone, salary);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String display() {
        return "Актёр: " + getFullName() + "\n" +
                "Актерский стаж: " + experience + "\n";
    }
}
