package PZ_15.First;

public abstract class Building {
    private String name;
    private String address;
    private int builtYear;
    private String arhName;
    private boolean itIsCulture;

    public Building(String name, String address, int builtYear, String arhName, boolean itIsCulture){
        this.name = name;
        this.address = address;
        this.builtYear = builtYear;
        this.arhName = arhName;
        this.itIsCulture = itIsCulture;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nYear Built: " + builtYear
                + "\nArchitect Name: " + arhName + "\nCultural: " + itIsCulture;
    }

}
