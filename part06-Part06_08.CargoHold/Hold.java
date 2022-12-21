import java.util.List;
import java.util.ArrayList;

public class Hold {
    private List<Suitcase> suitcases;
    private int maxWeight;
    private int weight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(this.weight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for(Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if(this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        return this.suitcases.size() + " suitcase" + (this.suitcases.size() == 1 ? "" : "s") + " (" + this.weight + " kg)";
    }
}