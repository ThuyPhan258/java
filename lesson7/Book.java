package study.lesson7;

public class Book {
    private String ISBN;
    private String title;
    private String author;

    public Book(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Book {" + "ISBN=" + ISBN + "\n" +
                ", title " + title + "\n" +
                ", author " + author + "\n" + "}";
    }
}
