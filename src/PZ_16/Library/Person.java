package PZ_16.Library;

public class Person{
    private String name;
    private String lastname;

    public Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getFullName(){
        return name + " " + lastname;
    }

}
