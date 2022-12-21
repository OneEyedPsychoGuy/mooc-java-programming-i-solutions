import java.util.List;
import java.util.ArrayList;

public class Package {
    private List<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for(Gift gift : gifts) {
            weight += gift.getWeight();
        }
        return weight;
    }
}