import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        String command = "";

        do {
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            this.processCommand(command);
        } while(!command.equals("end"));
    }

    public void processCommand(String command) {
        switch(command) {
            case "add":
                this.add();
                break;
            case "search":
                this.search();
                break;
            case "end":
                this.end();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();

        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
        String translation = this.dictionary.translate(word);

        if(translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }

    public void end() {
        System.out.println("Bye bye!");
    }
}