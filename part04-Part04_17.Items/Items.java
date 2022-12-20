import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        while(true) {
            System.out.print("Name: ");
            String item = scanner.nextLine();
            if(item.isEmpty()) {
                break;
            }
            items.add(new Item(item));
        }
        scanner.close();
        System.out.println();

        for(Item item : items) {
            System.out.println(item);
        }
    }
}