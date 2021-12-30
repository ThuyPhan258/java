package study.lesson9;

import java.net.SecureCacheResponse;
import java.security.SecureRandom;

public class Dog implements IAnimal, ISpeakable {
    int speed = 0;

    public Dog() {
        speed = new SecureRandom().nextInt(100);
    }

    @Override
    public boolean isflyable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean speakable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "DOG";
    }

    @Override
    public int speed() {
        // TODO Auto-generated method stub
        return speed;
    }
    
    
}
