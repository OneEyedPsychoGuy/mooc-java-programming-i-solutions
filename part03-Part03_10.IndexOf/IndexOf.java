import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        System.out.println("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < nums.size(); i++) {
            if(search == nums.get(i)) {
                System.out.println(search + " is at index " + i);
            }
        }

        scanner.close();
    }
}