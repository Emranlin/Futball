import classes.Coach;
import classes.Footballer;
import classes.Team;
import enums.Country;
import enums.Status;
import impl.InterfaceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Coach coach1 = new Coach("Carlo Ancelotti", Status.COACH, 50000, Country.ITALY);
        Coach coach2 = new Coach("Xavier Hernandez", Status.COACH, 40000, Country.SPAIN);

        Footballer footballer1 = new Footballer("F Mendy", 25, 25.30, Status.DEFENDER, 1, 20000);
        Footballer footballer2 = new Footballer("Kareem Benzema", 30, 19.20, Status.CAPTAINS, 3, 50000);
        Footballer footballer3 = new Footballer("Modric", 32, 20.25, Status.FORWARD, 4, 20000);
        Footballer footballer4 = new Footballer("Hazard", 35, 18.19, Status.MIDFIELDER, 7, 60000);
        Footballer footballer5 = new Footballer("Benzema", 40, 30.28, Status.FORWARD, 12, 12000);
        Footballer footballer6 = new Footballer("Courtois", 18, 30.12, Status.GOAL_KEEPER, 11, 30000);
        Footballer footballer7 = new Footballer("Robert Levando", 17, 22.30, Status.DEFENDER, 16, 70000);
        Footballer footballer8 = new Footballer("Ansu Fatti", 33, 20.20, Status.CAPTAINS, 6, 80000);
        Footballer footballer9 = new Footballer("Samuel Umiti", 28, 28.30, Status.FORWARD, 8, 50000);
        Footballer footballer10 = new Footballer("Ferran Torez", 33, 19.20, Status.MIDFIELDER, 15, 60000);
        Footballer footballer11 = new Footballer("Memfis Depai", 36, 30.28, Status.FORWARD, 2, 9000);
        Footballer footballer12 = new Footballer("Inaki", 31, 30.12, Status.GOAL_KEEPER, 13, 30000);
        List<Footballer> footballers = new ArrayList<>(Arrays.asList(footballer1, footballer2, footballer3, footballer4, footballer5, footballer6, footballer7, footballer8, footballer9, footballer10, footballer11, footballer12));
        Team team1 = new Team("Real Madrid", coach1, new ArrayList<>(List.of(footballer1, footballer2, footballer3, footballer4, footballer5, footballer6)), 5000000);

        Team team2 = new Team("Barselona", coach2, new ArrayList<>(List.of(footballer7, footballer8, footballer8, footballer9, footballer10, footballer11)), 600000);
        ArrayList<Team> teams = new ArrayList<>(List.of(team1, team2));

        InterfaceImpl interfaceimpl = new InterfaceImpl();
        while (true) {
            byte sell = scanner.nextByte();
            switch (sell) {
                case 1 -> System.out.println(interfaceimpl.crateTeam(teams));
                case 2 -> interfaceimpl.movingPlayer(footballers);
                case 3 -> interfaceimpl.findSmallestPlayer(footballers);
                case 4 -> interfaceimpl.findExpensivePlayer(footballers);
                case 5 -> interfaceimpl.findStrongPlayer(footballers);
                case 6 -> {
                    System.out.println("Please input first number for replacing");
                    System.out.println("Please input second number for replacing");
                    interfaceimpl.replacePlayer(footballers, scanner.nextInt());
                }
                case 7 -> interfaceimpl.sortByStatus(footballers);
                case 8 -> System.out.println(interfaceimpl.getAll());
                case 9 -> {
                    System.out.println("Choose the team ");
                    String nameOfTeam = scanner.next();
                    System.out.println("Name of player");
                    String nameOfFootballer = scanner.next();
                    System.out.println("Choose the team");
                    String name = new Scanner(System.in).nextLine();
                    interfaceimpl.buyPlayerFromOtherTeam(nameOfTeam, teams , nameOfFootballer,footballers, name);

                }
                case 10 -> {
                    Scanner scanner3 = new Scanner(System.in);
                    List<String> buyPlayers = new ArrayList<>();
                    while (true) {

                        System.out.println("Will you still buy");
                        if (scanner.nextLine().trim().equals("YES")) {
                            String buying = scanner3.nextLine();
                            buyPlayers.add(buying);
                        } else {
                            System.out.println(interfaceimpl.infoAboutTeam(teams, footballers));
                            break;
                        }

                    }
                }
            }

        }
    }

    static {
        System.out.println("""
                1.Create the team
                2.Moving the Footballers
                3.The smallest player
                4.Expensive player
                5.Strong player
                6.Replace the players
                7.Sort by status
                8.Get all
                9.Buy new players
                10.Feedback about team
                                    
                """);
    }
}
