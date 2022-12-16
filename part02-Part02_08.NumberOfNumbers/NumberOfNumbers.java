import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        int count = -1;

        while(number != 0) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            count++;
        }
        scanner.close();

        System.out.println("Number of numbers: " + count);
    }
}