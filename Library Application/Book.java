import java.util.*;
public class Book {

    private String title;
    private String author;
    private String genre;
    private int yearPublished;

    public Book(String title, String author, String genre, int yearPublished){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Year: " + yearPublished;
    }
}
