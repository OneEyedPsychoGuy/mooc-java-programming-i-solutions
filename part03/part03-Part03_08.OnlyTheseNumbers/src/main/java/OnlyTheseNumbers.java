import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            nums.add(num);
        }

        System.out.println("From where? ");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        for(int i = from; i <= to; i++) {
            System.out.println(nums.get(i));
        }
        
        scanner.close();
    }
}