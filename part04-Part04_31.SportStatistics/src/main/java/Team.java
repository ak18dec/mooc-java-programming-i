public class Team {
   private String homeTeam;
   private String visitingTeam;
   private int homeTeamPoints;
   private int visitingTeamPoints;

   private int games;
   private int wins;
   private int losses;

   public Team(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
    this.homeTeam = homeTeam;
    this.visitingTeam = visitingTeam;
    this.homeTeamPoints = homeTeamPoints;
    this.visitingTeamPoints = visitingTeamPoints;
   }

   public String getHomeTeam() {
    return homeTeam;
   }

   public String getVisitingTeam() {
    return visitingTeam;
   }

   public int getHomeTeamPoints() {
    return homeTeamPoints;
   }

   public int getVisitingTeamPoints() {
    return visitingTeamPoints;
   }

   public int getGames() {
    return games;
   }

   public void playGames() {
    this.games++;
   }

   public void setWins() {
    this.wins++;
   }

   public void setLosses() {
    this.losses++;
   }

   public int getWins() {
    return wins;
   }

   public int getLosses() {
    return losses;
   }


}
