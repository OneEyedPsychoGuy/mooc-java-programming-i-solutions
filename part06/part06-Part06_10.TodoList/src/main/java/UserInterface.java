import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        String command = "";

        do {
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            this.processCommand(command);
        } while(!command.equals("stop"));
    }

    public void processCommand(String command) {
        switch(command) {
            case "add":
                this.add();
                break;
            case "list":
                this.list();
                break;
            case "remove":
                this.remove();
                break;
            case "stop":
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("To add: ");
        this.list.add(this.scanner.nextLine());
    }

    public void list() {
        this.list.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        this.list.remove(Integer.valueOf(this.scanner.nextLine()));
    }
}