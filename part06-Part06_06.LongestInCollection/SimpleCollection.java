import java.util.List;
import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private List<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public List<String> getElements() {
        return this.elements;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public String longest() {
        if(this.elements.isEmpty()) {
            return null;
        }

        String longest = this.elements.get(0);
        for(String element : this.elements) {
            if(element.length() > longest.length()) {
                longest = element;
            }
        }

        return longest;
    }
}