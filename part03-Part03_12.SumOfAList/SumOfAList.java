import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
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
        System.out.println();

        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}