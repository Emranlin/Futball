package service;

import classes.Footballer;

import java.util.List;

public interface Findable {
    void findSmallestPlayer(List<Footballer>footballers);
    void findExpensivePlayer(List<Footballer>footballers);
    void findStrongPlayer(List<Footballer>footballers);

}
