package study.lesson9;

public class Tutorial01 implements CommonSlug{
    static String baseURL = "https://sdetpro.com";
    public static void printLesspm01(){
        System.out.println(baseURL + lesson1);
    }
    public static void printLesspm02(){
        System.out.println(baseURL + lesson2);
    }
    public static void main(String[] args) {
        Tutorial01.printLesspm01();
        Tutorial01.printLesspm02();
    }
    
}
