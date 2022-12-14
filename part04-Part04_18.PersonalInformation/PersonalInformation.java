public class PersonalInformation {
    private String id;
    private String firstName;
    private String lastName;

    public PersonalInformation(String firstName, String lastName, String id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getIdentificationNumber() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + " (" + this.id + ")";
    }
}