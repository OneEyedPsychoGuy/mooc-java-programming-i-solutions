import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
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

        int greatest = list.get(0);
        for(Integer num : list) {
            if(num > greatest) {
                greatest = num;
            }
        }

        System.out.println("The greatest number: " + greatest);
        scanner.close();
    }
}