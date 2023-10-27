package PZ_15.First;

public class PoliceDepartament extends Building{
    private int coopsCount;
    private float square;
    private int prisonersCount;

    public PoliceDepartament(int coopsCount, float square, int prisonersCount, String name,
                 String address, int builtYear, String arhName, boolean itIsCulture){
        super(name, address, builtYear, arhName, itIsCulture);
        this.coopsCount = coopsCount;
        this.square = square;
        this.prisonersCount = prisonersCount;
    }

    @Override
    public void display(){
        System.out.println("It is a PoliceDepartament");
    }

    public String toString(){
        return super.toString() + "Coops Count" + coopsCount + "\n" + "Square" + square + "\n" +
                "Count of zeks" + prisonersCount;
    }

}
