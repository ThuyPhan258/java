package lesson4;

public class CEO {
    private double salary;

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary() {
        double yearSalary = salary * 12;
        return yearSalary;
    }
}
