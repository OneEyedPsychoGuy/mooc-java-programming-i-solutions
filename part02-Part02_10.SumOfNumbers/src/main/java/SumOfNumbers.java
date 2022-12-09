import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        int sum = 0;

        while(num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            sum += num;
        }
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}