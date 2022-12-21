import java.util.List;
import java.util.ArrayList;

public class Suitcase {
    private List<Item> items;
    private int maxWeight;
    private int weight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weight = 0;
    }

    public int totalWeight() {
        return this.weight;
    }

    public void addItem(Item item) {
        if(this.weight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.weight += item.getWeight();
        }
    }

    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);
        for(Item item : this.items) {
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public void printItems() {
        for(Item item : this.items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        return this.items.size() + " item" + (this.items.size() == 1 ? "" : "s") + " (" + this.weight + " kg)";
    }
}