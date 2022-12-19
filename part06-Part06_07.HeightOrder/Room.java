import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public Person take() {
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }

    public Person shortest() {
        if(this.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);
        for(Person person : this.persons) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }
}