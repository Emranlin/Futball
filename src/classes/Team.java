package classes;

import enums.Country;

import java.util.List;

public class Team {
    private String name;
    private Coach coach;
    private List<Footballer> footballers;
    private int budget;

    public Team(String name, Coach coach, List<Footballer> footballers, int budget) {
        this.name = name;
        this.coach = coach;
        this.footballers = footballers;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Footballer> getFootballers() {
        return footballers;
    }

    public void setFootballers(List<Footballer> footballers) {
        this.footballers = footballers;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return " Team " +
                "\nName " + name +
                "\nCoach  " + coach +
                "\nFootballers " + footballers +
                "\nBudget " + budget +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}