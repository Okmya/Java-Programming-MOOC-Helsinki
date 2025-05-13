
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String nameOfTeam = scan.nextLine();
        int countOfGames = 0;
        int countOfWins = 0;
        int countOfLosses = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                //System.out.println(parts[0] + parts[1] + parts[2] + parts[3]);
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
                if (nameOfTeam.equals(parts[0]) || nameOfTeam.equals(parts[1])) {
                    countOfGames += 1;
                    if ((nameOfTeam.equals(parts[0]) && score1 > score2) || (nameOfTeam.equals(parts[1]) && score1 < score2)) {
                        countOfWins += 1;

                    } else {
                        countOfLosses += 1;
                    }
                }

            }
            System.out.println("Games: " + countOfGames);
            System.out.println("Wins: " + countOfWins);
            System.out.println("Losses: " + countOfLosses);

        } catch (Exception e) {
            System.out.println("not working");
        }

    }

}
