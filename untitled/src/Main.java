import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<FootballClub> league = new ArrayList<>();

    static void StartMenu() {
        System.out.println("Welcome to SuperLeague");
        System.out.println("Choose option to continue");
        System.out.println("1. View all the clubs");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        if(s1.equals("1")) printClubs();
    }

    static void printClubs() {
        System.out.println("Clubs participate:");
        for (FootballClub club : league){
            System.out.println(club.getName());
        }
    }
    public static void main(String[] args){
        league.add(new FootballClub("Wolves"));
        league.add(new FootballClub("Tottenham"));
        league.add(new FootballClub("Barca"));
        league.add(new FootballClub("Deportivo La Corunia"));
        league.add(new FootballClub("Stock city"));


        StartMenu();
    }
}