package study.lesson6;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog(String name, double speed){
        super(name, speed);
    }
    @Override
    public double getSpeed() {
        // TODO Auto-generated method stub
        return new SecureRandom().nextInt(60);
    }
}
