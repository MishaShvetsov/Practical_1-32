package Pr07andPr08;

public class Operator extends Employee implements EmployeePosition {

    public Operator(String name, String surname) {
        super(name, surname);
    }
    @Override
    public int getIncome() {
        return 0;
    }


    @Override
    public String getJobTitle() {
        return "operator";
    }

    @Override
    public double calcSalary(double fullIncome, double baseSalary) {
        return baseSalary;
    }
}