package study.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    static List<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        boolean isContinuing = true;
        int retryCounter = 0;
        while(isContinuing){
            if(retryCounter == 3){
                System.out.println("Exceed retry time!");
                isContinuing = false;
                break;
            }
            System.out.println("------MENU---------");
            System.out.println("1. Add Book.");
            System.out.println("2. Retrieve book(ISBN).");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            switch(userOption){
                case 0:
                System.out.println("Bye!");
                isContinuing = false;
                break;
                case 1:
                addBook();
                case 2:
                retrieveBook();
                default:
                System.out.println("Wrong option!");
                retryCounter++;
            }
        }
    }
    private static void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ISBN:");
        String ISBN = scanner.nextLine();
        System.out.println("Book title:");
        String title = scanner.nextLine();
        System.out.println("Book's author:");
        String bookAuthor = scanner.nextLine();
        Book book = new Book(ISBN, title, bookAuthor);
        bookList.add(book);

    }
    public static void retrieveBook(){
        if(bookList.isEmpty()){
            System.out.println("Book list is empty.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ISBN:");
        String ISBN = scanner.nextLine();
        Book returnedBook = null;

        for(Book book: bookList){
            if(book.getISBN().equals(ISBN)){
                returnedBook = book;
                break;
            }
        }
        
    }

}
