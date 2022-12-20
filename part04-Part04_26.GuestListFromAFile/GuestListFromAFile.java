import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = keyboard.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                names.add(fileReader.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nEnter names, an empty line quits.");
        while(true) {
            String name = keyboard.nextLine();
            if(name.isEmpty()) {
                break;
            }

            if(names.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        keyboard.close();

        System.out.println("Thank you!");
    }
}