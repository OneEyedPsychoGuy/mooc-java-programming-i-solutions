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

    public void addPoints() {
        System.out.println("Enter points totals, -1 stops:");
        while(true) {
            int points = Integer.valueOf(this.scanner.nextLine());
            if(points == -1) {
                break;
            }

            this.statistic.add(points);
        }
    }

    public void printResults() {
        double averageAllPoints = this.statistic.averageAllPoints();
        double averagePassingPoints = this.statistic.averagePassingPoints();

        System.out.println("Point average (all): " + (averageAllPoints != -1.0 ? averageAllPoints : "-"));
        System.out.println("Point average (passing): " + (averagePassingPoints != -1.0 ? averagePassingPoints : "-"));
        System.out.println("Pass percentage: " + this.statistic.passPercentage());
    }
}