import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean alex = username.equals("alex") && password.equals("sunshine");
        boolean emma = username.equals("emma") && password.equals("haskell");

        if(alex || emma) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        scanner.close();
    }
}