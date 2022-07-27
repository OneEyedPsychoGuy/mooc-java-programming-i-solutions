import java.util.Scanner;

public class UserInterface {
    private Statistic statistic;
    private Scanner scanner;

    public UserInterface() {
        this.statistic = new Statistic();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        this.addPoints();
        this.printResults();
    }

    private void addPoints() {
        System.out.println("Enter points totals, -1 stops:");
        while(true) {
            int points = Integer.valueOf(this.scanner.nextLine());
            if(points == -1) {
                break;
            }

            this.statistic.add(points);
        }
    }

    private void printResults() {
        double averageAllPoints = this.statistic.averageAllPoints();
        double averagePassingPoints = this.statistic.averagePassingPoints();

        System.out.println("Point average (all): " + (averageAllPoints != -1.0 ? averageAllPoints : "-"));
        System.out.println("Point average (passing): " + (averagePassingPoints != -1.0 ? averagePassingPoints : "-"));
        System.out.println("Pass percentage: " + this.statistic.passPercentage());
        this.printGradeDistribution();
    }

    private void printGradeDistribution() {
        System.out.println("Grade distrbution:");
        for(int grade = 5; grade >= 0; grade--) {
            System.out.println(grade + ": " + this.printStars(this.statistic.gradeCount(grade)));
        }
    }

    private String printStars(int count) {
        String stars = "";
        while(count > 0) {
            stars += "*";
            count--;
        }
        return stars;
    }
}