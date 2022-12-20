import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Filename:");
        String file = keyboard.nextLine();
        keyboard.close();

        List<Person> persons = readRecordsFromFile(file);
        System.out.println("Persons: " + persons.size());

        System.out.println("Persons:");
        for(Person person : persons) {
            System.out.println(person);
        }
    }

    public static List<Person> readRecordsFromFile(String file) {
        List<Person> persons = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                persons.add(new Person(parts[0], Integer.valueOf(parts[1])));
            }
        } catch(IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        return persons;
    }
}