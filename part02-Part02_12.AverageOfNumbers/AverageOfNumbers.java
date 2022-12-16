import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        int count = -1;
        int sum = 0;

        while(num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            count++;
            sum += num;
        }
        scanner.close();
        
        System.out.println("Average of the numbers: " + (1.0 * sum / count));
    }
}