import java.util.Scanner;

public class UserInterface {
    private GradeStatistics distribution;
    private Scanner scanner;

    public UserInterface() {
        this.distribution = new GradeStatistics();
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

            this.distribution.add(points);
        }
    }

    private void printResults() {
        double averageAllPoints = this.distribution.averageAllPoints();
        double averagePassingPoints = this.distribution.averagePassingPoints();

        System.out.println("Point average (all): " + (averageAllPoints != -1.0 ? averageAllPoints : "-"));
        System.out.println("Point average (passing): " + (averagePassingPoints != -1.0 ? averagePassingPoints : "-"));
        System.out.println("Pass percentage: " + this.distribution.passPercentage());
        this.printGradeDistribution();
    }

    private void printGradeDistribution() {
        System.out.println("Grade distrbution:");
        for(int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            this.printStars(this.distribution.gradeCount(grade));
        }
    }

    private void printStars(int stars) {
        while(stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println();
    }
}