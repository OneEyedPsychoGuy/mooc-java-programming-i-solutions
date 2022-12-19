public class Bird {
    private String english;
    private String latin;
    private int observations;

    public Bird(String english, String latin) {
        this.english = english;
        this.latin = latin;
        this.observations = 0;
    }

    public void increaseObservationCount() {
        this.observations++;
    }

    public boolean hasName(String name) {
        return this.english.equals(name) || this.latin.equals(name);
    }

    @Override
    public String toString() {
        return this.english + " (" + this.latin + "): " + this.observations + " observation" + (this.observations == 1 ? "" : "s");
    }
}