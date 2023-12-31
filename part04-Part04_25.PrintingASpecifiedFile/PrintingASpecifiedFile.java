import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = keyboard.nextLine();
        keyboard.close();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}