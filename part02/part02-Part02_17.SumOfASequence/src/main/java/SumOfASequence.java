import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int last = 0;
        
        System.out.print("Last number? ");
        last = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

        scanner.close();
    }
}