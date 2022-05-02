import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, sum = 0, count = 0;
        
        System.out.println("Give numbers:");
        while(true) {
            num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }

            count++;
            sum += num;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));

        scanner.close();
    }
}