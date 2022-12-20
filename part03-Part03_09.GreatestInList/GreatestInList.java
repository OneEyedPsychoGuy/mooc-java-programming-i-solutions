import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
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

        int greatest = nums.get(0);
        for(Integer num : nums) {
            if(num > greatest) {
                greatest = num;
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}