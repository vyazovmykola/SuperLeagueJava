import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static List<FootballClub> league = new ArrayList<>();

    static void StartMenu() {
        System.out.println("Welcome to SuperLeague");
        System.out.println("Choose option to continue");
        System.out.println("1. View all the clubs");
        System.out.println("2. View current table");
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        league.get(13).points += 3;//test Manchester United
        if(s1.equals("1")) printClubs();
        if(s1.equals("2")) currentTable();


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

    static void currentTable(){

        for (int i = 0; i < league.size() - 1; i++) {
            for (int j = 0; j < league.size() - i - 1; j++) {
                if (league.get(j).getPoints() < league.get(j + 1).getPoints()) {
                    FootballClub temp = league.get(j);
                    league.set(j, league.get(j + 1));
                    league.set(j + 1, temp);
                }
            }
        }

        int rank = 1;
        for (FootballClub club : league) {
            System.out.println(rank + ":" + club.getName() + ": " + club.getPoints() + " pkt");
            rank++;
        }
    }

    public static void main(String[] args){
        league.add(new FootballClub("Atalanta             ",1, "\u001B[38;2;142;184;219m"));
        league.add(new FootballClub("AC Milan             ",2, "\u001B[38;2;253;132;133m"));
        league.add(new FootballClub("Arsenal              ",3, "\u001B[38;2;247;128;131m"));
        league.add(new FootballClub("Aston Villa          ",4, "\u001B[38;2;179;134;154m"));
        league.add(new FootballClub("Benfica              ", 5,"\u001B[38;2;243;127;127m"));
        league.add(new FootballClub("Barca                ",6, "\u001B[38;2;127;166;203m"));
        league.add(new FootballClub("Bayern Munich        ",7, "\u001B[38;2;237;130;150m"));
        league.add(new FootballClub("Copenhagen           ",8, "\u001B[38;2;127;151;181m"));
        league.add(new FootballClub("Chelsea              ",9, "\u001B[38;2;129;162;201m"));
        league.add(new FootballClub("Como                ",10, "\u001B[38;2;127;164;200m"));
        league.add(new FootballClub("Dynamo Kyiv         ",11, ""));
        league.add(new FootballClub("Deportivo La Corunia",12, "\u001B[38;2;127;173;212m"));
        league.add(new FootballClub("LNZ                 ",13, ""));
        league.add(new FootballClub("Manchester United   ",14, "\u001B[38;2;242;127;145m"));
        league.add(new FootballClub("Monaco              ",15, "\u001B[38;2;242;127;145m"));
        league.add(new FootballClub("Polissya            ",16,""));
        league.add(new FootballClub("Stoke City          ",17, "\u001B[38;2;239;139;150m"));
        league.add(new FootballClub("Shakhtar Donieck    ",18, "\u001B[38;2;255;179;143m"));
        league.add(new FootballClub("Tottenham           ",19, "\u001B[38;2;137;144;171m"));
        league.add(new FootballClub("Wolves              ",20, "\u001B[38;2;254;220;137m"));
        StartMenu();
    }
}