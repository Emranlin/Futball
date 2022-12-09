package service;

import classes.Footballer;
import classes.Team;
import enums.Country;

import java.util.List;

public interface SortAble {
    void sortByStatus(List<Footballer>footballers);
    StringBuilder infoAboutTeam (List<Team> teams, List<Footballer> footballers);




}
