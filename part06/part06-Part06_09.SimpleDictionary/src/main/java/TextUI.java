import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userCommand = scanner.nextLine();

            if(userCommand.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
            } else if(userCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}