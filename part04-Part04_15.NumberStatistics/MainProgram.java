import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statAll = new Statistics();
        Statistics statEven = new Statistics();
        Statistics statOdd = new Statistics();
 
        System.out.println("Enter numbers:");
        while(true) {
            int answer = Integer.valueOf(scanner.nextLine());
            if(answer == -1) {
                break;
            }
 
            statAll.addNumber(answer);
            if(answer % 2 == 0) {
                statEven.addNumber(answer);
            } else {
                statOdd.addNumber(answer);
            }
        }
        scanner.close();
 
        System.out.println("Sum: " + statAll.sum());
        System.out.println("Sum of even numbers: " + statEven.sum());
        System.out.println("Sum of odd numbers: " + statOdd.sum());
    }
}