import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int search) {
        int count = 0;
        for(int grade : this.grades) {
            if(grade == search) {
                count++;
            }
        }
        
        return count;
    }

    public static int pointsToGrade(int points) {
        if(points < 50) {
            return 0;
        } else if(points < 60) {
            return 1;
        } else if(points < 70) {
            return 2;
        } else if(points < 80) {
            return 3;
        } else if(points < 90) {
            return 4;
        } else {
            return 5;
        }
    }

    public double averageOfGrades() {
        if(this.grades.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for(int grade : this.grades) {
            sum += grade;
        }

        return 1.0 * sum / this.grades.size();
    }

    public double averageOfPoints() {
        if(this.points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for(int p : this.points) {
            sum += p;
        }

        return 1.0 * sum / this.points.size();
    }
}