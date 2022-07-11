import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if(this.currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public String toString() {
        return items.size() + " items (" + this.currentWeight + " kg)";
    }
}