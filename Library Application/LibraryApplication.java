import java.util.*;

public class LibraryApplication {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("b1","a1","g1",1));
        library.addBook(new Book("b2","a2","g2",2));
        library.addBook(new Book("b3","a3","g3",3));
        library.addBook(new Book("b4","a4","g4",4));
        library.addBook(new Book("b2","a1","g5",1));

        //filter using author name
        Scanner authorObj = new Scanner(System.in);
        System.out.println("Enter author name : ");
        String author = authorObj.nextLine();
        System.out.println("Books from specific author");
        ArrayList<Book> authorBooks = library.getBooks(book -> book.getAuthor().equals(author));
        authorBooks.forEach(System.out::println);

        //filter using year
        Scanner yearObj = new Scanner(System.in);
        System.out.println("Enter year: ");
        String year = yearObj.nextLine();
        System.out.println("Books published after a given year");
        ArrayList<Book> yearPublishedBooks = library.getBooks(book -> book.getYearPublished() > Integer.parseInt(year));
        yearPublishedBooks.forEach(System.out::println);

        //filter using genre
        Scanner genreObj = new Scanner(System.in);
        System.out.println("Enter Genre");
        String genre = genreObj.nextLine();
        System.out.println("Books of a particular genre");
        ArrayList<Book> GenreBooks = library.getBooks(book -> book.getGenre().equals(genre));
        GenreBooks.forEach(System.out::println);

        //remove operation using author name
        Scanner removeBook = new Scanner(System.in);
        System.out.println("Enter author name: ");
        String remove = removeBook.nextLine();
        library.removeBooks(book -> book.getAuthor().equals(remove));

        System.out.println("Books after remove");
        library.getBooks(book -> true).forEach(System.out::println);

        }
    }
