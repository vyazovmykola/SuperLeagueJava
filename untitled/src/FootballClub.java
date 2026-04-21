public class FootballClub {
    private String name;
    private String color;
    private int matchesplayed;
    public int points;
    private int goalsScored;
    private int goalsConcided;
    private int id;


    public FootballClub(String name,int id,String color){
        this.id = id;
        this.name = name;
        this.matchesplayed = 0;
        this.color = color;
        this.points = 0;
        this.goalsScored = 0;
        this.goalsConcided = 0;

    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getmatchesplayed(){
        return matchesplayed;
    }

    public int getPoints(){
        return points;
    }

    public int getGoalsScored(){
        return goalsScored;
    }

    public int getGoalsConcided(){
        return goalsConcided;
    }

    public int getGoalsDifference(){
        return goalsScored - goalsConcided;
    }
}