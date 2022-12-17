public class TelevisionProgram {
    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}