package Pr07andPr08;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    Random rand = new Random(getSeed());
    private double income = rand.nextInt(15000) + 115000;

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public int getIncome() {
        return (int) income;
    }


    @Override
    public String getJobTitle() {
        return "manager";
    }

    @Override
    public double calcSalary(double fullIncome, double baseSalary) {
        return baseSalary+0.05*income;
    }

}