import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        while(true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
        
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String id = scanner.nextLine();
        
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        scanner.close();
        System.out.println();

        infoCollection.forEach(info -> System.out.println(info.getFirstName() + " " + info.getLastName()));
    }
}