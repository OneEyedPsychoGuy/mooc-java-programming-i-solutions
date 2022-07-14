import java.util.Scanner;

public class TextUI {
    private Scanner userInput;
    private SimpleDictionary dictionary;

    public TextUI(Scanner userInput, SimpleDictionary dictionary) {
        this.userInput = userInput;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userCommand = userInput.nextLine();

            if(userCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            System.out.println("Unknown command");
        }
    }
}