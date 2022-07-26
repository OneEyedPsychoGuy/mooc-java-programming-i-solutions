import java.util.ArrayList;

public class Statistic {
    private ArrayList<Integer> points;

    public Statistic() {
        this.points = new ArrayList<>();
    }

    public void add(int points) {
        if(points >= 0 && points <= 100) {
            this.points.add(points);
        }
    }

    public double averagePoints() {
        int sum = 0;
        for(int points : this.points) {
            sum += points;
        }
        return 1.0 * sum / this.points.size();
    }
}