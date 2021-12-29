package study.lesson6;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    private final static int TIGER_MAX_SPEED = 100;
    private final static int DOG_MAX_SPEED = 60;
    private final static int HORSE_MAX_SPEED = 75;
    public static void main(String[] args) {
        Animal dog = new Animal.Builder().flyable(false)
                    .withSpeed(new SecureRandom().nextInt(DOG_MAX_SPEED))
                    .build();
        Animal tiger = new Animal.Builder().flyable(false)
                    .withSpeed(new SecureRandom().nextInt(TIGER_MAX_SPEED))
                    .build();
        Animal horse = new Animal.Builder().flyable(false)
                    .withSpeed(new SecureRandom().nextInt(HORSE_MAX_SPEED))
                    .build();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(tiger);
        animalList.add(horse);
        
        List<Animal> applicableAnimals = new ArrayList<>();

        for(Animal animal: animalList){
            if(!animal.isFlyable())
                applicableAnimals.add(animal);
        }

        for(Animal animal: applicableAnimals){
            System.out.println("Animal: " + animal.getClass().getSimpleName() +", speed " + animal.getSpeed());
        }
        
        System.out.println("--------------");
        
        Animal win = null;
        for(Animal animal: applicableAnimals){
            if(win == null){
                win = animal;
            }
            else {
            if(animal.getSpeed() > win.getSpeed())
                win = animal;
            }
        }
        System.out.printf("The winner is: " + win.getClass().getSimpleName()+", with speed: " + win.getSpeed());
        // System.out.printf("Winer is: %s%n", win);
        
    }
}
