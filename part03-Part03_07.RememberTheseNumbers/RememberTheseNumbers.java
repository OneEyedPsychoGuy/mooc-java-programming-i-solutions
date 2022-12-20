import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
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

        for(Integer num : nums) {
            System.out.println(num);
        }
    }
}