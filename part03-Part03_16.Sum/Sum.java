import java.util.ArrayList;

public class Sum {
    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }
}