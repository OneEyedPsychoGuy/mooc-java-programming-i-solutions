import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String[] row = fileReader.nextLine().split(",");
                System.out.println(row[0] + ", age: " + row[1] + (row[1].equals("1") ? " year" : " years"));
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();
    }
}