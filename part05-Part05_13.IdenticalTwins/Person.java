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

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        return this.name.equals(person.name) &&
            this.birthday.equals(person.birthday) &&
            this.height == person.height &&
            this.weight == person.weight;
    }
}