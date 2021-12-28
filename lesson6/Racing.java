package study.lesson6;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        Animal win = null;

        if(animalList.isEmpty())
            System.out.println("There is no animals!");
        for(Animal animal: animalList){
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
