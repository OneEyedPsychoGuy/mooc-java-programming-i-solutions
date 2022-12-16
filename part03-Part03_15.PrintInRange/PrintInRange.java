import java.util.ArrayList;

public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> nums, int lower, int upper) {
        for(Integer num : nums) {
            if(num >= lower && num <= upper) {
                System.out.println(num);
            }
        }
    }
}