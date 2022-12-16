import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999) {
                break;
            }
            nums.add(num);
        }
        scanner.close();
        System.out.println();

        int smallest = nums.get(0);
        for(Integer num : nums) {
            if(num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest number: " + smallest);

        for(int i = 0; i < nums.size(); i++) {
            if(smallest == nums.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}