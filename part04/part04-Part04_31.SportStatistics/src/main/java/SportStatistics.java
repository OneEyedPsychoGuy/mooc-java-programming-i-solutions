import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            int games = 0;
            int wins = 0;
            int losses = 0;

            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] row = line.split(",");
                    
                String homeTeam = row[0];
                String visitingTeam = row[1];
                int homeTeamPoints = Integer.valueOf(row[2]);
                int visitingTeamPoints = Integer.valueOf(row[3]);

                if(line.contains(team)) {
                    games++;
                    if(homeTeam.equals(team) && homeTeamPoints > visitingTeamPoints ||
                    visitingTeam.equals(team) && visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();
    }
}