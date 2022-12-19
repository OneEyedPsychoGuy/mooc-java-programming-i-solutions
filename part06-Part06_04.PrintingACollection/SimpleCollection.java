import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        String string = "The collection " + this.name;

        if(this.elements.isEmpty()) {
            return string + " is empty.";
        }

        string += " has " + this.elements.size() + " element" + (this.elements.size() == 1 ? "" : "s") + ":";

        for(String element : this.elements) {
            string += "\n" + element;
        }

        return string;
    }
}