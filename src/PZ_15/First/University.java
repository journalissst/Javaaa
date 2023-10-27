package PZ_15.First;

public class University extends Building{
    private int studentsCount;
    private String napravlenie;
    private  float prohBall;

    public University(String name, String address, int buildYear, String arhName, boolean itIsCulture,
                      String napravlenie, float prohBall, int studentsCount ){
        super(name, address, buildYear, arhName, itIsCulture);
        this.napravlenie = napravlenie;
        this.prohBall = prohBall;
        this.studentsCount = studentsCount;
    }

    @Override
    public void display() {
        System.out.println("This is a University.");
    }

    @Override
    public String toString(){
        return super.toString() + "Students count: " + studentsCount + "\n" +
                "Napravlenie" + napravlenie + "\n" + "Prohodnoi ball" + prohBall + "\n";
    }

}
