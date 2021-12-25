package study.lesson4;

import java.util.ArrayList;
import java.util.List;

public class testSalary {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        StandardEmployee standardEmployee1 = new StandardEmployee();
        StandardEmployee standardEmployee2 = new StandardEmployee();


        double totalSalary = 0.0;
        testSalary testsalary = new testSalary();
        List<Employee> employees = new ArrayList<>();
        employees.add(ceo);
        employees.add(manager);
        employees.add(standardEmployee1);
        employees.add(standardEmployee2);

        totalSalary = testsalary.calculateSalaries(employees);
        System.out.printf("Total Salary: %f%n", totalSalary);
    }

    public double calculateSalaries(List<Employee> employees){
        double totalSalary = 0.0;

        for(Employee employee: employees){
            System.out.println(employee instanceof Employee);
            totalSalary+= employee.getSalary() + employee.getSupportMoney();
        }

        return totalSalary;
    }
}
