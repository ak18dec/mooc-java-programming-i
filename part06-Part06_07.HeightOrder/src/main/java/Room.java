import java.util.ArrayList;
import java.util.Comparator;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if(isEmpty()) return null;

        return persons.stream().min(Comparator.comparingInt(Person::getHeight)).get();
    }

    public Person take() {
        Person shortestPerson = shortest();
        persons.remove(shortestPerson);
        return shortestPerson;
    }
}
