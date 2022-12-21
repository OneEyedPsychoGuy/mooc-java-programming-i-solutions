import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GradeStatistics {
    private static final int MIN_POINTS = 0;
    private static final int MAX_POINTS = 100;
    private static final int PASSING_GRADE = 50;

    private List<Integer> points;
    private List<Integer> grades;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0));
    }

    public void add(int points) {
        if(this.isPointsInRange(points)) {
            this.points.add(points);

            int grade = this.grade(points);
            this.grades.set(grade, this.grades.get(grade) + 1);
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
        return this.grades.get(grade);
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