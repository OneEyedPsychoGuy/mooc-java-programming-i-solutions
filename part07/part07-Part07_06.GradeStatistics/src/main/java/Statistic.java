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

    public double averageAllPoints() {
        if(this.points.size() == 0) {
            return -1;
        }

        int sum = 0;
        for(int points : this.points) {
            sum += points;
        }
        return 1.0 * sum / this.points.size();
    }

    public double averagePassingPoints() {
        if(this.points.size() == 0) {
            return -1;
        }

        int sum = 0, count = 0;
        for(int points : this.points) {
            if(points >= 50) {
                count++;
                sum += points;
            }
        }

        if(count == 0) {
            return -1;
        }

        return 1.0 * sum / count;
    }
}