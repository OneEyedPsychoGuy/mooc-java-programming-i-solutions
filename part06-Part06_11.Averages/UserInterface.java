import java.util.Scanner;

public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println();
        printGradeDistribution();
    }

    public void readPoints() {
        while(true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);
            if(points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        for(int grade = 5; grade >= 0; grade--) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();
        }

        System.out.println("The average of points: " + this.register.averageOfPoints());
        System.out.println("The average of grades: " + this.register.averageOfGrades());
    }

    public static void printStars(int stars) {
        while(stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}