package service;

import classes.Footballer;
import classes.Team;

import java.util.List;

public interface TeamCreateInterface {

   String crateTeam(List<Team>teams);
   void movingPlayer(List<Footballer>footballers);
   void replacePlayer(List<Footballer> footballers, int number);
   void buyPlayerFromOtherTeam(String nameOfTeam,List<Team> teams,String nameOfFootballer,List<Footballer> footballers , String name);
   List<Team> getAll();

}
