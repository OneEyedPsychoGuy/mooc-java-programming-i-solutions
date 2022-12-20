import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            list.add(input);
        }
        scanner.close();

        System.out.println("In total: " + list.size());
    }
}