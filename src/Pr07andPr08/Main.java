package Pr07andPr08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees_to_hire = new Employee[280];
        Employee employee_to_hire_top_manager = new TopManager("Boris", "Sidorov");
        Employee employee_to_hire_operator = new Operator("Denis", "Petrov");
        Employee employee_to_hire_manager = new Manager("Dima", "Loonin");

        Company company = new Company(70000);

        for (int i = 0; i < employees_to_hire.length; i++) {
            if (i < 180) employees_to_hire[i] = employee_to_hire_operator;
            else if (i < 260) employees_to_hire[i] = employee_to_hire_manager;
            else if (i < 270) employees_to_hire[i] = employee_to_hire_top_manager;
        }
        company.hireAll(employees_to_hire);

        company.calcIncome();
        System.out.println("Full company income: " + company.getFullIncome());

        int emp_to_check = 1;
        System.out.println("\nEmployee " + emp_to_check + ": ");
        System.out.println("Position: " + company.getEmployeePosition(emp_to_check));
        System.out.println("Salary: " + company.getEmployeeSalary(emp_to_check, company.getFullIncome(), company.getBaseSalary()));
        System.out.println("Income: " + company.getEmployeeIncome(emp_to_check));

        System.out.println("\n");
        toStringSalary(company.salaryList());
        System.out.println("\nTop X salary list: ");
        toStringSalary(company.getTopSalaryStaff(15));
        System.out.println("\nLowest X salary list: ");
        toStringSalary((company.getLowestSalaryStaff(30)));

        for (int i = company.employees.length/2; i < company.employees.length; i++) {
            company.fire(i);
        }
        toStringSalary(company.salaryList());
        System.out.println("\nTop X salary list: ");
        toStringSalary(company.getTopSalaryStaff(15));
        System.out.println("\nLowest X salary list: ");
        toStringSalary((company.getLowestSalaryStaff(30)));
        company.calcIncome();
        System.out.println("Full company income: " + company.getFullIncome());
    }

    private static void toStringSalary(double[] salary) {
        for (int i = 0; i < salary.length; i++) {
            System.out.println((int) salary[i] + " руб.");
        }
    }
    private static void toStringStaff(Employee[] employees){
        System.out.println("Employee list: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i] + " ");
        }
    }
}