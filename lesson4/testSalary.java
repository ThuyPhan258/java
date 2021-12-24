package lesson4;

public class testSalary {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        ceo.setSalary(200000);
        manager.setSalary(100000);
        employee1.setSalary(50000);
        employee2.setSalary(60000);
        System.out.printf("ceo year salary: %.2f%n", ceo.getSalary());
        System.out.printf("manager year salary: %.2f%n", manager.getSalary());
        System.out.printf("employee 1 year salary: %.2f%n", employee1.getSalary());
        System.out.printf("employee 2 year salary: %.2f%n", employee2.getSalary());
        

    }
}
