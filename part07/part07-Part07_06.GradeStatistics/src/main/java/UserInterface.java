import java.util.Scanner;

public class UserInterface {
    private Statistic statistic;
    private Scanner scanner;

    public UserInterface() {
        this.statistic = new Statistic();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");
        while(true) {
            int points = Integer.valueOf(this.scanner.nextLine());
            if(points == -1) {
                break;
            }

            this.statistic.add(points);
        }
        System.out.println("Point average (all): " + this.statistic.averagePoints());
    }
}