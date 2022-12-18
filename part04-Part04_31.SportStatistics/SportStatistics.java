import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("File:");
        String file = keyboard.nextLine();
        System.out.println("Team:");
        String search = keyboard.nextLine();
        keyboard.close();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            int games = 0;
            int wins = 0;
            int losses = 0;

            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                    
                String home = parts[0];
                String visiting = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if(line.contains(search)) {
                    games++;
                    if(home.equals(search) && homePoints > visitingPoints ||
                    visiting.equals(search) && visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch(IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}