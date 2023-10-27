package PZ_16.Theater;

public class Person {
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.lastname = lastname;
        this.name = name;
    }

    public String getFullName() {
        return name + " " + lastname;
    }
}
