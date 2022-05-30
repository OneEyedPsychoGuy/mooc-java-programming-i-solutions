import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Statistics stat = new Statistics();
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter numbers:");
        while(true) {
            int answer = Integer.valueOf(scanner.nextLine());
            if(answer == -1) {
                break;
            }
            stat.addNumber(answer);
        }
 
        System.out.println("Sum: " + stat.sum());
        scanner.close();
    }
}