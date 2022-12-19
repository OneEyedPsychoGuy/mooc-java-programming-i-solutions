import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        String command = "";

        while(true) {
            this.menu();
            command = this.scanner.nextLine();
            if(command.equals("X")) {
                break;
            }

            this.processCommand(command);
        }
    }

    public void menu() {
        System.out.println(
            "Commands:\n" +
            "1 - add a joke\n" +
            "2 - draw a joke\n" +
            "3 - list jokes\n" +
            "X - stop"
        );
    }

    public void processCommand(String command) {
        switch(command) {
            case "1":
                this.add();
                break;
            case "2":
                this.draw();
                break;
            case "3":
                this.list();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        this.manager.addJoke(this.scanner.nextLine());
    }

    public void draw() {
        System.out.println("Drawing a joke:");
        System.out.println(this.manager.drawJoke());
    }

    public void list() {
        System.out.println("Printing the jokes:");
        this.manager.printJokes();
    }
}