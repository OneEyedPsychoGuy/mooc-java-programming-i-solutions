public class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
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
            this.height == person.height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }
}