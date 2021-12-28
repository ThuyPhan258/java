package study.lesson6;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Horse horse = new Horse("Horse", new SecureRandom().nextInt(75), true);
        Tiger tiger = new Tiger("Tiger", new SecureRandom().nextInt(100), false);
        Dog dog = new Dog("Dog", new SecureRandom().nextInt(60), true);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);
        double maxSpeed = dog.getSpeed();
        String win = null;

        for(Animal animal: animalList){
            if(maxSpeed < animal.getSpeed()){
                maxSpeed = animal.getSpeed();
                win = animal.getName();
            }
        }
        System.out.printf("Max speed racing: %f%n", maxSpeed);
        System.out.printf("Winer is: %s%n", win);
        
    }
}
