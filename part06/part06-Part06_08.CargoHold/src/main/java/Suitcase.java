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

    public void printItems() {
        for(Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        return this.items.size() + " item" + (this.items.size() == 1 ? "" : "s") + " (" + this.currentWeight + " kg)";
    }
}