package PZ_14.Aniamals;

class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;

    {
        wingCount = 0;
        likeJesus = false;
    }
//    public Insect(){
//        super();
//    }

    public Insect(int wingCount, boolean likeJesus, String type, String name, int age, double weight, boolean isSwim, boolean isFly){
        super(type, name, age, weight, isSwim, true, isFly);
    }
    public void ggg(){
        System.out.println("Ggggg");
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public void display() {
        System.out.println("I am an "+ getClass().getName());
        super.display();
        System.out.println("Can walk: " + getWalk());
        System.out.println("My wing count: " + getWingCount());
    }
}