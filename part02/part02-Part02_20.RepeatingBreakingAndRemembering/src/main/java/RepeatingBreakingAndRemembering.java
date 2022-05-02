import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Give numbers:");
        while(num != -1) {
            num = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Thx! Bye!");

        scanner.close();
    }
}