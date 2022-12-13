import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String item = scanner.nextLine();
            if (item.isEmpty()) {
                break;
            }
            items.add(new Item(item));
        }
        System.out.println();

        items.forEach(System.out::println);
        scanner.close();
    }
}