public class Bird {
    private String englishName;
    private String latinName;
    private int observations;

    public Bird(String englishName, String latinName) {
        this.englishName = englishName;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void increaseObservationCount() {
        this.observations++;
    }

    public boolean hasName(String name) {
        return this.englishName.equals(name) || this.latinName.equals(name);
    }

    @Override
    public String toString() {
        return this.englishName + " (" + this.latinName + "): " + this.observations + " observation" + (this.observations == 1 ? "" : "s");
    }
}