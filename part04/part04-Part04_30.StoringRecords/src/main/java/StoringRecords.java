import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scanner.nextLine();

        ArrayList<Person> persons = readRecordsFromFile(file);
        System.out.println("Persons: " + persons.size());

        System.out.println("Persons:");
        for (Person person : persons) {
            System.out.println(person);
        }

        scanner.close();
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String[] row = fileReader.nextLine().split(",");
                persons.add(new Person(row[0], Integer.valueOf(row[1])));
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        return persons;
    }
}