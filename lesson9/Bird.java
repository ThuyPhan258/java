package study.lesson9;

import java.security.SecureRandom;

public class Bird implements IAnimal, ISpeakable {
    int speed = 0;

    public Bird() {
        speed = new SecureRandom().nextInt(160);
    }

    @Override
    public boolean speakable() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isflyable() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "BIRD";
    }

    @Override
    public int speed() {
        // TODO Auto-generated method stub
        return speed;
    }   
}
