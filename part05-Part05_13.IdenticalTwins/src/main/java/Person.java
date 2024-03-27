
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals (Object compared) {
        if(this == compared) return true;
        if(compared instanceof Person) {
            Person p = (Person) compared;
            if(this.getName().equals(p.getName()) && this.height == p.getHeight() && this.weight == p.getWeight() 
            && this.birthday.equals(p.getBirthday())) {
                return true;
            }
        }
        return false;
    }
}
