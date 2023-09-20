import java.util.*;
public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(BookPredicate predicate){
        ArrayList<Book> find = new ArrayList<>();
        books.stream().filter(predicate::test).forEach(e -> find.add(e));
        return find;
    }

    public void removeBooks(BookPredicate predicate){
       if(!books.removeIf(book -> predicate.test(book)))
       {
           System.out.println("The book is not found");
       }
    }

}
