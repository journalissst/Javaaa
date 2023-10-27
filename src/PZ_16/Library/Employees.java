package PZ_16.Library;

public class Employees extends Person{

    private int bornYear;
    private String pol;

    public Employees(String name, String lastname, int bornYear, String pol) {
        super(name, lastname);
        this.bornYear = bornYear;
        this.pol = pol;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getEmpl(){
        return "\n" + "Работник: " + getFullName() + "\n" +
                "Год рождения: " + getBornYear() + "\n" +
                "Пол: " + getPol();
    }

}
