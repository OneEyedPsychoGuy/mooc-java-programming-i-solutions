import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }

            Archive archive = new Archive(id, title);
            if(!archives.contains(archive)) {
                archives.add(archive);
            }
        }
        
        System.out.println("==Items==");
        for(Archive archive : archives) {
            System.out.println(archive);
        }
        scanner.close();
    }
}