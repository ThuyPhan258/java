package study.lesson6;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse(String name, double speed){
        super(name, speed);
    }
    @Override
    public double getSpeed() {
        // TODO Auto-generated method stub
        return new SecureRandom().nextInt(75);
    }
}
