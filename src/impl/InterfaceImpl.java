package impl;

import classes.Footballer;
import classes.Team;
import enums.Country;
import enums.Status;
import service.Findable;
import service.SortAble;
import service.TeamCreateInterface;

import java.util.*;

public class InterfaceImpl implements TeamCreateInterface, Findable, SortAble {

    ArrayList<Team> creatingTeam = new ArrayList<>();

    @Override
    public void findSmallestPlayer(List<Footballer> footballers) {
        System.out.println("The smallest footballer is " + Collections.min(footballers, footballerComparator));
        footballers.sort(footballerComparator);

    }

    Comparator<Footballer> footballerComparator = new Comparator<Footballer>() {
        @Override
        public int compare(Footballer o1, Footballer o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    @Override
    public void findExpensivePlayer(List<Footballer> footballers) {
        System.out.println("The expensive footballer is " + Collections.max(footballers, footballerCompare));
        footballers.sort(footballerCompare);

    }

    Comparator<Footballer> footballerCompare = new Comparator<Footballer>() {
        @Override
        public int compare(Footballer o1, Footballer o2) {
            return o1.getSalary() - o2.getSalary();
        }
    };

    @Override
    public void findStrongPlayer(List<Footballer> footballers) {
        for (Footballer footballer : footballers) {
            if (footballer.getBodyMassIndex() <= 18.19) {
                System.out.println("The Strong footballer is " + footballer);
            }

        }

    }

    @Override
    public void sortByStatus(List<Footballer>footballers) {
        int i =0;
        List<Footballer> forwardPlayers = new ArrayList<>();
        List<Footballer> goalKeeper = new ArrayList<>();
        List<Footballer> defenderPlayers = new ArrayList<>();
        List<Footballer> midfielderPlayers = new ArrayList<>();
        List<Footballer> captainOfTeam = new ArrayList<>();
        for (Footballer footballer : footballers) {
            if (footballer.getStatus().equals(Status.FORWARD)) {
                forwardPlayers.add(footballer);
                System.out.println("Forward players are " + forwardPlayers);
            }
            if (footballer.getStatus().equals(Status.GOAL_KEEPER)) {
                goalKeeper.add(footballer);
                System.out.println("Goal keepers  are " + goalKeeper);
            }
            if (footballers.get(i).getStatus().equals(Status.MIDFIELDER)) {
                defenderPlayers.add(footballer);
                System.out.println("Defender players are " +defenderPlayers );
            }
            if (footballers.get(i).getStatus().equals(Status.MIDFIELDER)) {
                midfielderPlayers.add(footballer);
                System.out.println("Midfielder players are " + midfielderPlayers);
            }
            if (footballers.get(i).getStatus().equals(Status.CAPTAINS)) {
                captainOfTeam.add(footballer);
                System.out.println("Captain of team  " + captainOfTeam);
            }

        }
    }



    @Override
    public String crateTeam(List<Team>teams) {
         this.creatingTeam.addAll(teams);
         return "Successful created";
    }



    @Override
    public void movingPlayer(List<Footballer> footballers) {
        for (Footballer footballer : footballers) {
            Collections.shuffle(footballers);
            System.out.println(footballers);
        }

    }

    @Override
    public void replacePlayer(List<Footballer> footballers, int number) {
        Scanner scanner=new Scanner(System.in);
        List<Footballer> replacePlayer = new ArrayList<>();
        for (Footballer footballer : footballers) {
            if(footballer.getNumberOfPlayer()==number){
            Collections.swap(footballers, number, scanner.nextInt());
            System.out.println(replacePlayer);
            }

        }
    }

    @Override
    public void buyPlayerFromOtherTeam(String nameOfTeam,List<Team>teams,String nameOfFootballer,List<Footballer> footballers ,String name) {
        for (Team team1 : teams) {
            if (team1.getName().equals(nameOfTeam)) {
                for (Footballer footballer : footballers) {
                    if (footballer.getFullName().equals(nameOfFootballer)) {
                        for (Team team : teams) {
                            if (team.getBudget() >= footballer.getSalary()) {
                                team.getFootballers().add(footballer);
                                int money = team1.getBudget() - footballer.getSalary();
                                team1.setBudget(money);
                                team.setBudget(team.getBudget() + money);
                                team.getFootballers().remove(footballer);
                            } else {
                                System.out.println("You haven't enough money");
                            }
                        }
                    }
                }
            }
        }
    }


    @Override
    public List<Team> getAll() {
        return this.creatingTeam;
    }

    @Override
    public StringBuilder infoAboutTeam(List<Team> teams, List<Footballer> footballers) {
        StringBuilder stringBuilder = new StringBuilder("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Feedback about team~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        int counter = 0;
        int i=0;
        int money=0;
        for (Team team : teams) {
            for (Footballer footballer : footballers) {
                if (team.getFootballers().contains(footballers.get(i))) {
                  // stringBuilder.append(footballers.get(i).getSalary());
                    counter ++;
                    money+=footballer.getSalary();

                }

            }
            team.setBudget(team.getBudget()-money);
            }

        counter += (counter * 5 / 100);
        return stringBuilder.append("\nTax for buying the player 5% \n\nYour team successful filled with new player ").append("\nYour budget : ").append(counter).append( " сом");
        }
    }

