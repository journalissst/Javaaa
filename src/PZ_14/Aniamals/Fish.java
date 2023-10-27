package PZ_14.Aniamals;

final class Fish extends Animal {
    private String squamo;
    private boolean upStreamSwim;

    {
        squamo = "None";
        upStreamSwim = false;
    }

    //    public Fish(){
//        super();
//    }
    public Fish(String squamo, boolean upStreamSwim, String type, String name, int age, double weight, boolean isWalk, boolean isFly){
        super(type, name, age, weight, true, isWalk, isFly);
        this.squamo = squamo;
        this.upStreamSwim = upStreamSwim;
    }
    public void bul_bul(){
        System.out.println("Bul-bul\n");
    }

    public String getSquamo() {
        return squamo;
    }

    public void setSquamo(String squamo) {
        this.squamo = squamo;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void display() {
        System.out.println("I am a "+ getClass().getName());
        super.display();
        System.out.println("Squamo type: " + getSquamo());
        System.out.println("Upstream swim ability: " + isUpStreamSwim());
    }
}