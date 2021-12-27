package study.lesson6;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger(String name, double speed){
        super(name, speed);
    }
    @Override
    public double getSpeed() {
        // TODO Auto-generated method stub
        return new SecureRandom().nextInt(100);
    }
}
