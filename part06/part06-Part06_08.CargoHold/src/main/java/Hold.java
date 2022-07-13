import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(this.currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for(Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        if(this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        return this.suitcases.size() + " suitcase" + (this.suitcases.size() == 1 ? "" : "s") + " (" + this.currentWeight + " kg)";
    }
}