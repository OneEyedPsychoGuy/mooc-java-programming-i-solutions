import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Statistic {
    private static int MIN_POINTS = 0;
    private static int MAX_POINTS = 100;
    private static int PASSING_GRADE = 50;

    private List<Integer> points;
    private Map<Integer, Integer> gradeCounts;

    public Statistic() {
        this.points = new ArrayList<>();
        this.gradeCounts = new HashMap<>();
    }

    public void add(int points) {
        if(this.isPointsInRange(points)) {
            this.points.add(points);

            int grade = this.grade(points);
            this.gradeCounts.put(grade, this.gradeCounts.getOrDefault(grade, 0) + 1);
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
        int passingCount = this.countPassing();
        if(this.points.isEmpty() || passingCount == 0) {
            return -1;
        }

        int sum = 0;
        for(int points : this.points) {
            if(points >= PASSING_GRADE) sum += points;
        }
        return 1.0 * sum / passingCount;
    }

    public double passPercentage() {
        return 100.0 * this.countPassing() / this.points.size();
    }

    public int gradeCount(int grade) {
        return this.gradeCounts.getOrDefault(grade, 0);
    }

    private int grade(int points) {
        if(!this.isPointsInRange(points)) {
            throw new IllegalArgumentException("Points must be in range");
        }

        if(points >= 90) {
            return 5;
        } else if(points >= 80) {
            return 4;
        } else if(points >= 70) {
            return 3;
        } else if(points >= 60) {
            return 2;
        } else if(points >= 50) {
            return 1;
        } else {
            return 0;
        }
    }

    private int countPassing() {
        int count = 0;
        for(int points : this.points) {
            if(points >= PASSING_GRADE) count++;
        }
        return count;
    }

    private boolean isPointsInRange(int points) {
        return points >= MIN_POINTS && points <= MAX_POINTS;
    }
}