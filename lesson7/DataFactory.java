package study.lesson7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static boolean saveBookList(List<Book> books, String path) throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)){
                for(Book book: books){
                    String dataLine = book.getTitle() + ";" 
                                    + book.getISBN() + ";" + book.getAuthor();
                    bufferedWriter.write(dataLine);
                    bufferedWriter.newLine();
                }
                return true;
        } catch(Exception exception){
            exception.printStackTrace();
        }       
        return false;
    }
    
    public static List<Book> readBookList(String path){
        List<Book> books = new ArrayList<>();
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileInputStream = new FileInputStream(path);
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(inputStreamReader);

            String dataLine = bufferedReader.readLine();
            while(dataLine != null){
                String[] bookData = dataLine.split(";");
                String title = bookData[1];
                String ISBN = bookData[0];
                String author = bookData[2];

                books.add(new Book(ISBN, title, author));
                dataLine = bufferedReader.readLine();
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            if(fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            if(inputStreamReader != null)
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            if(bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
        return books;
    } 
    public static void main(String[] args) {
        String projectRootDirectory = System.getProperty("user.dir");
        System.out.println("Current project location: " + projectRootDirectory);
        List<Book> result = DataFactory.readBookList(projectRootDirectory + "/study/lesson7/book.txt");
        System.out.println(result);
    }
}
