package study.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flycontroler {
    private static boolean add;
    public static void perFormFlying(List<IAnimal> list){
        Dog dog = new Dog();
        Bird bird = new Bird();
        List animalList = new ArrayList<IAnimal>();
        animalList.add(dog);
        animalList.add(bird);

        for(Object oanimal : animalList){
           IAnimal animal = (IAnimal)oanimal;
            System.out.println("Animal: " + animal.name() + " with speed: " + animal.speed());
        }
        int max = 0;
        String winner = null;
        for(Object oanimal : animalList){
            IAnimal animal = (IAnimal)oanimal;
            if(animal.isflyable() == false){
                System.out.println("Checking Animal: " + animal.name() + " with speed: " + animal.speed());
                if(max < animal.speed()){
                    max = animal.speed();
                    winner = animal.name();
                }
            }
        }
        System.out.printf("Winner is "+ winner+" with speed %d", max);
    }
    public static void main(String[] args) {
        Flycontroler.perFormFlying(Arrays.asList(new Bird(), new Dog()));
    }
}
