
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        ArrayList<Team> records = readFile(file);

        Team data = processRecords(records, teamName);

        System.out.println("Games: " + data.getGames());
        System.out.println("Wins: " + data.getWins());
        System.out.println("Losses: " + data.getLosses());

        

    }

    public static ArrayList<Team> readFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                teams.add(new Team(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }

    public static Team processRecords(ArrayList<Team> teams, String teamName) {

        Team resultTeam = new Team(teamName, null, 0 , 0);

        for(Team team : teams) {
            if(team.getHomeTeam().contains(teamName)) {
                resultTeam.playGames();
                if(team.getHomeTeamPoints() >= team.getVisitingTeamPoints()) {
                    resultTeam.setWins();
                }else {
                    resultTeam.setLosses();
                }
            }else if(team.getVisitingTeam().contains(teamName)) {
                resultTeam.playGames();
                if(team.getVisitingTeamPoints() >= team.getHomeTeamPoints()) {
                    resultTeam.setWins();
                }else {
                    resultTeam.setLosses();
                }
            }
        }
        return resultTeam;

    }

    

}
