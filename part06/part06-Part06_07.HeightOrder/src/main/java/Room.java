import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public Person shortest() {
        if(persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);
        for(Person person : persons) {
            if(shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }
}