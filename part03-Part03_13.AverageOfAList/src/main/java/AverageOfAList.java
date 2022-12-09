import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        System.out.println("");

        int sum = 0;
        int count = 0;
        for(Integer num : list) {
            sum += num;
            count++;
        }

        System.out.println("Average: " + (1.0 * sum / count));
        scanner.close();
    }
}