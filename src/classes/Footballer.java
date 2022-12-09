package classes;

import enums.Country;
import enums.Status;

import java.time.LocalDate;

public class Footballer {
    private String fullName;
    private int age;
    private double bodyMassIndex;
    private Status status;
    private int numberOfPlayer;
    private int salary;

    public Footballer(String fullName, int age, double bodyMassIndex, Status status, int numberOfPlayer, int salary) {
        this.fullName = fullName;
        this.age = age;
        this.bodyMassIndex = bodyMassIndex;
        this.status = status;
        this.numberOfPlayer = numberOfPlayer;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public void setBodyMassIndex(double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nFootballer" +
                "\nFullName " + fullName +
                "\nAge " + age +
                "\nBodyMassIndex " + bodyMassIndex +
                "\nStatus " + status +
                "\nNumberOfPlayer " + numberOfPlayer +
                "\nSalary " + salary +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

}