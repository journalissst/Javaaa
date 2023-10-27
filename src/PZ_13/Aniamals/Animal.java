package PZ_13.Aniamals;

class Animal{
    public String name;
    public String type;
    public int age;
    public double weight;
    public boolean isSwim;
    public boolean isWalk;
    public boolean isFly;


    public Animal(){
        this.type = type;
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
        this.isFly = false;
        this.isSwim = false;
        this.isWalk = false;
    }
    public Animal(String type, int age){
        this.type = type;
        this.name = "No Name";
        this.age = 0;
        this.weight = 0.0;
        this.isFly = false;
        this.isSwim = false;
        this.isWalk = false;
    }
    public Animal(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public boolean getSwim() {
        return isSwim;
    }
    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean getFly() {
        return isFly;
    }
    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean getWalk() {
        return isWalk;
    }
    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public void display(){
        System.out.println("Тип: "+type);
        System.out.println("Имя: "+name);
        System.out.println("Возраст: "+age);
        System.out.println("Вес: "+weight);
        System.out.println("Умеет летать: "+(isFly ? "Да" : "Нет"));
        System.out.println("Умеет ходить: "+(isWalk ? "Да" : "Нет"));
        System.out.println("Умеет плавать: "+(isSwim ? "Да" : "Нет")+"\n");
    }

    public void rename(String newName){
        this.name = newName;
    }

    public void holiday(){
        this.weight = weight + 0.1;
    }
    public void holiday(double m){
        this.weight = weight + 0.1 * m;
    }
    public void holiday(double m, int n){
        this.weight = n*(weight + 0.1 * m);
    }
}