import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());
        scanner.close();

        if(value > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}