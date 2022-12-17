import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = keyboard.nextLine();
        System.out.println("Search for:");
        String search = keyboard.nextLine();
        keyboard.close();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            boolean found = false;

            while(fileReader.hasNextLine()) {
                if(fileReader.nextLine().equals(search)) {
                    found = true;
                    break;
                }
            }

            if(found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch(IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}