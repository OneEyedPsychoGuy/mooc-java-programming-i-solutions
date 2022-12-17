import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {
        try(Scanner fileReader = new Scanner(Paths.get("data.txt"))) {
            while(fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}