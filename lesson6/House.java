package study.lesson6;

public class House {
    private final String color;
    private final int mainDoor;
    private final String topRoof;

    private House(Builder builder){
        color = builder.color;
        mainDoor = builder.mainDoor;
        topRoof = builder.topRoof;
    }
    //customer service || Inner class 
    public static class Builder{
        private String color;
        private int mainDoor;
        private String topRoof;

        //dot notation
        public Builder whatColor(String color){
            this.color = color;
            return this;
        }

        public Builder howManyDoor(int mainDoor){
            this.mainDoor = mainDoor;
            return this;
        }

        public Builder whattopRoof(String topRoof){
            this.topRoof = topRoof;
            return this;
        }

        public House build(){
            return new House(this);
        }
              
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "House{"+ "color=" + color + "\n" + "mainDoor=" + mainDoor + "\n" 
                        + "topRoof=" + topRoof + "\n";
    }
}
