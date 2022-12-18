import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = keyboard.nextLine();
        keyboard.close();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + (parts[1].equals("1") ? " year" : " years"));
            }
        } catch(IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}