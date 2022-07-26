import java.util.ArrayList;

public class Statistic {
    private static int MIN_POINTS = 0;
    private static int MAX_POINTS = 100;
    private static int PASSING_GRADE = 50;

    private ArrayList<Integer> points;

    public Statistic() {
        this.points = new ArrayList<>();
    }

    public void add(int points) {
        if(points >= MIN_POINTS && points <= MAX_POINTS) {
            this.points.add(points);
        }
    }

    public double averageAllPoints() {
        if(this.points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for(int points : this.points) {
            sum += points;
        }
        return 1.0 * sum / this.points.size();
    }

    public double averagePassingPoints() {
        if(this.points.isEmpty() || this.countPassing() == 0) {
            return -1;
        }

        int sum = 0;
        for(int points : this.points) {
            if(points >= PASSING_GRADE) sum += points;
        }
        return 1.0 * sum / this.countPassing();
    }

    public double passPercentage() {
        return 100.0 * this.countPassing() / this.points.size();
    }

    public int countPassing() {
        int count = 0;
        for(int points : this.points) {
            if(points >= PASSING_GRADE) count++;
        }
        return count;
    }
}