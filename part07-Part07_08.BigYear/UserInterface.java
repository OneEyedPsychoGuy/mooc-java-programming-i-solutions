import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserInterface {
    private List<Bird> birds;
    private Scanner keyboard;

    public UserInterface() {
        this.birds = new ArrayList<>();
        this.keyboard = new Scanner(System.in);
    }

    public void start() {
        while(true) {
            System.out.print("? ");
            String command = this.keyboard.nextLine();
            if(command.equals("Quit")) break;
            this.processCommand(command);
        }
    }

    private void processCommand(String command) {
        switch(command) {
            case "Add":
                this.addBird();
                break;
            case "Observation":
                this.addObservation();
                break;
            case "All":
                this.printAllBirds();
                break;
            case "One":
                this.printOneBird();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private void addBird() {
        System.out.print("Name: ");
        String english = this.keyboard.nextLine();
        System.out.print("Name in Latin: ");
        String latin = this.keyboard.nextLine();

        this.birds.add(new Bird(english, latin));
    }

    private void addObservation() {
        System.out.print("Bird? ");
        String name = this.keyboard.nextLine();

        for(Bird bird : this.birds) {
            if(bird.hasName(name)) {
                bird.increaseObservationCount();
                return;
            }
        }

        System.out.println("Not a bird!");
    }

    private void printAllBirds() {
        for(Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    private void printOneBird() {
        System.out.print("Bird? ");
        String name = this.keyboard.nextLine();

        for(Bird bird : this.birds) {
            if(bird.hasName(name)) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println("Not a bird!");
    }
}