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
        String reset = "\u001B[0m";
        int i = 1;
        System.out.println("Clubs participate:");
        for (FootballClub club : league){
            System.out.println(
                    club.getColor() + i + ". " + club.getName());
            i++;
        }
        System.out.println(reset);
    }
    public static void main(String[] args){
        league.add(new FootballClub("Atalanta", "\u001B[38;2;142;184;219m"));
        league.add(new FootballClub("AC Milan", "\u001B[38;2;253;132;133m"));
        league.add(new FootballClub("Arsenal", "\u001B[38;2;247;128;131m"));
        league.add(new FootballClub("Aston Villa", "\u001B[38;2;179;134;154m"));
        league.add(new FootballClub("Benfica", "\u001B[38;2;243;127;127m"));
        league.add(new FootballClub("Barca", "\u001B[38;2;127;166;203m"));
        league.add(new FootballClub("Bayern Munich", "\u001B[38;2;237;130;150m"));
        league.add(new FootballClub("Copenhagen", "\u001B[38;2;127;151;181m"));
        league.add(new FootballClub("Chelsea", "\u001B[38;2;129;162;201m"));
        league.add(new FootballClub("Como", "\u001B[38;2;127;164;200m"));
        league.add(new FootballClub("Deportivo La Corunia", "\u001B[38;2;127;173;212m"));
        league.add(new FootballClub("Monaco", "\u001B[38;2;242;127;145m"));
        league.add(new FootballClub("Stoke City", "\u001B[38;2;239;139;150m"));
        league.add(new FootballClub("Shakhtar Donieck", "\u001B[38;2;255;179;143m"));
        league.add(new FootballClub("Tottenham", "\u001B[38;2;137;144;171m"));
        league.add(new FootballClub("Wolves", "\u001B[38;2;254;220;137m"));




        StartMenu();
    }
}