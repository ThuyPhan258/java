package study.lesson6;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger(String name, double speed, boolean flyable){
        super(name, speed, flyable);
    }
    @Override
    public double getSpeed() {
        // TODO Auto-generated method stub
        return new SecureRandom().nextInt(100);
    }
}
