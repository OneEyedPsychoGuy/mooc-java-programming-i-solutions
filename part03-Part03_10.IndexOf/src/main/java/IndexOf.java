import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        System.out.println("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < list.size(); i++) {
            if(search == list.get(i)) {
                System.out.println(search + " is at index " + i);
            }
        }

        scanner.close();
    }
}