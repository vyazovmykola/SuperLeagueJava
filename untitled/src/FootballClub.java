public class FootballClub {
    private String name;
    private String color;
    private int points;
    private int goalsScored;
    private int goalsConcided;


    public FootballClub(String name,String color){
        this.name = name;
        this.color = color;
        this.points = 0;
        this.goalsScored = 0;
        this.goalsConcided = 0;

    }
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
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