package study.lesson6;

import java.lang.module.ModuleDescriptor.Builder;

public class Animal {
    private final String name;
    private final double speed;
    private final boolean flyable;
    
    public Animal(Builder builder){
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public Animal(String name, double speed, boolean flyable) {
        this.name = name;
        this.speed = speed;
        this.flyable = flyable;
    }



    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed; 
    }

    public boolean isFlyable() {
        return flyable;
    }
    
    public static class Builder{
        private String name;
        private double speed;
        private boolean flyable;
    
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder speed(Double speed){
            this.speed = speed;
            return this;
        }
        public Builder flyable(boolean flyable){
            this.flyable = flyable;
            return this;
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Animal{" +
                    "name='" + name + '\'' +
                    ", speed=" + speed +
                    ", flyAble=" + flyable +
                    '}';
    }
}
