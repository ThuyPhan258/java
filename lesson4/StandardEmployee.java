package study.lesson4;

public class StandardEmployee extends Employee{
    @Override
    public double getSalary() {
        // TODO Auto-generated method stub
        return 30000 + this.getSupportMoney();
    }

    public double getSupportMoney(){
        return 5000;
    }
}
