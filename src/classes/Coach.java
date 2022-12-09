package classes;

import enums.Country;
import enums.Status;
import jdk.jshell.Snippet;

public class Coach {
    private String fullName;
    private Status status;
    private double salary;
    private Country country;

    public Coach(String fullName, Status status, double salary, Country country) {
        this.fullName = fullName;
        this.status = status;
        this.salary = salary;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "    Coach  " +
                "FullName  " + fullName + '\'' +
                "Status " + status +
                "Salary " + salary +
                "Country " + country
                ;
    }
}
