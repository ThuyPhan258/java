package study.lesson6;

import java.lang.module.ModuleDescriptor.Builder;

public class Animal {
    // private final String name;
    private final int speed;
    private final boolean flyable;

    public Animal(Builder builder){
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    protected int getSpeed() {
        return this.speed; 
    }

    public boolean isFlyable() {
        return flyable;
    }
    //Inner class
    public static class Builder{
        private int speed;
        private boolean flyable;
    
        public Builder flyable(Boolean flyable){
            this.flyable = flyable;
            return this;
        }

        public Builder withSpeed(int speed){
            this.speed = speed;
            return null;
        }

        public Animal build(){
            return new Animal(this);
        }
        
    }
    // public Animal(){

    // }
    // public Animal(int speed){
    //     this.speed = speed;
    // }

    // public Animal(String name, double speed, boolean flyable) {
    //     this.name = name;
    //     this.speed = speed;
    //     this.flyable = flyable;
    // }

    // public String getName() {
    //     return name;
    // }

    
    
}    
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "Animal{" +
    //                 "name='" + name + '\'' +
    //                 ", speed=" + speed +
    //                 ", flyAble=" + flyable +
    //                 '}';
    // }
// }
