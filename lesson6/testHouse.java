package study.lesson6;
import static study.lesson6.House.Builder;

public class testHouse {
    public static void main(String[] args) {
        //Immutable object
        Builder builder = new Builder();
        House house = builder.whatColor("Black").howManyDoor(10).build();
        System.out.println(house);
    }
}
