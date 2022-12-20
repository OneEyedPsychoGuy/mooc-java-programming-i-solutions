import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }
            nums.add(num);
        }
        scanner.close();
        System.out.println();

        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}